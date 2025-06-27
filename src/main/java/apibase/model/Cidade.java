package apibase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // DEFINE A TABELA NO BANCO DE DADOS
@Table(name = "Cidade")

public class Cidade {
    private Long id;
    private String nome;
    private double estado;
    private double codigo_ibge;
    private int populacao;
    private String regiao_id;


    //id SERIAL PRIMARY KEY,
    //;nome VARCHAR(100) NOT NULL,
    //estado VARCHAR(2) NOT NULL,-- SIGLA
    //codigo_ibge INTEGER,
    //populacao INTEGER,
    //regiao_id INTEGER REFERENCES regioes(id)


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
    public double getEstado() {
        return estado;
    }
    public void setEstado(double estado) {
        this.estado = estado;
    }
    public double getCodigo_ibge() {
        return codigo_ibge;
    }
    public void setCodigo_ibge(double codigo_ibge) {
        this.codigo_ibge = codigo_ibge;
    }
    public int getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    public String getRegiao_id() {
        return regiao_id;
    }
    public void setRegiao_id(String regiao_id) {
        this.regiao_id = regiao_id;
    }
    // comando vscode pra gerar
    // botao direito mouse e source action e getters e setters
}