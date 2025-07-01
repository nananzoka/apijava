package apibase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // DEFINE A TABELA NO BANCO DE DADOS
@Table(name = "Regiao")

public class Regiao {
    private Long id;
    private String nome;
    private String descricao;
    private double estado;
    private int meta_vendas;
    private String responsavel;


    //id SERIAL PRIMARY KEY,
    //nome VARCHAR(100) NOT NULL,
    //descricao TEXT,
    //estado VARCHAR(2),
    //meta_vendas DECIMAL(12, 2),
    //responsavel VARCHAR(100)


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
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getEstado() {
        return estado;
    }
    public void setEstado(double estado) {
        this.estado = estado;
    }
    public int getMeta_vendas() {
        return meta_vendas;
    }
    public void setMeta_vendas(int meta_vendas) {
        this.meta_vendas = meta_vendas;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    // comando vscode pra gerar
    // botao direito mouse e source action e getters e setters
}