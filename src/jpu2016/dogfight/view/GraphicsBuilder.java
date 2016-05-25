package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Mobile;

public class GraphicsBuilder {
	public GraphicsBuilder(IDogfightModel dogfightModel){
		
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer){
		
	}
	
	private void buildEmptySky(){
		
	}
	
	/*public void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		final BufferedImage imageMobile = new BufferedImage(mobile.getWidth(), mobile.getHeight(), Transparency.TRANSLUCENT);
		final Graphics graphicsMobile = imageMobile.getGraphics();
		graphicsMobile.drawImage(mobile.getImage(), 0, 0, mobile.getWidth(), mobile.getHeight(), observer);
		graphics.drawImage(imageMobile, mobile.getPosition().getX(), mobile.getPosition().getY(), observer);
		final boolean isHorizontalOut = (mobile.getPosition().getX() + mobile.getWidth()) > this.dogfightModel.getArea().getWidth();
		final boolean isVerticalOut = (mobile.getPosition().getY() + mobile.getHeight()) > this.dogfightModel.getArea().getHeight();
				
				if (isHorizontalOut) {
					final BufferedImage imageMobileH =
							imageMobile.getSubimage(this.dogfightModel.getArea().getWidth() - mobile.getPosition().getX(), 0,
							(mobile.getWidth() - this.dogfightModel.getArea().getWidth()) + mobile.getPosition().getX(), mobile.getHeight());
					graphics.drawImage(imageMobileH, 0, mobile.getPosition().getY(), observer);
				}
				
				if (dogfightModel.getArea().getHeight() - mobile.getPosition().getY(), mobile.getWidth(),
				(mobile.getHeight() - this.dogfightModel.getArea().getHeight()) + mobile.getPosition().getY() );
					graphics.drawImage(imageMobileV, mobile.getPosition().getX(), 0, observer);
				
	
				if (isHorizontalOut && isVerticalOut) {
					final BufferedImage imageMobileHV = 
							imageMobile.getSubimage(this.dogfightModel.getArea().getWidth() - mobile.getPosition().getX(),
							this.dogfightModel.getArea().getHeight() - mobile.getPosition().getY(),
							(mobile.getWidth() - this.dogfightModel.getArea().getWidth()) + mobile.getPosition().getX(),
					(mobile.getHeight() - this.dogfightModel.getArea().getHeight()) + mobile.getPosition().getY());
					graphics.drawImage(imageMobileHV, 0, 0, observer);
				}
	}*/
	
	public int getGlobalWidth() {
		return 1;
	}
	
	public int getGlobalHeight() {
		return 1;
	}
}