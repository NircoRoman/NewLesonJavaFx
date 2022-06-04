module ru.gb.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.javafx to javafx.fxml;
    exports ru.gb.javafx;
}