package polymorphism;

public class Buick extends Car {
    public Buick(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Buick -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Buick -> accelerate()";
    }

    @Override
    public String brake() {
        return "Buick -> brake()";
    }
}