package apibase.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity // DEFINE A TABELA NO BANCO DE DADOS
@Table(name = "Vendedor")
public class Vendedor {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private int telefone;
    private double comissao_percentual;
    private double regiao_id;
   //id SERIAL PRIMARY KEY,
    //nome VARCHAR(100) NOT NULL,
    //cpf VARCHAR(11) NOT NULL,
    //email VARCHAR(100),
    //telefone VARCHAR(20),
    //comissao_percentual DECIMAL(5, 2),
    //regiao_id INTEGER REFERENCES regiao(id)
    @Id // CHAVE PRIMARIA
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id != null ? this.id : 0L;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public double getComissao_percentual() {
        return comissao_percentual;
    }
    public void setComissao_percentual(double comissao_percentual) {
        this.comissao_percentual = comissao_percentual;
    }
    public double getRegiao_id() {
        return regiao_id;
    }
    public void setRegiao_id(double regiao_id) {
        this.regiao_id = regiao_id;
    }
}