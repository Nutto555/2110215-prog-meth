package component;

import application.ImageButtonType;
import application.Main;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import logic.TodoLogic;

public class ImageButton extends ImageView {
    private static final String addButtonUrl = "/plus-icon.png";
    private static final String removeButtonUrl = "/minus-icon.png";

    public ImageButton(ImageButtonType imageButtonType) {
        super();
        initImageButton(imageButtonType);
        initEventHandler(imageButtonType);
    }

    private void initImageButton(ImageButtonType imageButtonType) {
        setFitHeight(26);
        setFitWidth(26);
        switch (imageButtonType) {
            case ADD -> {
                setImage(new Image(addButtonUrl));
            }
            case REMOVE -> {
                setImage(new Image(removeButtonUrl));
            }
        }
    }

    private void initEventHandler(ImageButtonType imageButtonType) {
        setCursor(Cursor.HAND);
        setOnMouseClicked((mouseEvent) -> {
            if (imageButtonType.equals(ImageButtonType.ADD)) {
                TodoLogic.addTodo(Main.getAdderBarCurrentText());
            } else {
                TodoLogic.removeTodo(this);
            }
        });
    }
}
