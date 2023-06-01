package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class OrderController implements Initializable {

    @FXML
    Label name1, name2, name3, price1, price2, price3;

    @FXML
    ImageView img1, img2, img3;

    public void initialize(URL location, ResourceBundle resources) {

         if (HomeController.blamp.getProductStatus()){
            name1.setText(HomeController.blamp.getProductName());
            price1.setText(Double.toString(HomeController.blamp.getProductPrice()));

         }
    }
}