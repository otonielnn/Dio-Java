package array;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println(vetor.length);

        System.out.print("Vetor na ordem Crescente: ");
        for(int i = 0; i < (vetor.length); i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.print("\nVetor na ordem Decrescente: ");
        for(int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
