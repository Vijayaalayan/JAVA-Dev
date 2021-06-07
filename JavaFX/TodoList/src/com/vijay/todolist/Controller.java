package com.vijay.todolist;

import com.vijay.todolist.datamodel.TodoData;
import com.vijay.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea todoDetailedView;
    @FXML
    private Label dueLabel;
    @FXML
    private BorderPane mainBorderPane;

    public void initialize(){
//        TodoItem item1 = new TodoItem("English Kaari Birthday","Buy 21st birthday card for English Kaari",
//                LocalDate.of(2021, Month.DECEMBER,13));
//        TodoItem item2 = new TodoItem("Doctor's Appointment","Appointment booked for you for your leg treatment",
//                LocalDate.of(2021, Month.JUNE,9));
//        TodoItem item3 = new TodoItem("Pickup dad","Pick up dad from railway station",
//                LocalDate.of(2021, Month.JULY,23));
//        todoItems = new ArrayList<>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//
//        TodoData.getInstance().setTodoItems(todoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
                if(t1!=null){
                    handleMouseClick();
                }
            }
        });

//        todoListView.getItems().setAll(todoItems);
        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void showNewItemDialog(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }catch (IOException e){
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            DialogController controller = fxmlLoader.getController();
            controller.processResults();
            System.out.println("OK pressed");
        }else {
            System.out.println("Cancel pressed");
        }
    }

    @FXML
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

//    @FXML
//    public void updateClick(){
//        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        ArrayList<String> searchList = new ArrayList<>();
//        String change = todoDetailedView.getText();
//        for(int i=0;i<todoItems.size();i++){
//            if(todoItems.get(i).getDetails().equals(item.getDetails())){
//                todoItems.get(i).setDetails(change);
//                System.out.println(todoItems.get(i).getDetails());
//                break;
//            }
//        }
//        String present = item.getDetails();
//        int index=
//        System.out.println(index);
//    }
}
