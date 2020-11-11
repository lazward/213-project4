import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller2 implements Initializable {

    Controller view1Controller ;

    @FXML
    Button orderDupe, orderRemove, orderClear, orderBack, orderSave;
    
    @FXML
    ListView<String> orderList;

    @FXML
    TextField orderTotal;

    public void initialize(URL location, ResourceBundle resource) {

        //refresh();

    }

    public void setView1Controller(Controller c) {

        view1Controller = c ;

    }


    public void dupeOrder(ActionEvent event){

        event.consume();




    }

    public void removeOrder(ActionEvent event){
        event.consume();
        
	//remove from listview
    String selected = orderList.getSelectionModel().getSelectedItem() ;
    view1Controller.order.remove(view1Controller.order.getOrders().get(orderList.getSelectionModel().getSelectedIndex())) ;
    orderList.getItems().remove(selected);
    System.out.println("Removed from Listview");
    refresh() ;
        
    }
    public void clearOrder(ActionEvent event){
        event.consume();


        
    }
    public void backOrder(ActionEvent event){
        
        event.consume();


        
    }

    /** */
    public void refresh(){

        System.out.println("refreshing");

        //refresh the listview
        orderList.getItems().clear() ;
        System.out.println("orderlistcleared");

        try {
            System.out.println("orderlsit output");

        ArrayList<OrderLine> orders = view1Controller.order.getOrders() ;
        //populates the listview
            for(int i =0 ; i < orders.size(); i ++){
                System.out.println("should be here");
                orderList.getItems().add((i + 1) + " " + orders.get(i).getSammy().toString());
            }
        } catch (Exception e) {

            e.printStackTrace();
            return ;

        }
        

    }




    
}
