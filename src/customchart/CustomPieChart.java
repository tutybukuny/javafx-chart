package customchart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

public class CustomPieChart extends PieChart {
    public CustomPieChart() {
    }

    public void setData() {
        ObservableList<Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30));
        super.setData(pieChartData);
        setLegendVisible(false);
        setLabelsVisible(false);
    }
}
