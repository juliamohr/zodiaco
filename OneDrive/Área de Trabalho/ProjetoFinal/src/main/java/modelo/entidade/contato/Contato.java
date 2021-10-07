package modelo.entidade.contato;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;
import modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "contatos")
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contato")
	private Long Id;

	@Column(name = "email_contatos", length = 40, nullable = false, unique = true)
	private String email;

	@Column(name = "telefone_contatos", length = 14, nullable = false, unique = true)
	private String telefone;

	@Column(name = "celular_contatos", length = 15, nullable = false, unique = true)
	private String celular;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Contato() {
	}

	public Contato(Long id, String email, String telefone, String celular, Usuario usuario) {

		setId(id);
		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);
	}

	public Contato(String email, String telefone, String celular, Usuario usuario) {

		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);
		setUsuario(usuario);
		
	}

	public Contato(Long id) {

		setId(id);

	}

	public Contato(String email, String telefone, String celular, Paciente paciente) {

		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);
	}

	public Contato(String email, String telefone, String celular) {

		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
