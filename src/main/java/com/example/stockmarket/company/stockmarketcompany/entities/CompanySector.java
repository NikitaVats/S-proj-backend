package com.example.stockmarket.company.stockmarketcompany.entities;

public class CompanySector {

	
	private int comp_id;
	private int sector_id;
	String name;
	String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	String turnover;
	String ceo;
	String bod;
	String writeup;
	String stockexchange;
	 @Override
	public String toString() {
		return "CompanySector [comp_id=" + comp_id + ", sector_id=" + sector_id + ", name=" + name + ", code=" + code
				+ ", turnover=" + turnover + ", ceo=" + ceo + ", bod=" + bod + ", writeup=" + writeup
				+ ", stockexchange=" + stockexchange + ", sector_name=" + sector_name + ", brief=" + brief + "]";
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) 
	{
		this.stockexchange = stockexchange;
	}
	String sector_name;
	 String brief;
	
	
	
	
	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
	}
	public int getComp_id() {
		return comp_id;
	}
	public int getSector_id() {
		return sector_id;
	}
	public void setSector_id(int sector_id) {
		this.sector_id = sector_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBod() {
		return bod;
	}
	public void setBod(String bod) {
		this.bod = bod;
	}
	public String getWriteup() {
		return writeup;
	}
	public void setWriteup(String writeup) {
		this.writeup = writeup;
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
