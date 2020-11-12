import java.util.ArrayList;

/**
 * 
 * This sandwich class represents a generic sandwich, containing extras and costs associated with them.
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 */
public abstract class Sandwich implements Customizable {

    static final int MAX_EXTRAS = 6 ;
    static final double PER_EXTRA = 1.99 ;
    protected ArrayList<Extra> extras ;

    public abstract double price() ;
    public String toString() {
       
        return "" ;
        
    }

    public Sandwich() {

        extras = new ArrayList<Extra>() ;

    }
    
}
