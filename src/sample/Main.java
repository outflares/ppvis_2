package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Disk Shop");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void chooseFromList(){}

    public void chooseMode(){}

    public void chooseHowToPay(){}

    public void addSelected(){}

    public void showWindowOfWorkWithProduct(){}

    public void showModeOfAdmin(){}

    public void showModeOfShopper(){}

    public void deleteSelected(){}
}
