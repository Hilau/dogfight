package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	public default void applyModelToGraphic(Graphics graphics, ImageObserver observer){
		
	}
	
	public default int getGlobalWidth(){
		return 1;
	}
	
	public default int getGlobalHeight(){
		return 1;
	}
}
