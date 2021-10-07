package modelo.dao.consulta;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import modelo.entidade.consulta.Consulta;
import modelo.factory.conexao.ConexaoFactory;

public class ConsultaDAOimpl implements ConsultaDAO {

	private ConexaoFactory fabrica;

	public ConsultaDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public Consulta inserirConsulta(Consulta consulta) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(consulta);

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
		return consulta;
	}

	public void deletarConsulta(Consulta consulta) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(consulta);

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

	public void atualizarConsulta(Consulta consulta) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(consulta);

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

	public Consulta recuperarConsulta(Consulta consulta) {

		Session sessao = null;
		Consulta consultaRecuperado = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Consulta> criteria = construtor.createQuery(Consulta.class);
			Root<Consulta> raizConsulta = criteria.from(Consulta.class);

			criteria.select(raizConsulta);

			ParameterExpression<Long> idConsulta = construtor.parameter(Long.class);
			criteria.where(construtor.equal(raizConsulta.get("id_consulta"), idConsulta));

			consultaRecuperado = sessao.createQuery(criteria).setParameter(idConsulta, consulta.getId())
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

		return consultaRecuperado;
	}

	public List<Consulta> recuperarConsultas() {

		Session sessao = null;
		List<Consulta> contatos = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Consulta> criteria = construtor.createQuery(Consulta.class);
			Root<Consulta> raizConsulta = criteria.from(Consulta.class);

			criteria.select(raizConsulta);

			contatos = sessao.createQuery(criteria).getResultList();

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

		return contatos;
	}

}
