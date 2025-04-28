public class Speedboat extends CargoVehicle implements Transportation{
    private final Propeller propeller;

    public Speedboat(Cargo cargo){
        super(cargo);
        this.propeller = new Propeller("Speedboat propeller");
    }
    @Override
    public void addCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
