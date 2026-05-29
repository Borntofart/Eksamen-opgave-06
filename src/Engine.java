public class Engine {

    private boolean running = false;


    //Metoder

    public void start() {
        if (running == true) {
            System.out.println("The car is already running!");
        } else {
            running = true;
            System.out.println("Car is now running VROOOOM");
        }

    }

    public void stop() {
        running = false;
        System.out.println("BRAKEEEEEEE car is no longer running");
    }

    public void isRunning(boolean running) {
        System.out.println("Is the car running? " + running);
    }






}
