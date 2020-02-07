package model;

public class IngenieroSenior extends PersonalFijo implements Salario {
	private int ventas;
	private double nuevoSalario;
	public final double MONTO = 3500000;
	
	public IngenieroSenior(int cedula, String nombre, String apellido, String genero, String telefono, String correo,
			String direccion, String anoIgreso, int anos, int ventas,String tipoPersonal) {
		super(cedula, nombre, apellido, genero, telefono, correo, direccion, anoIgreso, anos, tipoPersonal);

		this.ventas = ventas;
		nuevoSalario = super.getSalario();
	}

	@Override
	public double calcularSalario() {
		float porcentaje = 0;
		if (ventas >= 1 && ventas <= 5) {
			porcentaje = (float) ((MONTO * 10) / 100);
			nuevoSalario += porcentaje;
		}
		if (ventas >= 6 && ventas <= 10) {
			porcentaje = (float) ((MONTO * 15) / 100);
			nuevoSalario += porcentaje;
		}
		if (ventas >= 11 && ventas <= 20) {
			porcentaje = (float) ((MONTO * 20) / 100);
			nuevoSalario += porcentaje;
		}
		if (ventas > 21) {
			porcentaje = (float) ((MONTO * 30 / 100));
			nuevoSalario += porcentaje;
		}

		return nuevoSalario;
	}
}
