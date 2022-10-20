package es.eoi.gestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import es.eoi.config.BBDDUtil;

public class GestionProvincias {

	static String menu = "BUSCADOR DE PROVINCIAS:\n" + "1 - ANDALUCIA\n" + "2 - ARAGÓN\n" + "3 - ASTURIAS\n"
			+ "4 - ASTURIAS\n" + "5 - CANARIAS\n" + "6 - CANTABRIA\n" + "7 - CASTILLA Y LEÓN\n"
			+ "8 - CASTILLA-LA MANCHA\n" + "9 - CATALUÑA\n" + "10 - COMUNITAT VALENCIANA\n" + "11 - EXTREMADURA\n"
			+ "12 - GALICIA\n" + "13 - MADRID\n" + "14 - MURCIA\n" + "15 - NAVARRA\n" + "16 - PAÍS VASCO\n"
			+ "17 - LA RIOJA\n" + "18 - CEUTA\n" + "19 - MELILLA\n";

	public static void listarProvincias(int codComunidad) throws SQLException {

		Provincia provincia = null;

		String sql = " SELECT provincia.nombre FROM provincia where codComunidad = ?";

		Connection conexion = BBDDUtil.openConnection();

		PreparedStatement instruccionSQL = conexion.prepareStatement(sql);
		
		instruccionSQL.setLong(1, codComunidad);

		ResultSet resultadoConsulta = instruccionSQL.executeQuery();

		if (resultadoConsulta.next()) {
			provincia = new Provincia();
			provincia.setNombre(resultadoConsulta.getString("NOMBRE"));
			provincia.setCodComunidad(resultadoConsulta.getInt("codComunidad"));
		}

		if (provincia != null) {
			System.out.println("Las provincias son: " + provincia);
		} else {
			System.out.println("No existe esa comunidad autonoma:" + codComunidad);
		}

		conexion.close();
	}

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		System.out.println(menu);
		System.out.println("Introduce el código de la comunidad autónoma que desees: ");

		int opcion = sc.nextInt();
		
		//try {
			listarProvincias(opcion);
		//} catch (SQLException e) {
		//	System.out.println("Error al listar las provincias");
		//}

	}

}
