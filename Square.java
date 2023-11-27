public class Square extends Rectangle{
    private double side = 1.0;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.Square = side;
    }
}
