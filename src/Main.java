import java.util.Scanner;

public class Main {
    public  static void  main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Quantos alunos deseja cadastrar: ");

        int quantidade = scanner.nextInt();

        Aluno [] alunos = new Aluno[quantidade];
        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite o nome do Aluno: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.println("Quantas notas o Aluno tera: ");
            int quantidadedeNotas = scanner.nextInt();
            double[] notas = new double[quantidadedeNotas];
           for ( int j = 0; j < quantidadedeNotas; j++){
               System.out.println("Digite as notas do aluno: " + (j + 1) + ":");
               notas[j] = scanner.nextDouble();

               while (notas[j] <0 || notas[j] >10){
                   System.out.println("Notas invalidas! A nota tem que ser entre 0 a 10. ");
                    notas[j] = scanner.nextDouble();

               }
           }
           alunos[i] = new Aluno(nome,notas);
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Média: " + alunos[i].calcularMedia());
            for (int j = 0; j < alunos[i].getNotas().length; j++) {
                System.out.println(alunos[i].getNotas()[j]);
            }

        }
    }
}