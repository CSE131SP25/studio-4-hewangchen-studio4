package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor();
		StdDraw.rectangle(.5, .5,.4 , .4);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(.5, .3, .4, .2);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(.5, .7, .4, .2);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledEllipse(.5, .5, .15, .15);
	}
}