package apibase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // DEFINE A TABELA NO BANCO DE DADOS
@Table(name = "Produto")

public class Produto {
    private Long id;
    private String descricao;
    private double precocusto;
    private double precovenda;
    private int estoque;
    private String unidade;


    // descricao VARCHAR(200) NOT NULL,
    // precocusto DECIMAL(10, 2),
    // precovenda DECIMAL(10, 2) NOT NULL,
    // estoque INTEGER DEFAULT 0,
    // unidade VARCHAR(10)


    @Id // CHAVE PRIMARIA
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id != null ? this.id : 0L;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPrecocusto() {
        return precocusto;
    }
    public void setPrecocusto(double precocusto) {
        this.precocusto = precocusto;
    }
    public double getPrecovenda() {
        return precovenda;
    }
    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    // comando vscode pra gerar
    // botao direito mouse e source action e getters e setters
}