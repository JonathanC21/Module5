package com.valencia;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.chart.LineChart;  
import javafx.scene.chart.NumberAxis;  
import javafx.scene.chart.XYChart;  
import javafx.stage.Stage;

/**
 * Contains the main method and displays the chart comparing both the iterative and recursive method's runtimes for the Fibonacci sequence.
 */
public class Chart extends Application {

    @Override  
    public void start(Stage stage) throws Exception {  
            
        NumberAxis xAxis = new NumberAxis(1,25,1);  
        NumberAxis yAxis = new NumberAxis(0,100000,10000);     
        xAxis.setLabel("Input");  
        yAxis.setLabel("Time (Nanoseconds)");  
            
        LineChart linechart = new LineChart(xAxis,yAxis);
        
        XYChart.Series incrementalSeries = new XYChart.Series();
        XYChart.Series recursiveSeries = new XYChart.Series();  
        incrementalSeries.setName("Incremental");  
        recursiveSeries.setName("Recursive");    
        
    	Fibonacci fib = new Fibonacci();
    	
    	System.out.println("*****Iterative Function*****");
    	
    	for (int i = 1; i <= 25; i++) {
    		incrementalSeries.getData().add(new XYChart.Data(i,fib.calcIterative(i)));
    	}
    	
    	System.out.println("*****Recursive Function*****");
    	
    	for (int i = 1; i <= 25; i++) {
    		recursiveSeries.getData().add(new XYChart.Data(i,fib.calcRecursive(i)));
    	}

        linechart.getData().add(incrementalSeries);
        linechart.getData().add(recursiveSeries);
            
        Group root = new Group(linechart);  
        Scene scene = new Scene(root,500,400);
        
        stage.setScene(scene);  
        stage.setTitle("Fibonacci Sequence Functions Comparison");  
        stage.show();  
    }
    
    /**
     * Runs the main program. First, the iterative and recursive methods are calculated. Then, a chart showing the amount of time for each element is shown.
     * 
     * @param args
     */
    public static void main(String[] args) {

        launch(args);
        System.exit(0); 
    }      
}  