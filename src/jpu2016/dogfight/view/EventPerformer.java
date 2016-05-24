package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
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
		switch(keyCode) {
		
		case 122 : 
			UserOrder z = new UserOrder(1, Order.UP);
		break;
		
		case 113 :
			UserOrder q = new UserOrder(1, Order.LEFT);
		break;
		
		case 100 :
			UserOrder d = new UserOrder(1, Order.RIGHT);
		break;
		
		case 115 :
			UserOrder s = new UserOrder(1, Order.DOWN);
		break;
		
		case 32 : 
			UserOrder space = new UserOrder(1, Order.SHOOT);
		break;
		
		case 1 : 
			UserOrder un = new UserOrder(2, Order.LEFT);
		break;
		
		case 2 : 
			UserOrder deux = new UserOrder(2, Order.DOWN);
		break;
		
		case 3 : 
			UserOrder trois = new UserOrder(2, Order.RIGHT);
		break;
		
		case 5 : 
			UserOrder quatre = new UserOrder(2, Order.UP);
		break;
		
		case 109 :
			UserOrder m = new UserOrder(2, Order.SHOOT);
		break;
		
		}
		
		
		return null;
	}
	
}
