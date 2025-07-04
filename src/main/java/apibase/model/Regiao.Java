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
    public Object getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
    public void setNome(Object nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }
    public Object getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }
    public void setEstado(Object estado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEstado'");
    }
    public Object getMeta_vendas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMeta_vendas'");
    }
    public void setMeta_vendas(Object meta_vendas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMeta_vendas'");
    }
    public Object getResponsavel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResponsavel'");
    }
    public void setResponsavel(Object responsavel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setResponsavel'");
    }
        
}