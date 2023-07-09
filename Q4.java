interface Drawable {
    void draw();
}

class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius ");
    }
}

class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width ");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}