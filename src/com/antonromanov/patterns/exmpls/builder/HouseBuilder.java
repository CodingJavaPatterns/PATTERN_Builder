package com.antonromanov.patterns.exmpls.builder;

public interface HouseBuilder {
	
	public void buildBasement();

	public void buildStructure();

	public void bulidRoof();

	public void buildInterior();

	public House getHouse();	
	

}