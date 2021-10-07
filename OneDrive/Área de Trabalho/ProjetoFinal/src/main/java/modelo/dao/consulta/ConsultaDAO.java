package modelo.dao.consulta;

import java.util.List;

import modelo.entidade.consulta.Consulta;

public interface ConsultaDAO {

	public Consulta inserirConsulta(Consulta consulta);

	public void deletarConsulta(Consulta consulta);

	public void atualizarConsulta(Consulta consulta);

	Consulta recuperarConsulta(Consulta consulta);

	List<Consulta> recuperarConsultas();

}
