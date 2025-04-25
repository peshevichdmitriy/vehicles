public class Tanker extends Vehicles implements Transportation{
    private final Propeller propeller;

    public Tanker(){
        this.propeller = new Propeller();
    }
    @Override
    public void carriesCargo() {

    }
}
