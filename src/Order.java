import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Order implements Customizable {

    public static int lineNumber ;
	private ArrayList<OrderLine> orderLines ;
	
	public Order() {

		lineNumber = 0 ;
		orderLines = new ArrayList<OrderLine>() ;

	}
	

	@Override
	public boolean add(Object obj) {
		
		lineNumber = orderLines.size() + 1 ;
        Sandwich s = (Sandwich)obj ;
        OrderLine newLine = new OrderLine(lineNumber, s, s.price()) ;
        orderLines.add(newLine) ;
		return false;
	}
	@Override
	public boolean remove(Object obj) {
		//find element in arraylist, remove, remove it from list view, reoder as needed

		OrderLine tempLine = (OrderLine)obj;
		
		if(orderLines.indexOf(tempLine) == -1){
			//not found
			return false;
		}else{
			//remove from arraylist
			orderLines.remove(orderLines.indexOf(tempLine));
		}
	
		sortOrders(orderLines);

		return true;
	}


	public void sortOrders(ArrayList<OrderLine> sammies){
		//when removing an order from orderlines, we have to re-order all other sandwhiches in the orderline

		//go through and re-order everything
		for(int i =0; i < sammies.size(); i++){
			int curr = i +1;
			sammies.get(i).setLineNum(curr);
		}

	}

	public ArrayList<OrderLine> getOrders() {

		return orderLines ;

	}

}