package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DogfightModel extends Observable implements IDogfightModel {

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
		return this.mobile;
	}
	public IMobile getMobileByPlayer(int player){
		return this.mobileByPlayer;
	}
	public void setMobilesHavesMoved(){
	}
	
}
