module com.example.progettoesameispwalessandrodifilippo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progettoesameispwalessandrodifilippo to javafx.fxml;
    exports com.example.progettoesameispwalessandrodifilippo;
}