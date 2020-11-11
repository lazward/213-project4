public class OrderLine {

    private int lineNumber ;
    private Sandwich sandwich ;
    private double price ;

    public OrderLine(int n, Sandwich s, double p) {

        lineNumber = n ;
        sandwich = s ;
        price = p ;

    }

    public int getLineNum(OrderLine line){
        return line.lineNumber;
    }

    public void setLineNum(int n){
        lineNumber = n;
    }
    
    public Sandwich getSammy() { // Aarif wanted to make a method called getSammy so here we are..

        return sandwich ;

    }
    
}
