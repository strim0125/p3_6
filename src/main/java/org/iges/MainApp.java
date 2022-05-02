package org.iges;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

public class MainApp {
    public static final Logger logger = Logger.getLogger(org.iges.MainApp.class.getName());
    public static void main(String[] args) throws IOException {

//        Handler consoleHandler = new ConsoleHandler();
//        consoleHandler.setLevel(Level.FINE);

//        Handler fileHandler = new FileHandler("log_%g.log", 10 * 1024, 20, true);
//        fileHandler.setFormatter(new SimpleFormatter());

//        logger.addHandler(consoleHandler);
//        logger.addHandler(fileHandler);
//        logger.setUseParentHandlers(false);  // используем только свои Handler's - теперь нет ))
//        logger.setLevel(Level.FINE);

        LogManager manager = LogManager.getLogManager();
        manager.readConfiguration(new FileInputStream("logging.properties"));

        logger.log(Level.SEVERE, "java core SEVERE");
        logger.log(Level.INFO, "java core INFO");
        logger.log(Level.FINE, "java core FINE");




    }
}
