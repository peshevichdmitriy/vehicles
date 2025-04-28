public class Tanker extends CargoVehicle implements Transportation{
    private final Propeller propeller;

    public Tanker(Cargo cargo){
        super(cargo);
        this.propeller = new Propeller("Tanker propeller");
    }
    @Override
    public void addCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
