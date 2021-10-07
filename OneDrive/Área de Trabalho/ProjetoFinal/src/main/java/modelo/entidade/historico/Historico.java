package modelo.entidade.historico;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import modelo.entidade.paciente.Paciente;

@Entity
@Table(name = "historico")
public class Historico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_historico")
	private Long Id;

	@Column(name = "peso_historico", nullable = false, unique = false)
	private double peso;

	@Column(name = "altura_historico", nullable = false, unique = false)
	private double altura;

	@Column(name = "quadril_historico", nullable = false, unique = false)
	private double quadril;

	@Column(name = "cintura_historico", nullable = false, unique = false)
	private double cintura;

	@Column(name = "busto_historico", nullable = false, unique = false)
	private double busto;

	@Column(name = "data_historico", nullable = false, unique = false)
	LocalDate data;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Historico(double peso, double altura, double quadril, double cintura, double busto, LocalDate data) {

		setBusto(busto);
		setData(data);
		setAltura(altura);
		setCintura(cintura);
		setPeso(peso);
		setQuadril(quadril);

	}

	public Historico(Long id, double peso, double altura, double quadril,  double busto, double cintura, LocalDate data) {

		setBusto(busto);
		setData(data);
		setId(id);
		setAltura(altura);
		setCintura(cintura);
		setPeso(peso);
		setQuadril(quadril);

	}
	
	public Historico(Long id) {

		setId(id);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;

	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;

	}

	public double getQuadril() {
		return quadril;
	}

	public double getBusto() {
		return busto;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setBusto(double busto) {
		this.busto = busto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}

	public double getCintura() {
		return cintura;
	}

	public void setCintura(double cintura) {
		this.cintura = cintura;

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

}
