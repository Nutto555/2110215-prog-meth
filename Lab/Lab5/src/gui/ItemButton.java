package gui;

import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.geometry.Insets;

public class ItemButton extends Button {
    // Field
    private Item item;

    // Constructor
    ItemButton(String itemName) {
        setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        setPadding(new Insets(5));
        item = new Item(itemName);
        ImageView imageView = new ImageView(item.getUrl());
        imageView.setFitHeight(48);
        imageView.setFitWidth(48);
        setGraphic(imageView);
        setTooltip();
    }

    // Methods
    public void highlight() {
        setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, null, null)));
    }

    public void unhighlight() {
        setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
    }

    private void setTooltip() {
        Tooltip tooltip = new Tooltip();
        tooltip.setFont(new Font(12));
        tooltip.setText(item.getItemName() + item.getPriceText() + item.getIncomeText());
        this.setOnMouseMoved((MouseEvent e) -> {
            if (item != null)
                tooltip.show(this, e.getScreenX(), e.getScreenY() + 10);
        });
        this.setOnMouseExited((MouseEvent e) -> {
            tooltip.hide();
        });
    }

    // Getter
    public Item getItem() {
        return item;
    }
}
