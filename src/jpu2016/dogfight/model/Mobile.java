package jpu2016.dogfight.model;

public class Mobile {
	
int speed;

	public Mobile(Direction direction,Position position, Dimension dimension, int speed, String image){		
}
	public Direction getDirection(){
		return this.direction;
	}
	public void setDirection(Direction direction){
		this.direction = direction;
	}
	public Point getPosition(){
		return this.position;
	}
	public Dimension getDimension(){
		return this.dimension;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getWidth(){
		return this.width;
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
	public void moveUp(){
		
	}
	public void moveRight(){
		
	}
	public void moveDown(){
		
	}
	public void moveLeft(){
		
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
