/**
 * This class represents a type sandwich made with Chicken.
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 *
 */

public class Chicken extends Sandwich {

    @Override
    public double price() {

        return 8.99 + (extras.size() * PER_EXTRA) ;

    }

    @Override
    public boolean add(Object obj) {

       //Adding extras into extra

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

        return "Chicken Sandwich; Fried Chicken, Spicy Sauce, Pickles, " + listOfExtras + "Price $" + price() ;

    }
    
}
