package application;

import java.sql.Connection;

import db.DB;
import modelo.entidades.Departamento;

public class Program {

	public static void main(String[] args) {

		/*Connection conn = DB.getConnection();
		DB.closeConnection();
		System.out.println("Pronto!!");
		*/
		
		Departamento obj = new Departamento(1, "livros");
		System.out.println(obj);
		
	}
}