public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square with side length of " + length;
    }


}
