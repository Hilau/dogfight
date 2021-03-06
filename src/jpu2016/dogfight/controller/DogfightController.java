package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.Dimension;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.model.Mobile;
import jpu2016.dogfight.model.Plane;
import jpu2016.dogfight.model.Position;
import jpu2016.dogfight.view.DogfightView;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	private static int Time_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	private Position position;
	private DogfightView dogfightView;
	
	public DogfightController(IDogfightModel dogfightModel)
	{
		// this.dogfightModel = new DogfightModel();
		this.dogfightModel = dogfightModel;
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
				this.lauchMissile(userOrder.getPlayer());
			break;
			
			case NOP:
				
			break;
		}
		
	}
	
	public void play()
	{
		this.gameLoop();
		// dogfightView.displayMessage("Fin de la partie");
	}
	
	public void setViewSystem(IViewSystem viewSystem)
	{
		this.viewSystem = viewSystem;
	}
	
	private void lauchMissile(int player)
	{
		IMobile p = dogfightModel.getMobileByPlayer(player);
		
		switch(p.getDirection())
		{
			case UP:
				Missile m = new Missile(Direction.UP, p.getPosition());
				//Missile m2 = new Missile(Direction.UP, p.getY()-1);
			break;
			
			case DOWN:
				// Missile m = new Missile(Direction.UP, p.getPosition());
			break;
			
			case LEFT:
				// Missile m = new Missile(Direction.UP, p.getPosition());
			break;
			
			case RIGHT:
				// Missile m = new Missile(Direction.UP, p.getPosition());
			break;
		}
		
	}
	
	private void gameLoop()
	{
		/*for(IMobile m : dogfightModel.getMobiles())
		{
			if(m.hit() == false)
			{
				m.move();
			}
			
			else
			{
				break;
			}
			
		}*/
		
		/*for(int i=0;i<dogfightModel.getMobiles().length();i++)
		{
			
		}*/
		
	}
	
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() /
		weapon.getWidth()))
		 && ((weapon.getPosition().getX() / weapon.getWidth()) <=
		((mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()))) {
		 if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY()
		/ weapon.getHeight()))
		 && ((weapon.getPosition().getY() / weapon.getHeight()) <=
		((mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()))) {
		 return true;
		 }
	}
		
	return false;
	} 
	
}