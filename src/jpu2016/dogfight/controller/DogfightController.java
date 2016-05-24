package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.Dimension;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.model.Mobile;
import jpu2016.dogfight.model.Plane;
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
		IMobile p = dogfightModel.getMobileByPlayer(userOrder.getPlayer());
		
		switch(userOrder.getOrder())
		{
			case UP:
				p.setDirection(Direction.UP);
			break;
			
			case DOWN:
				p.setDirection(Direction.DOWN);
			break;
			
			case LEFT:
				p.setDirection(Direction.LEFT);
			break;
			
			case RIGHT:
				p.setDirection(Direction.RIGHT);
			break;
			
			case SHOOT:
				
			break;
			
			case NOP:
				
			break;
		}
		
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
		// Récupérer la position de l'avion (voir avec le joueur)
		// Missile m = new Missile(Direction.UP, new Dimension(30, 30));
	}
	
	private void gameLoop()
	{
		//while(p.hit() != true)
		//{
			for(IMobile m : dogfightModel.getMobiles())
			{
				m.move();
			}
		//}
	}
	
}