import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;

import java.io.FileNotFoundException;

public class Controller {

    Order order = new Order();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("project4details.fxml"));
    Controller2 controller2 = loader.getController();
    

    @FXML
    ComboBox<String> sandSelector;

    @FXML
    ListView<String> includedIngredients, ingredientChoices, ingredientExtras;

    @FXML
    ImageView sandImage;

    public void initialize() {

        ObservableList<String> types = FXCollections.observableArrayList("Chicken", "Beef", "Fish");
        sandSelector.setItems(types);
        sandSelector.getSelectionModel().selectFirst();
        ObservableList<String> ingredients = FXCollections.observableArrayList("Fried Chicken", "Spicy Sauce", "Pickles");
        includedIngredients.getItems().setAll(ingredients);
        Image picture = new Image("https://natashaskitchen.com/wp-content/uploads/2020/06/Chicken-Sandwich-7.jpg") ;
        sandImage.setImage(picture) ;
        resetExtras() ;
        controller2.setView1Controller(this) ;

    }

    @FXML
    public void selectType(ActionEvent event) {

        event.consume();
        String value = (String) sandSelector.getValue();
        if (value.equals("Chicken")) {

            ObservableList<String> ingredients = FXCollections.observableArrayList("Fried Chicken", "Spicy Sauce", "Pickles");
            includedIngredients.getItems().setAll(ingredients);
            // Display image as needed

            //FileInputStream image = new FileInputStream("chicken_sammy.jpg") ;
            Image picture = new Image("https://natashaskitchen.com/wp-content/uploads/2020/06/Chicken-Sandwich-7.jpg") ;
            sandImage.setImage(picture) ;
            


        } else if(value.equals("Beef")) {

            ObservableList<String> ingredients = FXCollections.observableArrayList("Roast Beef", "Provolone Cheese", "Mustard") ;
            includedIngredients.getItems().setAll(ingredients) ;

            //FileInputStream image;
                //image = new FileInputStream("src/beef_sammy.jpg");
                Image picture = new Image("https://www.foxvalleyfoodie.com/wp-content/uploads/2018/01/arbys-roast-beef.jpg");
                sandImage.setImage(picture);

        } else { // Fish

            ObservableList<String> ingredients = FXCollections.observableArrayList("Grilled Snapper", "Cilantro", "Lime") ;
            includedIngredients.getItems().setAll(ingredients) ;

            //FileInputStream image;
            
                //image = new FileInputStream("src/fish_sammy.jpg");
                Image picture = new Image("https://www.msc.org/images/default-source/pt-library/filet-o-fish_traditional-not-traditional-sandwich_compressed.jpg?sfvrsn=422a65a4_0");
                sandImage.setImage(picture);
           
            
        }

        resetExtras() ;

    }

    @FXML
    public void ingredientAdd(ActionEvent event){

        event.consume() ;

        String selected = ingredientChoices.getSelectionModel().getSelectedItem() ;

        if (selected == null) {

            return ;

        }

        ingredientExtras.getItems().add(selected) ;
        ingredientChoices.getItems().remove(selected) ;


    }

    @FXML
    public void ingredientRemove(ActionEvent event) {

        event.consume() ;

        String selected = ingredientExtras.getSelectionModel().getSelectedItem() ;

        if (selected == null) {

            return ;

        }

        ingredientChoices.getItems().add(selected);
        ingredientExtras.getItems().remove(selected) ;


    }

    @FXML
    public void ingredientClear(ActionEvent event) {

        event.consume() ;
        resetExtras() ;

    }

    @FXML
    public void orderAdd(ActionEvent event) {

        event.consume() ;

    }
    
    @FXML
    public void orderShow(ActionEvent event){
        
    }

    public void resetExtras() {
        
        ObservableList<String> choices = FXCollections.observableArrayList("Spicy Mayo", "Onions", "Mushrooms", "Kimchi", "Colgate Toothpaste", "Milano Cookies", "Sesame Oil", "Ginger-Garlic Paste", "Caviar", "Jello") ;
        ingredientChoices.getItems().setAll(choices) ;
        ingredientExtras.getItems().clear() ;

    }
    
}
