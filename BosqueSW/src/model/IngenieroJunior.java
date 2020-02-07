package model;

public class IngenieroJunior extends PersonalFijo implements Salario {
	private int nivel;
	private double jSalario;
	public final double MONTO = 3500000;

	public IngenieroJunior(int cedula, String nombre, String apellido, String genero, String telefono, String correo,
			String direccion, String anoIgreso, int anos,String tipoPersonal) {
		super(cedula, nombre, apellido, genero, telefono, correo, direccion, anoIgreso, anos,tipoPersonal);
		// TODO Auto-generated constructor stub
		jSalario = super.getSalario();

	}

	@Override
	public double calcularSalario() {
		float porcentaje = 0;
		if (nivel == 1) {
			jSalario = 3500000;
		}
		if (nivel == 2 || nivel == 3) {
			porcentaje = (float) ((MONTO * 5) / 100);
			jSalario += porcentaje;
		}

		if (nivel == 4 || nivel == 5) {
			porcentaje = (float) ((MONTO * 8) / 100);
			jSalario += porcentaje;
		}

		return jSalario;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
