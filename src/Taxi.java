public class Taxi extends Vehicle{
    private final Wheel wheel1;
    private final Wheel wheel2;
    private final Wheel wheel3;
    private final Wheel wheel4;

    public Taxi(){
        this.wheel1 = new Wheel("Taxi whell");
        this.wheel2 = new Wheel("Taxi whell");
        this.wheel3 = new Wheel("Taxi whell");
        this.wheel4 = new Wheel("Taxi whell");
    }
}
