package com.test;

import java.util.HashMap;
import java.util.Map;

/*
 * For memory optimization we need FlyWeightDesing Pattern 
 * 
 *  FlyWeight Design Pattern Principal
 *  ******************************************************
 *  1) If all object having common property with fixed size then you can use this desing pattern
 *     to optimize the memory.
 *     
 *     for more info: refer diagram 
 */


interface Shape {
    void draw();
    public int getX();
    public int getY();
    public int getRadius();
    
    public void setX(int x);
    public void setY(int y);
    public void setRadius(int radius);
    
}


class Circle implements Shape {
	
    private String color;
    
    private int x;
    
    private int y;
    
    private int radius;
    

    public Circle(String color) {
        this.color = color;
    }
    
    

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle");
        this.getData();
    }



	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}



	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}



	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return this.radius;
	}



	@Override
	public void setX(int x) {
		// TODO Auto-generated method stu
		this.x=x;
		
	}



	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
	  this.y=y;	
	}



	@Override
	public void setRadius(int radius) {
		// TODO Auto-generated method stub
		this.radius=radius;
	}



	
	public void getData() {
		System.out.println( "color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius);
	}
	
	


}

// Flyweight Factory
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a new " + color + " circle");
        }

        return circle;
    }
}

// Client
public class FlyWeightDP {
    private static final String[] colors = {"Red", "Green", "Blue"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            String color = colors[(int) (Math.random() * colors.length)];
            Shape circle = ShapeFactory.getCircle(color);
             circle.setX(i);
             circle.setY(i+100);
             circle.setRadius(100);
                 
            circle.draw();
        }
    }
}
