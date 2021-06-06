package com.vijay.todolist;

import com.vijay.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea todoDetailedView;

    public void initialize(){
        TodoItem item1 = new TodoItem("English Kaari Birthday","Buy 21st birthday card for English Kaari",
                LocalDate.of(2021, Month.DECEMBER,13));
        TodoItem item2 = new TodoItem("Doctor's Appointment","Appointment booked for you for your leg treatment",
                LocalDate.of(2021, Month.JUNE,9));
        TodoItem item3 = new TodoItem("Pickup dad","Pick up dad from railway station",
                LocalDate.of(2021, Month.JULY,23));
        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void handleMouseClick(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println(item);
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due Date : ");
        sb.append(item.getDeadline());
        todoDetailedView.setText(sb.toString());
    }
}
