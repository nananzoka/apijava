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
    private Long regiaoid;

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

    public Long getRegiaoid() {
        return regiaoid;
    }
    
    public void setRegiaoid(Long regiaoid) {
        if (regiaoid == null) {
            regiaoid = 0L;
        }
        this.regiaoid = regiaoid;
    }   
}