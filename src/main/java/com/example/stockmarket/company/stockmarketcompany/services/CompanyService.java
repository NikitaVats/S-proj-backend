package com.example.stockmarket.company.stockmarketcompany.services;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockmarket.company.stockmarketcompany.entities.Company;
import com.example.stockmarket.company.stockmarketcompany.entities.Sector;
import com.example.stockmarket.company.stockmarketcompany.repo.CompanyRepository;
import com.example.stockmarket.company.stockmarketcompany.repo.SectorRepository;


@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository comprepo;
	@Autowired
	SectorRepository sectorrepo;

	public String addComp(Company comp)
	{
		Company user1=comprepo.save(comp);
		return user1.getName();
   }
	public Sector addSector(Sector sector)
	{
		Sector user1=sectorrepo.save(sector);
		return user1;
   }
	public ArrayList<Company> getComp()
	{
		Iterable iter=comprepo.findAll();
		Iterator iter1=iter.iterator();
		ArrayList<Company> ls=new ArrayList<>();
		while(iter1.hasNext())
		{
			Object o=iter1.next();
			ls.add((Company)o);
		}
		return ls;
   }
	
	public Company getCompByid(String id)
	{
		
		Company comp=comprepo.findByCode(id);
		System.out.println(comp);
		System.out.println(comp.getBod());
		System.out.println(comp.getComp_Id());
		return comp;
	}
}
