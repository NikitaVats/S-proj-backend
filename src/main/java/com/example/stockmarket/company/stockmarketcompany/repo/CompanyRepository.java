package com.example.stockmarket.company.stockmarketcompany.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.stockmarket.company.stockmarketcompany.entities.Company;



@Repository
public interface CompanyRepository extends CrudRepository<Company,String> {
	public Company findByCode(String s);
}
