package br.ufc.trabalho_final_web.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity(name="PAPEL")
public class Papel {
	
	@Id
	@Column(name="ID_PAPEL", nullable=false)
	@SequenceGenerator(name="generator_papel", sequenceName="sequencia_papel")
	@GeneratedValue(generator="generator_papel")
	private Long id;
	@Column(name="PAPEL", nullable=false)
	private String papel;
	
	@ManyToMany(mappedBy="papeis", fetch=FetchType.LAZY)
	private List<Usuario> usuarios;
		
	public Papel(String papel) {
		this.papel = papel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Papel(){}

	public Papel(Long id, String papel, List<Usuario> usuarios) {
		super();
		this.id = id;
		this.papel = papel;
		this.usuarios = usuarios;
	}	
}