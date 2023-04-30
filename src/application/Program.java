package application;

import java.util.List;

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
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
		System.out.println(obj);
		}
	}
}