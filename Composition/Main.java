class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(); // Sirf Car banayi
        car.startCar(); // Car ke through Engine use ho raha hai
    }
}