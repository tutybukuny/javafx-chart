package sample;

import customchart.CustomPieChart;
import javafx.scene.Scene;

public class Controller {
    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
        CustomPieChart chart = (CustomPieChart) scene.lookup("#pc");
        chart.setData();
        chart.setTitle("Imported Fruits");
    }
}
