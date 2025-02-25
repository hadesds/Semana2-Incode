package AtividadeFor;

import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //erroooooo
        System.out.println("digite: ");
        int limite = entrada.nextInt();

        for (int contador = 1; contador <= limite; contador++) {
//            System.out.println(contador);
            System.out.println("A soma de todos os numeros até "
                    + limite + " é " + contador);
        }
    }
}
