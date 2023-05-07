package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import modelo.entidades.Department;
import modelo.entidades.Seller;

public class Program {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		
		 Connection conn = DB.getConnection(); DB.closeConnection();
		 System.out.println("Pronto!!");


// comunico com a interface e a fabrica de Dao que cria um SellerDao	
		
		  SellerDao sellerDao = DaoFactory.createSellerDao();
		  
		  System.out.println("=== TEST 1: seller findById ==="); Seller seller =
		  sellerDao.findById(3); System.out.println(seller);
		  
		  System.out.println("\n=== TEST 2: seller findByDepartment ==="); Department
		  department = new Department(2, null); List<Seller> list =
		  sellerDao.findByDepartment(department); for(Seller obj : list) {
		  System.out.println(obj); }
		  
		  System.out.println("\n=== TEST 3: seller findAll ==="); list =
		  sellerDao.findAll(); for(Seller obj : list) { System.out.println(obj); }
		  
		  System.out.println("\n=== TEST 4: seller insert ==="); Seller newSeller = new
		  Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		  sellerDao.insert(newSeller); System.out.println("Inserido novo id = " +
		  newSeller.getId());
		  
		  System.out.println("\n=== TEST 5: seller update ==="); seller =
		  sellerDao.findById(1); seller.setName("Martha Wayne");
		  sellerDao.update(seller); System.out.println("Atualização completa");
		  
		  SellerDao sellerDao2 = DaoFactory.createSellerDao();
		  System.out.println("\n=== TEST 6: seller delete ===");
		  System.out.println("Entrer com id para delete"); int id = sc.nextInt();
		  sellerDao2.deleteById(id); System.out.println("Id deletado com sucesso!!!");
		

// teste da classe DepartamentDao			
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list2 = departmentDao.findAll();
		for (Department d : list2) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: insert =======");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id2 = sc.nextInt();
		departmentDao.deleteById(id2);
		System.out.println("Delete completed");

		sc.close();
		conn.close();

	}
}