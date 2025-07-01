package apibase.model;
    
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Regiao")
public class Regiao {
    
    private Long id;
    private String descricao;
    @Id // CHAVE PRIMARIA
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
        
}