package jpu2016.dogfight.controller;

public interface IUserOrder {

	public Order getOrder(){
		return new Order();
	}
	
	public default int getPlayer()
	{
		return 1;
	}
	
}
