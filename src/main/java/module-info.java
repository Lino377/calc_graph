module org.example.orthogonal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.orthogonal to javafx.fxml;
    exports org.example.orthogonal;
}