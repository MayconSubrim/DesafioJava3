//Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.


import java.util.Scanner;

public class Ex6{
    public static void main(String[] args){
        int acum = 0;
        Scanner read = new Scanner(System.in);
        String resposta = "S";
        do{
            System.out.println("Informe uma nota: ");
            double valor1 = read.nextDouble();
            System.out.println("Informe uma nota: ");
            double valor2 = read.nextDouble();
            System.out.println("A média é " + (valor1 + valor2)/2);
            System.out.println("Quer continuar a calcular a media? (S)/(N) ");
            resposta = read.next();
            if ((valor1+valor2)/2 >= 9.5){
                acum++;
            }
        }
        while(resposta.equals("S"));
        System.out.println("A quantidade de alunos aprovados e " + acum );
    }
}