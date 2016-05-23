package jpu2016.dogfight.model;

import java.awt.Image;

public interface IMobile {

	public Direction getDirection();
	
	public default void setDirection(Direction direction)
	{
		this.direction = new Direction();
	}
	
	public Point getPosition()
	{
		return new Position();
	}
	
	public default Dimension getDimension()
	{
		return  new Dimension();
	}
	
	public int getWidth()
	{
		return 1;
	}
	
	public int getHeight()
	{
		return 1;
	}
	
	public int getSpeed()
	{
		return 1;
	}
	
	public Image getImage()
	{
		return new Image();
	}
	
	public void move()
	{
		
	}
	
	public void placeInArea(IArea area)
	{
		
	}
	
	public boolean isPlayer(int player)
	{
		
	}
	
	public setDogfightModel(DogfigtModel dogfightModel)
	{
		this.dogfightModel = new DogfightModel();
	}
	
	public boolean hit()
	{
		
	}
	
	public boolean isWeapon()
	{
		
	}
}
