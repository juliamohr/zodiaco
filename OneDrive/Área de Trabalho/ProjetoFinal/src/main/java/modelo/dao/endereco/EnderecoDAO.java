package modelo.dao.endereco;

import java.util.List;

import modelo.entidade.endereco.Endereco;

public interface EnderecoDAO {

	public Endereco inserirEndereco(Endereco endereco);

	public void deletarEndereco(Endereco endereco);

	public void atualizarEndereco(Endereco endereco);

	Endereco recuperarEndereco(Endereco endereco);

	List<Endereco> recuperarEnderecos();

}
