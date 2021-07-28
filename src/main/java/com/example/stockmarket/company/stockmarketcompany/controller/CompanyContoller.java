package com.example.stockmarket.company.stockmarketcompany.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockmarket.company.stockmarketcompany.entities.Company;
import com.example.stockmarket.company.stockmarketcompany.entities.CompanySector;
import com.example.stockmarket.company.stockmarketcompany.entities.Sector;
import com.example.stockmarket.company.stockmarketcompany.services.CompanyService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CompanyContoller {

	String[] arr;
	
	@Autowired
	CompanyService companyservice;
	
	@GetMapping("/app")
	@ResponseBody
	public String getIt()
	{
		return "3";
	}
	@GetMapping("/comp")
	public String[] getData(@RequestParam("data1")String data1,@RequestParam("data2")String data2,@RequestParam("data3")String data3,@RequestParam("data4")String data4)
	{
		arr=new String[4];
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		arr[0]=data1;
		arr[1]=data2;
		arr[2]=data3;
		arr[3]=data4;
		return arr;
	}
	@GetMapping("/comp1")
	public String[] getData1()
	{
		return arr;
	}
	@PostMapping("/uploadcomp")
	public String postComp(@RequestBody CompanySector comp)
	{
		System.out.println(comp);
		Company comp1=new Company();
		comp1.setComp_Id(comp.getComp_id());
		comp1.setName(comp.getName());
		comp1.setCode(comp.getCode());
		comp1.setBod(comp.getBod());
		comp1.setCeo(comp.getCeo());
		comp1.setTurnover(comp.getTurnover());
		comp1.setWriteup(comp.getWriteup());
		comp1.setStockexchange(comp.getStockexchange());
		Sector sec=new Sector();
		sec.setSector_Id(comp.getSector_id());
		sec.setSector_name(comp.getSector_name());
		sec.setBrief(comp.getBrief());
		
		Sector sec1=companyservice.addSector(sec);
		comp1.setSector(sec1);  
		String s=companyservice.addComp(comp1);
		return s;
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getcomp")
	public ArrayList<Company> getCompany()
	{
		ArrayList<Company> ls=companyservice.getComp();
		
		return ls;
	}
	@GetMapping("/getcompbyid")
	@ResponseBody
	public int getCompanyById(@RequestParam("id")String id)
	{
		System.out.println(id);
		Company ls=companyservice.getCompByid(id);
		int k=ls.getComp_Id();
		System.out.println(k);
		return k;
	}
}
