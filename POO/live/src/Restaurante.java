import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private long id;
    private String nomeFantasia;
    private String cnpj;
    private List<Produtos> catalogo = new ArrayList<>();
    private Endereco endereco;

    public void setId(long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
        "id=" + id +
        ", nomeFantasia='" + nomeFantasia + '\'' +
        ", cnpj='" + cnpj + '\'' +
        ", catalogo" + catalogo +
        ", endereco=" + endereco +
        '}'; 
    }
}
