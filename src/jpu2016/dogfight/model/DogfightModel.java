package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DogfightModel extends Observable implements IDogfightModel {

	IMobile mobile;
	Sky sky;
	
	public DogfightModel(){
			
	}
	
	public IArea getArea(){
		return this.getArea();
	}
	
	public void buildArea(Dimension dimension){
		
	}
	
	public void addMobile(IMobile Mobile){
		
	}
	
	public ArrayList<IMobile> getMobiles(){
		return ((ArrayList<IMobile>) this.mobile);
	}
	
	public IMobile getMobileByPlayer(int player){
		if(mobile.isPlayer(player))
			return mobile;
		
		return null;
	}
	
	public void setMobilesHavesMoved(){
	}
	
	public void removeMobile(IMobile Mobile) {
		
	}
}
