package modelo.dao.historico;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import modelo.entidade.historico.Historico;
import modelo.factory.conexao.ConexaoFactory;

public class HistoricoDAOImpl implements HistoricoDAO {

	private ConexaoFactory fabrica;

	public HistoricoDAOImpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirHistorico(Historico historico) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(historico);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public void deletarHistorico(Historico historico) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(historico);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public void atualizarHistorico(Historico historico) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public Historico recuperarHistorico(Historico historico) {

		Session sessao = null;
		Historico historicoRecuperado = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Historico> criteria = construtor.createQuery(Historico.class);
			Root<Historico> raizHistorico = criteria.from(Historico.class);

			criteria.select(raizHistorico);

			ParameterExpression<Long> idHistorico = construtor.parameter(Long.class);
			criteria.where(construtor.equal(raizHistorico.get("id"), idHistorico));

			historicoRecuperado = sessao.createQuery(criteria).setParameter(idHistorico, historico.getId())
					.getSingleResult();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return historicoRecuperado;
	}

	public List<Historico> recuperarHistoricos() {

		Session sessao = null;
		List<Historico> historicos = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Historico> criteria = construtor.createQuery(Historico.class);
			Root<Historico> raizHistorico = criteria.from(Historico.class);

			criteria.select(raizHistorico);

			historicos = sessao.createQuery(criteria).getResultList();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return historicos;
	}
}
