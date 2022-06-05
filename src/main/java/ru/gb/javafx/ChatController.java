package ru.gb.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Date;

public class ChatController {
    public TextArea ChatHistory;
    Date date = new Date();
    @FXML
    private TextField chatHistory;
    @FXML
    private TextField chatEnter;

    @FXML
    protected void userChatClick() {
        String text = chatEnter.getText();
        if (text.isEmpty()) {
            return;
        }
        chatHistory = chatEnter;
        ChatHistory.appendText(date + " - "+ text + "\n");
        chatEnter.clear();
        chatEnter.requestFocus();
    }

}
