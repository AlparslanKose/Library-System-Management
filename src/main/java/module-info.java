module com.example.alpbaba {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
//
//
//    opens com.example.alpbaba.controller to javafx.fxml;
//    exports com.example.alpbaba.controller;
//
//
//    opens com.example.controller to javafx.fxml;
//    exports com.example.controller;

    exports com.example.alpbaba;
    opens com.example.alpbaba to javafx.fxml;
    exports com.example.alpbaba.controllers;
    opens com.example.alpbaba.controllers to javafx.fxml;
}