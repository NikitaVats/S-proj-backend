package com.example.stockmarket.company.stockmarketcompany.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.stockmarket.company.stockmarketcompany.entities.Sector;



@Repository
public interface SectorRepository extends CrudRepository<Sector,Integer> {

}
