module ku.cs.lab02basicjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.lab02basicjavafx to javafx.fxml;
    exports ku.cs.lab02basicjavafx;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}