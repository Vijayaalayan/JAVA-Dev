package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;;
    @FXML
    private Button click;
    @FXML
    private Button bye;
    @FXML
    private CheckBox toClearCheck;
    @FXML
    private Button deletion;
    @FXML
    private Label toChangeLabel;
    public void initialize(){
        click.setDisable(true);
        bye.setDisable(true);
        deletion.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
        String text = nameField.getText();
        text = text.trim();
        if(e.getSource().equals(click)){
            System.out.println(text+", you have clicked me");
        }else if(e.getSource().equals(bye)){
            System.out.println("Bye, "+text);
        }
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String t = Platform.isFxApplicationThread()?"UI Thread":"Background Thread";
                    System.out.println("Working in "+t);
                    Thread.sleep(5000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String t = Platform.isFxApplicationThread()?"UI Thread":"Background Thread";
                            System.out.println("Working in "+t);
                            toChangeLabel.setText("We changed");
                        }
                    });
                }catch (Exception exception){
//                    We do nothing here
                }
            }
        };

        new Thread(task).start();

        if(toClearCheck.isSelected()){
            nameField.clear();
            click.setDisable(true);
            bye.setDisable(true);
            deletion.setDisable(true);
        }
    }

    @FXML
    public void handleKeyPressed(){
        String text = nameField.getText();
        boolean disable = text.isEmpty() || text.trim().isEmpty();
        click.setDisable(disable);
        bye.setDisable(disable);
        deletion.setDisable(disable);
    }

    @FXML
    public void setToClearCheck(){
        System.out.println("Check box is "+(toClearCheck.isSelected()?"checked":"not checked"));
    }

    @FXML
    public void setDeletion(){
        nameField.clear();
        click.setDisable(true);
        bye.setDisable(true);
        deletion.setDisable(true);
    }
}
