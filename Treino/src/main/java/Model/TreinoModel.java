package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TreinoModel {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private Integer duracao;
	    private String descricao;
	    private Boolean ativo;
		
	    
	    public Long getId() {
			return id;
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
		public Integer getDuracao() {
			return duracao;
		}
		public void setDuracao(Integer duracao) {
			this.duracao = duracao;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Boolean getAtivo() {
			return ativo;
		}
		public void setAtivo(Boolean ativo) {
			this.ativo = ativo;
		}
	    
	    
}

