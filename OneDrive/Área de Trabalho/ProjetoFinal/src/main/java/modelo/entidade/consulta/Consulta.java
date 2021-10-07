package modelo.entidade.consulta;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;

@Entity
@Table(name = "consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_consulta")
	Long id;

	@Column(name = "horario_consulta", nullable = false, unique = false)
	LocalTime hora;

	@Column(name = "data_consulta", nullable = false, unique = false)
	LocalDate data;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nutricionista")
	private Nutricionista nutricionista;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Consulta() {}

	public Consulta(LocalTime hora, LocalDate date, Nutricionista nutricionista, Paciente paciente) {

		setData(date);
		setHora(hora);
		setNutricionista(nutricionista);
		setPaciente(paciente);
	}

	public Consulta(Long id, LocalTime hora, LocalDate data, Nutricionista nutricionista, Paciente paciente) {

		setId(id);
		setData(data);
		setHora(hora);
		setNutricionista(nutricionista);
		setPaciente(paciente);
	}

	public Consulta(Long id) {

		setId(id);

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime time) {
		this.hora = time;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Nutricionista getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(Nutricionista nutricionista) {
		this.nutricionista = nutricionista;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
