import modelo.dao.nutricionista.NutricionistaDAO;
import modelo.dao.nutricionista.NutricionistaDAOimpl;
import modelo.dao.paciente.PacienteDAO;
import modelo.dao.paciente.PacienteDAOimpl;
import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;

public class Main {

	public static void main(String[] args) {

		PacienteDAO daoPaciente = new PacienteDAOimpl();
		NutricionistaDAO daoNutri = new NutricionistaDAOimpl();
		
		Paciente paciente = new Paciente(1L);
		Nutricionista nutricionista = new Nutricionista(2L);
		
		
		daoNutri.recuperarNutricionista(nutricionista);
	}

}
