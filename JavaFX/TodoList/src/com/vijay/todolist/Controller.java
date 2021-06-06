package com.vijay.todolist;

import com.vijay.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea todoDetailedView;
    @FXML
    private Label dueLabel;

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

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
                if(t1!=null){
                    handleMouseClick();
                }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    public void handleMouseClick(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println(item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due Date : ");
//        sb.append(item.getDeadline());
//        todoDetailedView.setText(sb.toString());
        todoDetailedView.setText(item.getDetails());
//        LocalDate date = item.getDeadline();
//        StringBuilder sb = new StringBuilder(String.valueOf(date.getDayOfMonth()));
//        sb.append("-");
//        sb.append(String.valueOf(date.getMonthValue()));
//        sb.append("-");
//        sb.append(String.valueOf(date.getYear()));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        dueLabel.setText(df.format(item.getDeadline()));
    }

    public void updateClick(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        ArrayList<String> searchList = new ArrayList<>();
        String change = todoDetailedView.getText();
        for(int i=0;i<todoItems.size();i++){
            if(todoItems.get(i).getDetails().equals(item.getDetails())){
                todoItems.get(i).setDetails(change);
                System.out.println(todoItems.get(i).getDetails());
                break;
            }
        }
//        String present = item.getDetails();
//        int index=
//        System.out.println(index);
    }
}
