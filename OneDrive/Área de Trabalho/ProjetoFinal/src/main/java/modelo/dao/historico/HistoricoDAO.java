package modelo.dao.historico;

import java.util.List;

import modelo.entidade.historico.Historico;

public interface HistoricoDAO {

	void inserirHistorico(Historico historico);

	void deletarHistorico(Historico historico);

	public void atualizarHistorico(Historico historico);

	Historico recuperarHistorico(Historico historico);

	List<Historico> recuperarHistoricos();

}
