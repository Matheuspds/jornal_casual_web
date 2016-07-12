package br.ufc.trabalho_final_web.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;
import javax.persistence.SequenceGenerator;

@Entity(name="USUARIO")
public class Usuario {
	
	@Id
	@Column(name="ID_USUARIO", nullable=false)
	@SequenceGenerator(name="generator_usuario", sequenceName="sequencia_usuario")
	@GeneratedValue(generator="generator_usuario")
	private Long id;
	
	@Column(name="LOGIN", nullable=false)
	private String login;
	@Column(name="SENHA", nullable=false)
	private String senha;
	@Column(name="NOME", nullable=false)
	private String nome;
	@Column(name="EMAIL", nullable=false)
	private String email;
	@Column(name="ATIVO")
	private Boolean ativo;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="USUARIO_PAPEL",joinColumns= @JoinColumn(name="ID_USUARIO", referencedColumnName="ID_USUARIO"),inverseJoinColumns=@JoinColumn(name="ID_PAPEL", referencedColumnName="ID_PAPEL"))
	private List<Papel> papeis;
	
	@OneToMany(mappedBy="usuario",targetEntity=Noticia.class,fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Noticia> noticias;
	
	@OneToMany(mappedBy="usuario", targetEntity=Classificado.class,fetch=FetchType.LAZY)
	private List<Classificado> classificados;
	
	@OneToMany(mappedBy="usuario",targetEntity=Comentario.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Comentario> comentarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	public List<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}

	public List<Classificado> getClassificados() {
		return classificados;
	}

	public void setClassificados(List<Classificado> classificados) {
		this.classificados = classificados;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@PreRemove
    public void preRemove(){
        for(Classificado c : classificados){
            c.setUsuario(null);
        }
    }
	
}