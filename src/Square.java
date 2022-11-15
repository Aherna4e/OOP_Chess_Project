public class Square {
    private SquareColor sColor;
    private Location location;
    private boolean isTaken;

    public Square(SquareColor sColor, Location location){
        this.sColor = sColor;
        this.location = location;
        this.isTaken = false;
    }

    public void reset(){
        this.isTaken = false;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public SquareColor getsColor() {
        return sColor;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sColor=" + sColor +
                ", location=" + location +
                ", isTaken=" + isTaken +
                '}';
    }
}
