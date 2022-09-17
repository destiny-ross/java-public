package composition;

public class Bed {
    private Mattress mattress;
    private BedFrame bedframe;
    private int pillows;
    private int height;

    public Bed(Mattress mattress, BedFrame bedframe, int pillows, int height) {
        this.mattress = mattress;
        this.bedframe = bedframe;
        this.pillows = pillows;
        this.height = height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public void makeBed(){
        System.out.println("Bed -> Make bed");
    }
}


class Mattress {
    private String manufacturer;
    private String model;
    private String size;

    public Mattress(String manufacturer, String model, String size) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getSize(){
        return size;
    }
}

class BedFrame {
    private String style;
    private String material;
    private String color;
    private boolean needsBoxspring;

    public BedFrame(String style, String material, String color, boolean needsBoxspring) {
        this.style = style;
        this.material = material;
        this.color = color;
        this.needsBoxspring = needsBoxspring;
    }

    public String getStyle() {
        return style;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isNeedsBoxspring() {
        return needsBoxspring;
    }
}