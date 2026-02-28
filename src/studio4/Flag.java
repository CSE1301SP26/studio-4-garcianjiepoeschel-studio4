package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(Color.RED);
		// StdDraw.setPenColor(255, 0, 0);
		/*
		 * StdDraw.filledRectangle(0.5, 0.125, 0.5, 0.125);
		 * StdDraw.setPenColor(Color.GREEN);
		 * StdDraw.filledRectangle(0.5, 0.375, 0.50, 0.125);
		 * StdDraw.setPenColor(Color.BLUE);
		 * StdDraw.filledRectangle(0.5, 0.625, 0.50, 0.125);
		 */
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.2);

	}

}