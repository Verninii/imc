package aula2;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Qual a sua altura");
        double altura = leitor.nextDouble();

        double imc = peso/(altura * altura);
        System.out.println("O seu imc é: " + imc);

        if (imc < 18.5){
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Peso ideal (Parabéns)");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }
    }

}
