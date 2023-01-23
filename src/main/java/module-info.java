module com.example.pharmacyreport {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.jfoenix;


    opens com.example.pharmacyreport to javafx.fxml;
    exports com.example.pharmacyreport;
}