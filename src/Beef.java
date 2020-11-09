public class Beef extends Sandwich {
    
    @Override
    public double price() {

        return 10.99 + (extras.size() * PER_EXTRA) ;

    }

    @Override
    public String toString() {

        return "Beef Sandwich, Roast Beef, Provolone Cheese, Mustard, " ;

    }

}
