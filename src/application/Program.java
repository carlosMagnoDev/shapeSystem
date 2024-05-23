package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entiries.ennum.Color;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int number = input.nextInt();
		
		for (int i = 0; i < number; i++) {
			input.nextLine();
			System.out.printf("Shape #%d data:", i + 1);
			
			System.out.print("\nRectangle or Circle (r/c)? ");
			String r = input.nextLine().toLowerCase();
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next().toUpperCase());
			
			if (r.equals("r")) {
				
				System.out.print("Widht: ");
				Double widht = input.nextDouble();
				
				System.out.print("Heigh: ");
				Double heigh = input.nextDouble();
				
				Shape shape = new Rectangle(widht, heigh, color);
				list.add(shape);
				// or : list.add(new Rectangle(widht, heigh, color);
				
			} else if (r.equals("c")) {
				System.out.print("Radius: ");
				Double radius = input.nextDouble();
				
				Shape shape = new Circle(radius, color);
				list.add(shape);
				
			} else {
				System.out.println("Error!");
			}
		}
		
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		input.close();
	}
}
