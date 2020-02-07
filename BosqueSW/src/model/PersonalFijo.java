package model;

public class PersonalFijo extends PersonalDTO implements Salario {
    private int anosLaborando;
	private double salario;
    public PersonalFijo(int cedula, String nombre, String apellido, String genero, String telefono, String correo,
			String direccion, String anoIgreso, int anos, String tipoPersonal) {
		super(cedula, nombre, apellido, genero, telefono, correo, direccion, anoIgreso, tipoPersonal);
		 
		salario = 3500000;
		anosLaborando = anos;
	}
	@Override
	public double calcularSalario() {
		float porcentaje = 0;
		if (anosLaborando < 2) {
			return salario;
		}
		 if ((anosLaborando >= 2 )&& (anosLaborando <=3 ) ) {
			porcentaje = (float) (salario*5)/100;
			salario+= porcentaje;
		} 
		 if (anosLaborando >= 4 && anosLaborando <= 7) {
			 porcentaje = (float) (salario*10)/100;
				salario+= porcentaje;
		}
		 if (anosLaborando >= 8 && anosLaborando <=15) {
			 porcentaje = (float) (salario*15)/100;
				salario+= porcentaje;
		}
		 if (anosLaborando > 15) {
			 porcentaje = (float) (salario*20)/100;
				salario+= porcentaje;
		}
		
		return salario;
	}
	public int getAnosLaborando() {
		return anosLaborando;
	}
	public void setAnosLaborando(int anosLaborando) {
		this.anosLaborando = anosLaborando;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
