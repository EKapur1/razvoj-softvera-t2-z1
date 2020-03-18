package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label labelaHello;

    public void dugmeHello(ActionEvent actionEvent) {
        labelaHello.setText("Hello World!");
    }
}
