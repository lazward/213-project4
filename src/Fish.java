/**
 * 
 * This class represents a sandwich made with Fish.
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 */

public class Fish extends Sandwich {

    @Override
    public double price() {

        return 12.99 + (extras.size() * PER_EXTRA) ;

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

        return "Fish Sandwich; Grilled Snapper, Cilantro, Lime, " + listOfExtras + "Price $" + price() ;

    }

    }
