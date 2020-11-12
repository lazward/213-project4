import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * 
 * This is the second controller class for the 'order' GUI section.
 * It features methods for order manipulation, such as deletion and duplication.
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 */
public class Controller2 implements Initializable {

    Controller view1Controller ;

    @FXML
    Button orderDupe, orderRemove, orderClear, orderBack, orderSave;
    
    @FXML
    ListView<String> orderList;

    @FXML
    TextField orderTotal;

    public void initialize(URL location, ResourceBundle resource) {


    }

    public void setView1Controller(Controller c) {

        view1Controller = c ;

    }


    @FXML
    public void dupeOrder(ActionEvent event){

        event.consume();
       //Add to the end of the list

       String selected = orderList.getSelectionModel().getSelectedItem() ;
       if (selected == null) {
        
            return ;
        
       }
       view1Controller.order.add(view1Controller.order.getOrders().get(orderList.getSelectionModel().getSelectedIndex()).getSammy()) ;
       orderList.getItems().add(selected);
       
        refresh() ;



    }

    @FXML
    public void removeOrder(ActionEvent event){
        
        event.consume();
        
	//remove from listview
    String selected = orderList.getSelectionModel().getSelectedItem() ;
    if (selected == null) {
        
        return ;
    
   }
    view1Controller.order.remove(view1Controller.order.getOrders().get(orderList.getSelectionModel().getSelectedIndex())) ;
    orderList.getItems().remove(selected);
    //System.out.println("Removed from Listview");
    refresh() ;
        
    }
    public void clearOrder(ActionEvent event){
        event.consume();
        view1Controller.order = new Order() ;
        orderList.getItems().clear() ;
        priceUpdate() ;
        
    }

    public void backOrder(ActionEvent event){
        
        event.consume();

        Stage stage = (Stage)orderBack.getScene().getWindow() ;
        stage.close() ;
        
    }

    @FXML
    public void saveOrder(ActionEvent event) {

        event.consume() ;
        FileChooser fileChooser = new FileChooser() ;
        fileChooser.setTitle("Save order list") ;
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text documents (*.txt)", "*.txt")) ;
        File file = fileChooser.showSaveDialog(orderList.getScene().getWindow()) ;

        try {

            FileWriter writer = new FileWriter(file) ;
            for (String i : orderList.getItems()) {

                writer.write(i + "\n") ;

            }

            writer.write("Total price: $" + orderTotal.getText() + "\n") ;

            writer.close() ;

        } catch (Exception e) {


        }

    }

    /** */
    public void refresh(){

        //refresh the listview
        orderList.getItems().clear() ;

        try {

        ArrayList<OrderLine> orders = view1Controller.order.getOrders() ;
        //populates the listview
            for(int i =0 ; i < orders.size(); i ++){
                
                orderList.getItems().add((i + 1) + " " + orders.get(i).getSammy().toString());
                
            }

        } catch (Exception e) {

            //e.printStackTrace();
            return ;

        }

        priceUpdate() ;
        

    }

    public void priceUpdate() {

        ArrayList<OrderLine> orders = view1Controller.order.getOrders() ;

        double sum = 0;
        for(int i = 0 ; i < orders.size(); i++){
             sum += orders.get(i).getPrice() ;
        }
        
        
        orderTotal.setText(String.format("%.2f", sum)) ;
        
    }


    
}
