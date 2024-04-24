public class SistemaMedida {
    public static void main(String[] args) {
        String medida = "M";

        switch (medida) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Medio");
                break;
        
            default:
                System.out.println("Tamanho não definido");
                break;
        }
    }
}
