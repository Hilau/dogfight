package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

import java.lang.*;

public abstract class DogfightView implements IViewSystem, Runnable{
	
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;
	
	public DogfightView(IOrderPerformer orderPerformed, IDogfightModel dogfightModel, Observable observable){
		
	}
	
	public void run(){
		
	}
	
	public void displayMessage(String message){
		
	}
	
	public void closeAll(){
		
	}

}
