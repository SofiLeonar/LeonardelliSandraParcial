public class Rectangle {
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
