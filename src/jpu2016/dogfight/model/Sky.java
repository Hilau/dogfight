package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.color.*;


public class Sky implements IArea{

Dimension dimension;
Image image ;

	public Sky(Dimension dimension){
	}
	public Dimension getDimension(){
		return this.dimension;
	}
	public Image getImage(){
		return this.image;
	}
}
