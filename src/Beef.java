/**
 * This is an extended sandwhich class for beef sandwiches.$
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 *
 */

public class Beef extends Sandwich {
    
    @Override
    public double price() {

        return 10.99 + (extras.size() * PER_EXTRA) ;

    }

    @Override
    public boolean add(Object obj) {
        extras.add((Extra)obj);
       return true;
    }

    @Override
    public boolean remove(Object obj) {
        extras.remove(extras.indexOf((Extra)obj));
        return true;
    }

    @Override
    public String toString() {

        String listOfExtras = "" ;

        for (Extra i : extras) {

            listOfExtras = listOfExtras.concat(i.name + ", ") ;

        }

        return "Beef Sandwich; Roast Beef, Provolone Cheese, Mustard, " + listOfExtras + "Price $" + price() ;

    }
    }
    