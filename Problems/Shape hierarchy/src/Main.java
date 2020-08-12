abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double length1;
    double length2;
    double length3;

    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double getPerimeter() {
        return length1 + length2 + length3;
    }

    @Override
    double getArea() {
        double area = getPerimeter() * (getPerimeter() - length1) * (getPerimeter() - length2) * (getPerimeter() - length3);
        return Math.sqrt(area);
    }
}

class Rectangle extends Shape {
    double length1;
    double length2;

    public Rectangle(double length1, double length2) {
        this.length1 = length1;
        this.length2 = length2;
    }

    @Override
    double getPerimeter() {
        return (length1 + length2) * 2;
    }

    @Override
    double getArea() {
        return length1 * length2;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
