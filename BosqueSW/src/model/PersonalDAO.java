package model;

import java.io.Serializable;
import java.util.ArrayList;

public class PersonalDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<PersonalDTO> personal;

	public PersonalDAO() {
		personal = new ArrayList<>();
	}

	public String registrarEmpleado(int cedula, String nombre, String apellido, String genero, String telefono,
			String correo, String direccion, String anoIgreso, String tipoPersonal) {

		String respuesta = "Personal Registrado";
		boolean existe = false;

		for (int i = 0; i < personal.size(); i++) {

			if (personal.get(i).getCedula() == cedula) {

				PersonalDTO Actual = personal.get(i);

				respuesta = "El Personal ya existe: nombre: " + Actual.getNombre() + ", apellido: "
						+ Actual.getApellido() + ", cedula: " + Actual.getCedula();
				existe = true;
				return respuesta;
			}
			if (existe == false) {

				personal.add(new PersonalDTO(cedula, nombre, apellido, genero, telefono, correo, direccion, anoIgreso,
						tipoPersonal));

			}

		}
		return respuesta;
	}

	public String actulizarNombrePersonal(String nombre, int cedula) {

		for (int i = 0; i < personal.size(); i++) {
			if (personal.get(i).getCedula() == cedula) {
				PersonalDTO Actual = personal.get(i);
				Actual.setNombre(nombre);
			}

		}
		return "EL Nombre ha sido actualizado";
	}

	public String actulizarApellidoPersonal(String apellido, int cedula) {

		for (int i = 0; i < personal.size(); i++) {
			if (personal.get(i).getCedula() == cedula) {
				PersonalDTO Actual = personal.get(i);
				Actual.setNombre(apellido);
			}

		}
		return "EL Apellido ha sido actualizado";
	}

	public String actulizarTelefonoPersonal(String telefono, int cedula) {

		for (int i = 0; i < personal.size(); i++) {
			if (personal.get(i).getCedula() == cedula) {
				PersonalDTO Actual = personal.get(i);
				Actual.setNombre(telefono);
			}

		}
		return "El Telefono ha sido actualizado";
	}

	public String actulizarCorreoPersonal(String correo, int cedula) {

		for (int i = 0; i < personal.size(); i++) {
			if (personal.get(i).getCedula() == cedula) {
				PersonalDTO Actual = personal.get(i);
				Actual.setNombre(correo);
			}

		}
		return "El Correo ha sido actualizado";
	}

	public String actulizarDireccionPersonal(String direccion, int cedula) {

		for (int i = 0; i < personal.size(); i++) {
			if (personal.get(i).getCedula() == cedula) {
				PersonalDTO Actual = personal.get(i);
				Actual.setNombre(direccion);
			}

		}
		return "La Direcion ha sido actualizado";
	}

}
