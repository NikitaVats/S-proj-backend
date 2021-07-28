package com.example.stockmarket.company.stockmarketcompany.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.*;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int sector_id;
    String sector_name;
    String brief;
    @OneToMany(mappedBy="sector",cascade=CascadeType.ALL)
    @JsonManagedReference
    List<Company> comp;
	
	public List<Company> getComp() {
		return comp;
	}
	public void setComp(List<Company> comp) {
		this.comp = comp;
	}
	public int getSector_Id() {
		return sector_id;
	}
	public void setSector_Id(int id) {
		this.sector_id = id;
	}
	public String getSector_name() {
		return sector_name;
	}
	public void setSector_name(String sector_name) {
		this.sector_name = sector_name;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
    
}
