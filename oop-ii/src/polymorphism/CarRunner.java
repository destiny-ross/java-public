package polymorphism;

public class CarRunner {
    public static void run() {
        Car car = new Car(8, "Base");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(8, "Spyder GS");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car buick = new Buick(8, "Encore GX");
        System.out.println(buick.startEngine());
        System.out.println(buick.accelerate());
        System.out.println(buick.brake());
    }
}