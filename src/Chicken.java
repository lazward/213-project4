public class Chicken extends Sandwich {

    @Override
    public double price() {

        return 8.99 + (extras.size() * PER_EXTRA) ;

    }
    
}
