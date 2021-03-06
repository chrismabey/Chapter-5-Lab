/* Chris Mabey
   Mr. Kiedes
   Chp. 5 Lab
   2 October 2015
   		*/
// Lab05vst.java
// Student version of the Lab05 assignment.

import java.awt.*;
import java.applet.*;

public class ControlStructuresGraphics extends Applet {
	public void paint(Graphics g)
	{
		// width and height of window
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		
		// Draw bottom-left corner
		int xStart = 20;
		int yStart = 640;
		int xEnd = 10;
		int yEnd = 10;
		for(int k = 0; k <= 52; k++){
			g.drawLine(xStart, yStart, xEnd, yEnd);
			xStart += 12;
			yEnd +=12;
			} 
		// Draw bottom-right corner
		xStart = 980;
		yStart = 640;
		xEnd = 990;
		yEnd = 10;
		for(int k = 0; k <= 52; k++){
			g.drawLine(xStart, yStart, xEnd, yEnd);
			xStart -= 12;
			yEnd += 12;
			}
		// Draw top-right corner
		xStart = 990;
		yStart = 20;
		xEnd = 10;
		yEnd = 10;
		for(int k = 0; k <= 69; k++){
			g.drawLine(xStart, yStart, xEnd, yEnd);
			yStart += 9;
			xEnd += 14;
		}
			
		// Draw top-left corner
		xStart = 10;
		yStart = 10;
		xEnd = 0;
		yEnd = 640;
		for(int k = 0; k <= 69; k++){
			g.drawLine(xStart, yStart, xEnd, yEnd);
			xStart += 14;
			yEnd -= 9;
		}
			
	}
}
