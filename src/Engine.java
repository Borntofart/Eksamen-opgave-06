public class Engine {

    private boolean running = false;


    //Metoder

    public void start() {
        if (running == true) {
            System.out.println("The car is already running!");
            isRunning();
        } else {
            running = true;
            System.out.println("Car is now running VROOOOM");
            isRunning();
        }

    }

    public void stop() {
        running = false;
        System.out.println("BRAKEEEEEEE car is no longer running");
        isRunning();
    }

    public boolean isRunning() {
        System.out.println("Is the car running? " + running);
        return running;
    }






}
