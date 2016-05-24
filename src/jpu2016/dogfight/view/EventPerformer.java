package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer {
	private IOrderPerformer orderPerformer;
	// private orderPerformer orderPerformer;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
		
	}
	
	public void eventPerform(KeyEvent keyCode){
		UserOrder o = this.keyCodeToUserOrder(keyCode.getKeyCode());
		orderPerformer.orderPerform(o);
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		/*if(keyCode == 50)
		{
			userOrder(Order.UP)
		}*/
		
		return null;
	}
	
}
