package modelo.dao.paciente;

import java.util.List;

import modelo.entidade.paciente.Paciente;

public interface PacienteDAO {

	public void inserirPaciente(Paciente paciente);

	public void deletarPaciente(Paciente paciente);

	public void atualizarPaciente(Paciente paciente);

	Paciente recuperarPaciente(Paciente paciente);

	Paciente recuperarPacientePeloNome(Paciente paciente);

	Paciente recuperarPacientePeloSobrenome(Paciente paciente);

	List<Paciente> recuperarPacientes();
}