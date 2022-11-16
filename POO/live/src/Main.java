public class Main {
    public static void main(String[] args) {
        Endereco enderecoRestauranteOtoniel = new Endereco();

        Endereco enderecoRestauranteOtoniel2 = new Endereco("123456", "Endereço Restaurante Otoniel");
        Endereco enderecoRestauranteJoão = new Endereco("654321", "Endereço Restaurante do João");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante do Otoniel");
        restaurante.setCnpj("000.000.0001-11");
        restaurante.setEndereco(enderecoRestauranteOtoniel2);
        System.out.println(restaurante);


        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante do João");
        restaurante2.setCnpj("000.000.0001-12");
        restaurante2.setEndereco(enderecoRestauranteJoão);
        System.out.println(restaurante2);

    }
}
