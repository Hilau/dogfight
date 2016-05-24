package jpu2016.dogfight.model;

public class Missile extends Mobile{
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension){
		super(direction,new Position(0,0,5,5), dimension,SPEED,IMAGE);
	}
	static public int getWidthWithADirection(Direction direction){
		return WIDTH;
	}
	static public int getHeightWithADirection(Direction direction){
		return HEIGHT;
	}
	public void move(){
		
	}
	public boolean isWeapon(){
		return false;
		
	}
	
	
}
