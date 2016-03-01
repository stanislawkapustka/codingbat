package utils;

import data.Point;

public class AzimuthLengthMethods {

	public double Azimuth(Point p1, Point p2) {
		final double RG = 200 / Math.PI;
		double dx;
		double dy;
		double solution;

		dx = p2.getX() - p1.getX();
		dy = p2.getY() - p1.getY();

		if (dx == 0) {
			if (dy > 0) {
				solution = Math.PI / 2;
			} else {
				solution = 1.5 * Math.PI;
			}
		} else {
			solution = Math.atan(dy / dx);
			if (dx < 0) {
				solution += Math.PI;
			} else {
				solution = solution + 2 * Math.PI;
			}
		}

		solution = solution * RG;

		if (solution > 400) {
			solution = solution - 400;
		}

		return solution;
	}

	public double Length(Point p1, Point p2) {
		double dx;
		double dy;
		double solution;

		dx = p2.getX() - p1.getX();
		dy = p2.getY() - p1.getY();

		solution = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		return solution;

	}
}
