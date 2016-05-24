package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class GameFrame implements KeyListener{
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable){
		
	}
	
	public void keyPressed(KeyEvent keyEvent){
		
	}
	
	public void keyReleased(KeyEvent keyEvent){
		eventPerformer.eventPerform(keyEvent);
	}
	
	public void keyTyped(KeyEvent keyEvent){
		
	}
}
