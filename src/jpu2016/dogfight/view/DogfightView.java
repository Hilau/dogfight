package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.model.IDogfightModel;
import java.lang.*;

public abstract class DogfightView implements IViewSystem, Runnable{
	
	private EventPerformer eventPerformer;
	
	public DogfightView(IOrderPerformer orderPerformed, IDogfightModel dogfightModel, Observable observable){
		
	}
	
	/*private void run(){
		
	}*/
	
	public String displayMessage(String message){
		return message;		
	}
	
	public void closeAll(){
		
	}

}
