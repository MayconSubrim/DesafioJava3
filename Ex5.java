//Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

import java.util.Scanner;

public class Ex5{
    public static void main(String [] args){
        int acum = 0;
        int contador = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um numero");
        int valor1 = read.nextInt();
        System.out.println("Informe um segundo numero");
        int valor2 = read.nextInt();
        while(valor1 <= valor2){
            acum += valor1;
            valor1++;
            contador ++; 
        }

        System.out.println("O resultado é " + (acum / contador));
    }
}