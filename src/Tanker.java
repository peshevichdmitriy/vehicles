public class Tanker extends Vehicle implements Transportation{
    private final Propeller propeller;

    public Tanker(){
        this.propeller = new Propeller("Tanker propeller");
    }
    @Override
    public void carryCargo() {

    }
}
