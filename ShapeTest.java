package S3Workshop_4;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class ShapeTest {

    public static class Shape {
        public double area() {
            return 0;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }
    }

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.area(), 0.0001);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50.00, rectangle.area());
    }

    @Test
    public void testShapeArea() {
        Shape shape = new Shape();
        assertEquals(0.0, shape.area());
    }
}
