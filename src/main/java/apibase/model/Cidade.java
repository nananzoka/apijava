package apibase.model;
    
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cidade")
public class Cidade {
    
    private Long id;
    private String descricao;
    private String uf;
    private Long regiao_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return this.id != null ? this.id : 0L;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getRegiao_id() {
        return regiao_id;
    }

    public void setRegiao_id(Long regiao_id) {
        if (regiao_id == null) {
            regiao_id = 0L;
        }
        this.regiao_id = regiao_id;
    }   
}