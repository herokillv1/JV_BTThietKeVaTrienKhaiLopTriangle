package triangle;

import shape.Shape;

public class Triangle extends Shape {
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;
    public double p = (this.getPerimeter()/2);
    public double h = 2*((Math.pow((this.p*(this.p-this.size1)*(this.p-this.size2)*(this.p-this.size3)),0.5)/(this.size1)));

    public Triangle(){
    }

    public Triangle(double size1,double size2,double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(double size1,double size2,double size3,String color,boolean filled){
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getPerimeter(){
        return this.size1+this.size2+this.size3;
    }

    public double getArea(){
        return (size1*this.h)/2;
    }

    @Override
    public String toString() {
        return "Tam giác có màu : " + this.getColor() + "\n"+
                "Filled : " + (isFilled() ? "filled" : "not filled") + "\n" +
                "3 cạnh của tam giác là : " + this.size1 + "\t" + this.size2 + "\t"+ "\t"+ this.size3 + "\t" + "\n" +
                "Chu vi vủa tam giác là : " + this.getPerimeter() + "\n" +
                "Diện tích tam giác là : " +this.getArea();
    }
}
