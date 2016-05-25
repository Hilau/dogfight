package jpu2016.dogfight.model;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.Area;

public class Mobile implements IMobile{
	
int speed;
Dimension dimension;
Direction direction;
Position position;
Image image;
IDogfightModel dogfightModel;
private Color color;


	public Mobile(Direction direction,Position position, Dimension dimension, int speed, String image){	
		this.direction = direction;
	}
	
	public Direction getDirection(){
		return this.direction;
	}
	
	public void setDirection(Direction direction){
		this.direction = direction;
	}
	
	public Position getPosition(){
		return this.position;	
	}
	
	public Dimension getDimension(){
		return this.dimension;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public int getWidth(){
		return dimension.getWidth();
	}
	
	public int getHeight(){
		return dimension.getHeight();
	}
	
	public void move(){
		int move = 0;
		switch(move){
		case 1:
			moveUp();
			break;
		case 2:
			moveDown();
			break;
		case 3:
			moveLeft();
			break;
		case 4:
			moveRight();
			break;
		default:
			break;
		}
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public boolean isPlayer(int player){
		return false;
		
	}
	
	private void moveUp(){
		setDirection(direction.UP);
	}
	
	private void moveRight(){
		setDirection(direction.RIGHT);
	}
	
	private void moveDown(){
		setDirection(direction.DOWN);
	}
	
	private void moveLeft(){
		setDirection(direction.LEFT);
	}
	
	public Color getColor(){
		return null;
	}
	public IDogfightModel getIDogfightModel(){
		return this.dogfightModel;
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
	
	public void setDogfightModel(DogfightModel dogfightModel) {
		
	}
}
