package jfxsetup;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.paint.*;

//implements EventHandler<ActionEvent>
public class JFXSetup extends Application  {

    Button btn2;
    int count = 0;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("This Is First JavaFx");

        Button btn1 = new Button("Click _Me");
        btn1.setTextFill(Color.BLUE);
        btn1.setMnemonicParsing(true);

        Tooltip tp = new Tooltip("Click Me To Save the Data");
        btn1.setTooltip(tp);

        //btn1.setStyle("-fx-border-color:black;-fx-background-color:white;");
        Alert alrt = new Alert(AlertType.INFORMATION, "Button ic clicked");

        btn1.setOnAction(eh -> alrt.show());

        btn2 = new Button("ok");
        btn2.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent ae) {
            count++;
            btn2.setText(" " + count);
            }
        });
        
        btn2.setPrefSize(100, 30);

        //FlowPane fp = new FlowPane();
        //fp.getChildren().add(btn1);
        FlowPane fp2 = new FlowPane(btn2);
        //fp2.getChildren().add(btn2);

        Scene sc1 = new Scene(fp2, 700, 400);
        //Scene sc = new Scene(fp,700,400);

        stage.setScene(sc1);
        stage.show();
    }

    /*@Override
    public void handle(ActionEvent ae) {
        count++;
        btn2.setText(" " + count);
    }*/

    public static void main(String[] args) {
        launch(args);
    }

}
