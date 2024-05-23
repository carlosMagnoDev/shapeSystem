package entities;

import entiries.ennum.Color;

public class Circle extends Shape{
	private final double pi = 3.14;
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area () {
		return pi * (radius * radius);
	}
	
	
}
