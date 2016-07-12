package br.ufc.trabalho_final_web.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name="SECAO")
public class Secao {
	
	@Id
	@Column(name="ID_SECAO", nullable=false)
	@SequenceGenerator(name="generator_secao", sequenceName="sequencia_secao")
	@GeneratedValue(generator="generator_secao")
	private Long id;
	
	@Column(name="TITULO", nullable=false)
	private String titulo;
	
	@Column(name="DESCRICAO", nullable=false )
	private String descricao;
	
	@OneToMany(mappedBy="secao", targetEntity=Noticia.class,fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Noticia> noticias;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}
	
	
	
}