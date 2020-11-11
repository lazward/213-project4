public class Beef extends Sandwich {
    
    @Override
    public double price() {

        return 10.99 + (extras.size() * PER_EXTRA) ;

    }

    @Override
    public String toString() {

        return "Beef Sandwich, Roast Beef, Provolone Cheese, Mustard, " ;

    }

    @Override
    public boolean add(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {

        String listOfExtras = "" ;

        for (Extra i : extras) {

            listOfExtras = listOfExtras.concat(" " + i.name + ",") ;

        }

        return "Beef Sandwich; " + listOfExtras + "Price $" + price() ;

    }
    }
    

}
