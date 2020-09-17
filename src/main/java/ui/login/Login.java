package ui.login;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Login extends Application {
    @Override
    public void start(Stage primaryStage) {
        Stage root = new Stage();
        root.setWidth(Screen.getPrimary().getBounds().getWidth() / 3);
        root.setHeight(Screen.getPrimary().getBounds().getHeight() / 3);
        root.setX(100);
        root.setY(300);
        root.setTitle("登录数据库");
        Group group = new Group();
        group.getChildren().add(new Button("登录"));
        Scene scene = new Scene(group);
        root.setScene(scene);
        root.show();
    }
}
