package modelo.entidade.nutricionista;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import modelo.entidade.consulta.Consulta;
import modelo.entidade.contato.Contato;
import modelo.entidade.endereco.Endereco;
import modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "nutricionista")
public class Nutricionista extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nutricionista")
	private List<Consulta> consultas;

	public Nutricionista() {
	}

	public Nutricionista(long id, String nome, String sobrenome, String cpf, long idade, String login, String senha, Contato contato, Endereco endereco) {

		super(nome, sobrenome, cpf, idade, login, senha, contato, endereco);

	}
	
	
	public Nutricionista(String nome, String sobrenome, String cpf, long idade, String login, String senha) {

		super(nome, sobrenome, cpf, idade, login, senha);

	}

	public Nutricionista(Long Id) {
		setId(Id);

	}

	public Nutricionista(String nome, String sobrenome, String cpf, int idade, String login, String senha, List<Consulta> consultas, Contato contato, Endereco endereco) {

		super(nome, sobrenome, cpf, idade, login, senha, contato, endereco);
		setConsultas(consultas);

	}


	public Nutricionista(Long Id, List<Consulta> consultas) {
		super(Id);
		setConsultas(consultas);

	}

	public Nutricionista(String nome) {
		super(nome);
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

}
