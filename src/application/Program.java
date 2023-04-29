package application;

import java.sql.Connection;

import db.DB;
import modelo.entidades.Department;

public class Program {

	public static void main(String[] args) {

		/*Connection conn = DB.getConnection();
		DB.closeConnection();
		System.out.println("Pronto!!");
		*/
		
		
		Department obj = new Department(1, "livros");
		System.out.println(obj);
		
	}
}