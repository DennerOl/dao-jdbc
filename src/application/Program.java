package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import modelo.entidades.Department;
import modelo.entidades.Seller;

public class Program {

	public static void main(String[] args) {

		/*Connection conn = DB.getConnection();
		DB.closeConnection();
		System.out.println("Pronto!!");
		*/

// comunico com a interface e a fabrica de Dao que cria um SellerDao		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		Department obj = new Department(1, "livros");
		System.out.println(obj);
		
	}
}