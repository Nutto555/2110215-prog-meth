package gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ControlPane extends VBox {
    // Fields
    private ItemPane itemPane;
    private Button harvestButton;
    private Label moneyLabel;

    // Constructor
    public ControlPane() {
        setAlignment(Pos.CENTER);
        setPrefWidth(300);
        setSpacing(15);
        setFillWidth(true);
        setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        moneyLabel = new Label();
        moneyLabel.setFont(new Font(20));
        setMoneyLabelText();

        Label label = new Label("Please select a seed or removal tool");
        label.setFont(new Font(14));

        itemPane = new ItemPane();

        harvestButton = new Button("Harvest");
        harvestButton.setPrefWidth(150);
        harvestButton.setOnAction((event) -> {
            SimulationManager.harvestHandler();
        });
        getChildren().addAll(moneyLabel, label, itemPane, harvestButton);
    }

    // Method
    public void setMoneyLabelText() {
        moneyLabel.textProperty().setValue("Money: " + SimulationManager.getMoney());
    }

    // Getter
    public ItemPane getItemPane() {
        return itemPane;
    }

    public Button getHarvestButton() {
        return harvestButton;
    }

    public Label getMoneyLabel() {
        return moneyLabel;
    }
}
