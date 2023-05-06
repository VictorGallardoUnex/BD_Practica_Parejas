module es.unex.bd_practica {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.unex.bd_practica to javafx.fxml;
    exports es.unex.bd_practica;
}