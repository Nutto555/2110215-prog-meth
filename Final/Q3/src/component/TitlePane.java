package component;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TitlePane extends BorderPane {
    private Text title;

    public TitlePane() {
        super();
        initTitle();
        setBackground(new Background(new BackgroundFill(Color.DARKSLATEBLUE, null, null)));
        setPrefHeight(100);
        setCenter(title);
    }

    private void initTitle() {
        title = new Text();
        title.setFont(new Font("Roboto",48));
        title.setText("Todo App");
    }

    public Text getTitle() {
        return title;
    }

    public void setTitle(Text title) {
        this.title = title;
    }

}
