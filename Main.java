public class Main {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();
        myRectangle.setLength(5);
        myRectangle.setWidth(4);
        myRectangle.setColor("green");

        System.out.println("Color: " + myRectangle.getColor());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Length: " + myRectangle.getLength());
    }
}
