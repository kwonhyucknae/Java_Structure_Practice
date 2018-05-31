package com.javalec.Dto;

public class Dto {
	String name;
	int rank;
	int price;
	int realprice;
	int nine;
	int ten;
	public Dto() {
		// TODO Auto-generated constructor stub
		rank=0;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRealprice() {
		return realprice;
	}
	public void setRealprice(int realprice) {
		this.realprice = realprice;
	}
	public int getNine() {
		return nine;
	}
	public void setNine(int nine) {
		this.nine = nine;
	}
	public int getTen() {
		return ten;
	}
	public void setTen(int ten) {
		this.ten = ten;
	}

}

