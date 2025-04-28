public class Plane extends CargoVehicle implements Transportation {
    private final Wheel wheel1;
    private final Wheel wheel2;
    private final Wing wing1;
    private final Wing wing2;
    private final Propeller propeller;

    public Plane(Cargo cargo){
        super(cargo);
        this.wheel1 = new Wheel("Plane wheel");
        this.wheel2 = new Wheel("Plane wheel");
        this.wing1 = new Wing("Plane wing");
        this.wing2 = new Wing("Plane wing");
        this.propeller = new Propeller("Plane propeller");
    }
    @Override
    public void addCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
