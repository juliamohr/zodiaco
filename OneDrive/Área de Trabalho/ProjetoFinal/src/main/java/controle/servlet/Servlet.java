package controle.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.consulta.ConsultaDAO;
import modelo.dao.consulta.ConsultaDAOimpl;
import modelo.dao.contato.ContatoDAO;
import modelo.dao.contato.ContatoDAOimpl;
import modelo.dao.endereco.EnderecoDAO;
import modelo.dao.endereco.EnderecoDAOimpl;
import modelo.dao.historico.HistoricoDAO;
import modelo.dao.historico.HistoricoDAOImpl;
import modelo.dao.nutricionista.NutricionistaDAO;
import modelo.dao.nutricionista.NutricionistaDAOimpl;
import modelo.dao.paciente.PacienteDAO;
import modelo.dao.paciente.PacienteDAOimpl;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOimpl;
import modelo.entidade.consulta.Consulta;
import modelo.entidade.contato.Contato;
import modelo.entidade.endereco.Endereco;
import modelo.entidade.historico.Historico;
import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;

@WebServlet("/")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private PacienteDAO daoPaciente;
	private NutricionistaDAO daoNutricionista;
	private EnderecoDAO daoEndereço;
	private ConsultaDAO daoConsulta;
	private HistoricoDAO daoHistorico;
	private ContatoDAO daoContato;
	private UsuarioDAO daoUsuario;

	public void init() {

		daoPaciente = new PacienteDAOimpl();
		daoNutricionista = new NutricionistaDAOimpl();
		daoEndereço = new EnderecoDAOimpl();
		daoConsulta = new ConsultaDAOimpl();
		daoHistorico = new HistoricoDAOImpl();
		daoContato = new ContatoDAOimpl();
		daoUsuario = new UsuarioDAOimpl();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		doGet(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {

			switch (action) {

			case "/listarNutricionista":
				listarNutricionista(request, response);

			case "/listarPaciente":
				listarPaciente(request, response);
	
				
			case "/perfilPaciente":
				mostrarPerfilPaciente(request, response);

			case "/home":
				mostrarHome(request, response);
				break;

			case "/inserir":
				inserirContato(request, response);
				break;

			case "/deletar":
				deletarContato(request, response);
				break;

//			case "/atualizar":
//				atualizarContato(request, response);
//				break;

			case "/inserirMedidas":
				inserirHistorico(request, response);
				break;

			case "/deletarMedidas":
				deletarHistorico(request, response);
				break;

			case "/atualizarMedidas":
				atualizarHistorico(request, response);
				break;

			case "/inserirConsulta":
				inserirConsulta(request, response);
				break;
			case "/deletarConsulta":
				deletarConsulta(request, response);
				break;
			case "/atualizarConsulta":
				atualizarConsulta(request, response);
				break;

			case "/inserirPaciente":
				inserirPaciente(request, response);
				break;

			case "/deletarPaciente":
				deletarPaciente(request, response);
				break;

			case "/atualizarPaciente":
				atualizarPaciente(request, response);
				break;

			case "/inserirNutricionista":
				inserirNutricionista(request, response);
				break;

			case "/deletarNutricionista":
				deletarNutricionista(request, response);
				break;

			case "/mostrarAgendamento":
				mostrarAgendamento(request, response);
				break;

			case "/mostrarCadastroPaciente":
				mostrarCadastroPaciente(request, response);
				break;

			case "/mostrarCadastroNutricionista":
				mostrarCadastroNutricionista(request, response);
				break;

			case "/mostrarMedidas":
				mostrarMedidas(request, response);

			case "/telainicial":
				telainicial(request, response);

//			case "/inserirEndereço":
//				inserirEndereço(request, response);

			case "/atualizarEndereço":
				atualizarEndereco(request, response);

			case "/deletarEndereço":
				deletarEndereço(request, response);

			default:
				mostrarHome(request, response);
				break;
			}

		} catch (

		SQLException sqlException) {
			throw new ServletException();
		}
	}

	private void listarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Nutricionista> nutricionistas = daoNutricionista.recuperarNutricionistas();
		request.setAttribute("nutricionistas", nutricionistas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);
	}
	
	private void listarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Paciente> pacientes = daoPaciente.recuperarPacientes();
		request.setAttribute("pacientes", pacientes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);
	}

	public void telainicial(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("primeiratela.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarMedidas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-medidas.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarCadastroNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-nutricionista.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarCadastroPaciente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-paciente.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarHome(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);

	}

	public void mostrarPerfilPaciente(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("perfil-paciente.jsp");
		dispatcher.forward(request, response);

	}

	public void mostrarAgendamento(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Nutricionista> nutricionistas = daoNutricionista.recuperarNutricionistas();
		request.setAttribute("nutricionistas", nutricionistas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-consulta.jsp");
		dispatcher.forward(request, response);
	}

	private void inserirContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular");
		daoContato.inserirContato(new Contato(telefone, email, celular));
	}

//	private void atualizarContato(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException {
//
//		long id = Long.parseLong(request.getParameter("id"));
//		String telefone = request.getParameter("telefone");
//		String email = request.getParameter("email");
//		String celular = request.getParameter("celular");
//		daoContato.atualizarContato(new Contato(id, telefone, email, celular));
//	}

	private void deletarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = daoContato.recuperarContato(new Contato(id));
		daoContato.deletarContato(contato);
	}

	private void inserirHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		double quadril = Double.parseDouble(request.getParameter("quadril"));
		double cintura = Double.parseDouble(request.getParameter("cintura"));
		double busto = Double.parseDouble(request.getParameter("busto"));
		LocalDate date = LocalDate.parse(request.getParameter("data"));

		daoHistorico.inserirHistorico(new Historico(peso, altura, quadril, cintura, busto, date));

		RequestDispatcher dispatcher = request.getRequestDispatcher("perfilpaciente.jsp");
		dispatcher.forward(request, response);
	}

	private void deletarHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Historico historico = daoHistorico.recuperarHistorico(new Historico(id));
		daoHistorico.deletarHistorico(historico);

	}

	private void atualizarHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		double quadril = Double.parseDouble(request.getParameter("quadril"));
		double cintura = Double.parseDouble(request.getParameter("cintura"));
		double busto = Double.parseDouble(request.getParameter("busto"));
		LocalDate date = LocalDate.parse(request.getParameter("dia"));
		daoHistorico.atualizarHistorico(new Historico(id, peso, altura, quadril, cintura, busto, date));

	}

	private void inserirConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Consulta> consultas = new ArrayList<Consulta>();

		long idpaciente = Long.parseLong(request.getParameter("idpaciente"));
		long idnutri = Long.parseLong(request.getParameter("idnutri"));
		String data = request.getParameter("data");
		String hora = request.getParameter("hora");

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada = LocalDate.parse(data, formatador);
		
		LocalTime horaConvertida = LocalTime.parse(hora);

		Paciente paciente = daoPaciente.recuperarPaciente(new Paciente(idpaciente));
		Nutricionista nutricionista = daoNutricionista.recuperarNutricionista(new Nutricionista(idnutri));
		
		Consulta consulta = daoConsulta.inserirConsulta(new Consulta(horaConvertida, dataFormatada, nutricionista, paciente));
		consultas.add(consulta);
		
		paciente.setConsultas(consultas);
		nutricionista.setConsultas(consultas);
				
		daoPaciente.atualizarPaciente(paciente);
		daoNutricionista.atualizarNutriocionista(nutricionista);
		
		List<Nutricionista> nutricionistas = daoNutricionista.recuperarNutricionistas();
		request.setAttribute("nutricionista", nutricionistas);
				
				
		List<Paciente> pacientes = daoPaciente.recuperarPacientes();
		request.setAttribute("pacientes", pacientes);

		RequestDispatcher dispatcher = request.getRequestDispatcher("perfilpaciente.jsp");
		dispatcher.forward(request, response);

	}

	private void deletarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {

		long id = Long.parseLong(request.getParameter("id_consulta"));
		Consulta consulta = daoConsulta.recuperarConsulta(new Consulta(id));
		daoConsulta.deletarConsulta(consulta);

	}

	private void atualizarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		long idconsulta = Long.parseLong(request.getParameter("id_consulta"));
		Long idnutri = Long.parseLong(request.getParameter("id_nutricionista"));
		long idpaciente = Long.parseLong(request.getParameter("id_paciente"));
		LocalTime hora = LocalTime.parse(request.getParameter("horario_consulta"));
		Paciente paciente = daoPaciente.recuperarPaciente(new Paciente(idpaciente));
		Nutricionista nutricionista = daoNutricionista.recuperarNutricionista(new Nutricionista(idnutri));
