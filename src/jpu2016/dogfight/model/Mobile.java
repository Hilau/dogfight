package jpu2016.dogfight.model;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.color.*;
import java.awt.geom.Area;

public abstract class Mobile implements IMobile{
	
int speed;
Dimension dimension;
Direction direction;
Position position;
Image image;
IDogfightModel dogfightModel;


	public Mobile(Direction direction,Position position, Dimension dimension, int speed, String image){	
		this.direction = direction;
}
	public Direction getDirection(){
		return this.direction;
	}
	public void setDirection(Direction direction){
		this.direction = direction;
	}
	public Point getPosition(){
		return new Point();
		
	}
	public Dimension getDimension(){
		return this.dimension;
	}
	public int getSpeed(){
		return this.speed;
	}
	/*public int getWidth(){
		return WIDTH;
	}
	public int getHeight(){
		return this.height;
	}*/
	public void move(){
		
	}
	public void placeinArea(Area area){
		
	}
	public boolean isPlayer(int player){
		return false;
		
	}
	private void moveUp(){
		
	}
	private void moveRight(){
		
	}
	private void moveDown(){
		
	}
	private void moveLeft(){
		
	}
//	public Color getColor(){
//	return image;
//	}
	public IDogfightModel getIDogfightModel(){
		return this.dogfightModel;
	}
	public IDogfightModel setIDogfightModel(IDogfightModel dogfightModel){
		return this.dogfightModel = dogfightModel;
	}
	public boolean hit(){
		return false;
		
	}
	public boolean isWeapon(){
		return false;
		
	}
	public Image getImage(){
		return this.image;
	}
}
