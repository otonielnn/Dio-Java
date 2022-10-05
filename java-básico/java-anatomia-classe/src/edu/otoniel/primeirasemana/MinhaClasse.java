package edu.otoniel.primeirasemana;
// Nomeclatura da classe: Sempre usar PascalCase
public class MinhaClasse {
    public static void main (String [] args) {
        //Nomeclatura da variavel: sempre usar camelCase (apenas pode começar com letras, $ ou _)
        String primeiroNome = "Otoniel";
        String segundoNome = "Júnior";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        int idade = 20;
        boolean verdadeira = true;
        idade = 21;

        //Nomeclatura da Constante: UpperCase
        final String BR = "Brasil";
        System.out.println("Olá "+nomeCompleto+", Sejam Bem-Vindos ao "+BR);
        System.out.println("Você tem "+idade+" anos");
    }

    //Nomeclatura do metodo: usar camelCase
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
