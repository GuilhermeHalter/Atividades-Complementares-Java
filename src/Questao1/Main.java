/*Printar numeros em um intervalo de A a B*/
package Questao1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        Valores valores = new Valores(a, b);

        for(int x = valores.A; x <= valores.B; x++) {
            System.out.println(x);
        }

    }
}
