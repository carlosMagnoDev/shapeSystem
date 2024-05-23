package entities;

import entiries.ennum.Color;

public class Rectangle extends Shape{
	private Double widht;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Double widht, Double height, Color color) {
		super(color);
		this.widht = widht;
		this.height = height;
	}

	public Double getWidht() {
		return widht;
	}

	public void setWidht(Double widht) {
		this.widht = widht;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	@Override
	public Double area () {
		return widht * height;
	}
	
	
	
}
