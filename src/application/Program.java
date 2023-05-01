package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import modelo.entidades.Department;
import modelo.entidades.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*Connection conn = DB.getConnection();
		DB.closeConnection();
		System.out.println("Pronto!!");
		*/

// comunico com a interface e a fabrica de Dao que cria um SellerDao	
/*		
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
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		 list = sellerDao.findAll();
		for(Seller obj : list) {
		System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido novo id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Atualização completa");
*/		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.println("Entrer com id para delete");
			int id = sc.nextInt();
			sellerDao.deleteById(id);
			System.out.println("Id deletado com sucesso!!!");
			
		sc.close();
		
	}
}