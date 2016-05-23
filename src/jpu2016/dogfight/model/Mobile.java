package jpu2016.dogfight.model;
import java.awt.Point;
import java.awt.color.*;

public class Mobile implements IMobile{
	
int speed;
Dimension dimension;
Direction direction;
Position position;

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
		new Point();
		
	}
	public Dimension getDimension(){
		return this.dimension;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return this.height;
	}
	public void move(){
		
	}
	public void placeinArea(Area area){
		
	}
	public boolean isPlayer(int player){
		
	}
	private void moveUp(){
		
	}
	private void moveRight(){
		
	}
	private void moveDown(){
		
	}
	private void moveLeft(){
		
	}
	public Color getColor(){
		return this.color;
	}
	public IDogfightModel getIDogfightModel(){
		return this.dogfightModel;
	}
	public IDogfightModel setIDogfightModel(IDogfightModel dogfightModel){
		this.dogfightModel = dogfightModel;
	}
	public boolean hit(){
		
	}
	public boolean isWeapon(){
		
	}
	public Image getImage(){
		return this.image;
	}
}
