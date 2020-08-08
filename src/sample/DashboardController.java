package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
//    @FXML private Label lblErrors;
    @FXML private Pane navbar;
    @FXML private AnchorPane sidebar;
    @FXML private AnchorPane newPro;
    @FXML private AnchorPane listPro;
    @FXML private AnchorPane orders;
    @FXML private AnchorPane sales;
    @FXML private AnchorPane finishedPro;
    @FXML private Pane business;
    @FXML private Pane histories;
    @FXML private AnchorPane homepage;
//    @FXML private AnchorPane adpagepane;
    @FXML private TextField pro_name;
    @FXML private TextField pro_quantity;
    @FXML private TextField pro_price;
    @FXML private TextField pro_made;
//    @FXML private Label label1;
    @FXML private TableView<ListProduct> table;
    @FXML private TableColumn<ListProduct,String> col_id;
    @FXML private TableColumn<ListProduct,String> col_name;
    @FXML private TableColumn<ListProduct,String> col_made_in;
    @FXML private TableColumn<ListProduct,Integer> col_quantity;
    @FXML private TableColumn<ListProduct,Integer> col_price;

    ObservableList<ListProduct> list = FXCollections.observableArrayList();

    //ListProduct();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ListProduct listProduct = new ListProduct("1","roba",  1,"ethio",1);
        ListProduct listProduct1 = new ListProduct("2","roba1",  3,"tyland",3);
        list.add(listProduct);
        list.add(listProduct1);
        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_made_in.setCellValueFactory(new PropertyValueFactory<>("made_in"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
        table.setItems(list);
//        if (isFront(business)){
//
//        }
    }
    public void selectProductList(ActionEvent actionEvent){
        ListProduct selected = table.getSelectionModel().getSelectedItem();
        if (selected != null){
            pro_name.setText(selected.getName());
            pro_quantity.setText(selected.getQuantity()+"");
            pro_made.setText(selected.getMade_in());
            pro_price.setText(selected.getPrice()+"");
        }
    }
    public void editProductList(ActionEvent actionEvent){
        if (!pro_quantity.getText().equals(null) && !pro_made.getText().equals(null)
                && !pro_price.getText().equals(null) && !pro_name.getText().equals(null)){
            try{
                int quantity = Integer.parseInt(pro_quantity.getText());
                String madein = pro_made.getText();
                int price = Integer.parseInt(pro_price.getText());
                String name = pro_name.getText();
                System.out.println(price +" ## "+ madein);
            }catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Alert");
                alert.setContentText("Price and Quantity must be a Number");
                alert.setHeaderText(null);
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Alert");
            alert.setContentText("You have to fill all Elements");
            alert.setHeaderText(null);
            alert.showAndWait();
        }

    }
    public void Home(ActionEvent event) throws IOException {
        homepage.toFront();
        navbar.toFront();
        sidebar.toFront();
        System.out.println(business.isVisible());
    }
    public void NewPro(ActionEvent event) throws IOException {
        newPro.toFront();
        navbar.toFront();
        sidebar.toFront();
    }
    public void ListPro(ActionEvent event) throws IOException {
        listPro.toFront();
        navbar.toFront();
        sidebar.toFront();
    }
    public void Orders(ActionEvent event) throws IOException {
        orders.toFront();
        navbar.toFront();
        sidebar.toFront();
    }
    public void Sales(ActionEvent event) throws IOException {
        sales.toFront();
        navbar.toFront();
        sidebar.toFront();
    }
    public void FinishedPro(ActionEvent event) throws IOException {
        finishedPro.toFront();
        navbar.toFront();
        sidebar.toFront();
    }
    public void Bussiness(ActionEvent event) throws IOException {
        business.toFront();
        navbar.toFront();
        sidebar.toFront();
    }
    public void History(ActionEvent event) throws IOException {
        histories.toFront();
        navbar.toFront();
        sidebar.toFront();
    }
}