//		daoConsulta.atualizarConsulta(new Consulta(idconsulta, hora, date, nutricionista, paciente));

	}
//
//	private void inserirEndereço(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException {
//
//		String cep = request.getParameter("cep_endereço");
//		long numero = Long.parseLong(request.getParameter("numero_endereço"));
//		String complemento = request.getParameter("complemento_endereço");
//		String rua = request.getParameter("rua_endereço");
//		String bairro = request.getParameter("bairro_endereço");
//		String cidade = request.getParameter("cidade_endereço");
//		String estado = request.getParameter("estado_endereço");
//		daoEndereço.inserirEndereco(new Endereco(rua, bairro, cidade, estado, cep, numero, complemento));
//	}

	private void deletarEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Endereco endereco = daoEndereço.recuperarEndereco(new Endereco(id));
		daoEndereço.deletarEndereco(endereco);

	}

	private void atualizarEndereco(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String cep = request.getParameter("cep_endereço");
		long numero = Long.parseLong(request.getParameter("numero_endereço"));
		String complemento = request.getParameter("complemento_endereço");
		daoEndereço.atualizarEndereco(new Endereco(id, cep, numero, complemento));
	}

	public void listarPacientes(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Paciente> pacientes = daoPaciente.recuperarPacientes();
		request.setAttribute("paciente", pacientes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-paciente.jsp");
		dispatcher.forward(request, response);

	}

	public void inserirPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String sobrenome = request.getParameter("sobrenome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String celular = request.getParameter("celular");
		long idade = Long.parseLong(request.getParameter("idade"));
		String rua = request.getParameter("rua");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String cep = request.getParameter("cep");
		Long numero = Long.parseLong(request.getParameter("numero"));
		String complemento = request.getParameter("complemento");

		List<Paciente> pacientes = new ArrayList<Paciente>();

		Contato contato = new Contato(email, telefone, celular);

		daoContato.inserirContato(contato);

		Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep, numero, complemento);

		daoEndereço.inserirEndereco(endereco);

		Paciente paciente = new Paciente(nome, sobrenome, cpf, idade, login, senha);

		daoPaciente.inserirPaciente(paciente);

		paciente.setContato(contato);
		contato.setUsuario(paciente);
		paciente.setEndereco(endereco);
		pacientes.add(paciente);
		endereco.setPacientes(pacientes);

		daoPaciente.atualizarPaciente(paciente);
		daoContato.atualizarContato(contato);
		daoEndereço.atualizarEndereco(endereco);

		RequestDispatcher dispatcher = request.getRequestDispatcher("perfil-paciente.jsp");
		dispatcher.forward(request, response);

	}

	public void deletarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Paciente paciente = daoPaciente.recuperarPaciente(new Paciente(id));
		daoPaciente.deletarPaciente(paciente);
		response.sendRedirect("listar");

	}

	public void atualizarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, NumberFormatException {

		int id = Integer.parseInt(request.getParameter("id_paciente"));
		String nome = request.getParameter("nome_paciente");
		String cpf = request.getParameter("cpf_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		int idade = Integer.parseInt(request.getParameter("idade_paciente"));
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		daoPaciente.atualizarPaciente(new Paciente(id, nome, sobrenome, cpf, idade, login, senha));

	}

	private void deletarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		Long id = Long.parseLong(request.getParameter("id_nutricionista"));
		Nutricionista nustricionista = daoNutricionista.recuperarNutricionista(new Nutricionista(id));
		daoNutricionista.deletarNutricionista(nustricionista);

	}

	public void inserirNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String sobrenome = request.getParameter("sobrenome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String celular = request.getParameter("celular");
		long idade = Long.parseLong(request.getParameter("idade"));

		Contato contato = new Contato(email, telefone, celular);

		daoContato.inserirContato(contato);

		Nutricionista nutricionista = new Nutricionista(nome, sobrenome, cpf, idade, login, senha);

		daoNutricionista.inserirNutricionista(nutricionista);

		nutricionista.setContato(contato);
		contato.setUsuario(nutricionista);

		daoNutricionista.atualizarNutriocionista(nutricionista);
		daoContato.atualizarContato(contato);

		RequestDispatcher dispatcher = request.getRequestDispatcher("perfil-paciente.jsp");
		dispatcher.forward(request, response);

	}

}
