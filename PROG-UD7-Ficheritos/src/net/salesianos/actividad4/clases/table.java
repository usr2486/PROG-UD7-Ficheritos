package clases;

public class table {
    private String color;
    private int legNumber;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    public table(String color, int legNumber) {
        this.color = color;
        this.legNumber = legNumber;
    }

        @Override
    public String toString() {
        return "Mesa de color " + color + " con " + legNumber + " patas.";
    }
}
