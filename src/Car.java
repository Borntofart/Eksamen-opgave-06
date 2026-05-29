public class Car {

    //attributes
    String model;
    Engine engine;

    //constructor
    public Car(String model) {
        this.engine = new Engine();
        this.model = model;
    }

    //metoder

    void start() {
    engine.start();

    }

    void stop () {
    engine.stop();

    }


}
