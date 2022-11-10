import java.util.Scanner;


public class Ex1{
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Informe um numero");
    int valor1 = read.nextInt();
    System.out.println("Informe o segundo numero");
    int valor2 = read.nextInt();
    while(valor2 <= 0){
        System.out.println("O numero não pode ser negativo ou zero");
        System.out.println("Informe o segundo numero");
        valor2 = read.nextInt();
    }
    System.out.println("O resultado da divisao e " + (valor1 / valor2));
  }
}