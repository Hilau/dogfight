package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.Dimension;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	private static int Time_SLEEP = 30;
	private IViewSystem viewSystem;
	private DogfightModel dogfightModel;
	
	public DogfightController(IDogfightModel dogfightModel)
	{
		
	}
	
	public void orderPerform(UserOrder userOrder)
	{
		
	}
	
	public void play()
	{
		this.gameLoop();
	}
	
	public void setViewSystem(IViewSystem viewSystem)
	{
		this.viewSystem = viewSystem;
	}
	
	private void lauchMissile(int player)
	{
		Missile m = new Missile(Direction.UP, new Dimension(30, 30));
	}
	
	private void gameLoop()
	{
		
	}
	
}