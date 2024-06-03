package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o Primeiro parâmetro: ");
        int parametroUm = scan.nextInt();
        System.out.print("Digite o Segundo parâmetro: ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro.");
        }
        scan.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior do que o primeiro parâmetro.");

        if (parametroDois == parametroUm) throw new ParametrosInvalidosException("Os parâmetros não podem ter o mesmo valor.");

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
