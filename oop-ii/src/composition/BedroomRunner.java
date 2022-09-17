package composition;

public class BedroomRunner {
    public static void run() {
        Wall wall1 = new Wall("West", 14, 12, "white");
        Wall wall2 = new Wall("North", 20, 12, "white");
        Wall wall3 = new Wall("East", 14, 12, "white");
        Wall wall4 = new Wall("South", 20, 12, "white");

        Ceiling ceiling = new Ceiling(12, "white");

        Mattress mattress = new Mattress("Purple", "Hybrid Premier 4", "Full");
        BedFrame bedFrame = new BedFrame("Modern", "acacia", "natural", false);
        Bed bed = new Bed(mattress, bedFrame, 2, 2);
        Lamp lamp = new Lamp("Modern", false, 75);

        Bedroom bedroom = new Bedroom("Destiny's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
