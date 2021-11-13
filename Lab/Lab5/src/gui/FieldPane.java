package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class FieldPane extends GridPane {
    // Fields
    private ObservableList<FieldCell> fieldCells = FXCollections.observableArrayList();

    // Constructor
    public FieldPane() {
        setPrefWidth(500);
        setAlignment(Pos.CENTER);
        setVgap(8);
        setHgap(8);
        setPadding(new Insets(8));
        setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, null, null)));
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                FieldCell fieldCell = new FieldCell();
                fieldCells.add(fieldCell);
                GridPane.setRowIndex(fieldCell, i);
                GridPane.setColumnIndex(fieldCell, j);
                getChildren().add(fieldCell);
            }
        }
    }

    public int calculateIncome() {
        int sum = 0;
        for (FieldCell fieldCell : fieldCells) {
            if (fieldCell.getCrop() != null) {
                sum += fieldCell.getCrop().getIncome();
            }
        }
        return sum;
    }


}
