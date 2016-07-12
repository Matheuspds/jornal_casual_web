package br.ufc.trabalho_final_web.model;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity(name="NOTICIA")
public class Noticia {
	
	@Id
	@Column(name="ID_NOTICIA", nullable=false)
	@SequenceGenerator(name="generator_noticia", sequenceName="sequencia_noticia")
	@GeneratedValue(generator="generator_noticia")
	private Long id;
	@Column(name="TITULO", nullable=false)
    private String titulo;
	@Column(name="SUBTITULO", nullable=false)
    private String subtitulo;
	@Column(name="TEXTO", nullable=false,columnDefinition="TEXT")
    private String texto;
	@Column(name="ID_AUTOR", nullable=false,insertable=false, updatable=false)
    private Integer id_autor;
    @Column(name="DATA_NOTICIA",nullable=false)
	@Temporal(TemporalType.DATE)
    private Date data_noticia;
   
    @Column(name="ID_SECAO", nullable=false,insertable=false, updatable=false)
    private Integer id_secao;
    @Column(name="ATIVA")
    private Boolean ativa;
    
    @ManyToOne(optional=false, cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="ID_AUTOR", referencedColumnName="ID_USUARIO")
    @Fetch(FetchMode.JOIN)
    private Usuario usuario;
    
    @OneToMany(mappedBy="noticia",targetEntity=Comentario.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Comentario> comentarios;
    
    @ManyToOne(optional=false)
	@JoinColumn(name="ID_SECAO", referencedColumnName="ID_SECAO")
    private Secao secao;

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

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getId_autor() {
		return id_autor;
	}

	public void setId_autor(Integer id_autor) {
		this.id_autor = id_autor;
	}

	public Date getData_noticia() {
		return data_noticia;
	}

	public void setData_noticia(Date data_noticia) {
		this.data_noticia = data_noticia;
	}

	public Integer getId_secao() {
		return id_secao;
	}

	public void setId_secao(Integer id_secao) {
		this.id_secao = id_secao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	public Boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Noticia))
			return false;
		Noticia n = (Noticia)obj;
		if(n.getId() == this.getId())
			return true;
		return false;
	}
}