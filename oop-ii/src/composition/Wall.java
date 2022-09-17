package composition;

public class Wall {
    private String direction;
    private int length;
    private int height;
    private String color;

    public Wall(String direction, int length, int height, String color) {
        this.direction = direction;
        this.length = length;
        this.height = height;
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getArea() {
        return length * height;
    }
}