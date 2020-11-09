public class Fish extends Sandwich {

    @Override
    public double price() {

        return 12.99 + (extras.size() * PER_EXTRA) ;

    }
    
}
