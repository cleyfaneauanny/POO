/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author cleyf
 */
public class Rectangle extends Shape {
    private Double width;
    private Double height;
	
    public Rectangle() {
	super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
	this.width = width;
	this.height = height;
    }

    public Double getWidth() {
	return width;
    }

    public void setWidth(Double width) {
	this.width = width;
    }

    public Double getHeight() {
	return height;
    }

    public void setHeight(Double height) {
	this.height = height;
    }

	
    public double area() {
        return width * height;
    }
    
}
