package de.reclinarka.util;

import javafx.application.Application;
import javafx.stage.Stage;
import de.reclinarka.Main;

/**
 * Created by reclinarka on 29.12.2016.
 */
public class JavaFXInitializer extends Application {

    public JavaFXInitializer(){

    }

    public JavaFXInitializer( JavaFXInitializer fxinit){
        fxinit.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // JavaFX should be initialized


    }
}
