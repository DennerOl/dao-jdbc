package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import modelo.entidades.Department;

public class Program {

	public static void main(String[] args) {

		/*Connection conn = DB.getConnection();
		DB.closeConnection();
		System.out.println("Pronto!!");
		*/

// comunico com a interface e a fabrica de Dao que cria um SellerDao		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department obj = new Department(1, "livros");
		System.out.println(obj);
		
	}
}