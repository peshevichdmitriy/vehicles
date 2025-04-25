public class Plane extends Vehicles implements Transportation{
    private final Wheel wheel1, wheel2;
    private final Wing wing1, wing2;
    private final Propeller propeller;

    public Plane(){
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wing1 = new Wing();
        this.wing2 = new Wing();
        this.propeller = new Propeller();
    }
    @Override
    public void carriesCargo() {

    }
}
