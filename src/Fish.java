public class Fish extends Sandwich {

    @Override
    public double price() {

        return 12.99 + (extras.size() * PER_EXTRA) ;

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

        return "Fish Sandwich; " + listOfExtras + "Price $" + price() ;

    }

    }
    
}
