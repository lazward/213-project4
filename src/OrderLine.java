/**
 * 
 * This class represents an orderline. It has methods for the retrival and maniuplation of specific components.
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 */

public class OrderLine {

    private int lineNumber ;
    private Sandwich sandwich ;
    private double price ;

    public OrderLine(int n, Sandwich s, double p) {

        lineNumber = n ;
        sandwich = s ;
        price = p ;

    }

    public int getLineNum(){
        return lineNumber;
    }

    public void setLineNum(int n){
        lineNumber = n;
    }
    
    public Sandwich getSammy() { // Aarif wanted to make a method called getSammy so here we are..

        return sandwich ;

    }

    public double getPrice() {

        return price ;

    }
    
}
