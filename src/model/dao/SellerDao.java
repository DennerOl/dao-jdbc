package model.dao;

import java.util.List;

import modelo.entidades.Seller;

public interface SellerDao {

// responsaveis por manipular o banco de dados
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
