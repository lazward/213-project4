import java.util.ArrayList;

public class Order implements Customizable {

    public static int lineNumber ;
    private ArrayList<OrderLine> orderLines ;
    
	@Override
	public boolean add(Object obj) {
        
        Sandwich s = (Sandwich)obj ;
        OrderLine newLine = new OrderLine(lineNumber, s, s.price()) ;
        orderLines.add(newLine) ;
        lineNumber++ ;
		return false;
	}
	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}