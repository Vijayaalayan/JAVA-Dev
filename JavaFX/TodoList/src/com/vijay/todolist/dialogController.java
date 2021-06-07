package com.vijay.todolist;

import com.vijay.todolist.datamodel.TodoData;
import com.vijay.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsField;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults(){
        String shortDesctiption = shortDescriptionField.getText().trim();
        String details = detailsField.getText().trim();
        LocalDate date = deadlinePicker.getValue();

        TodoItem item = new TodoItem(shortDesctiption,details,date);
        TodoData.getInstance().addTodoItem(item);
        return item;
    }
}
