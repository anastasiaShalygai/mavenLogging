package logger;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;


/**
 * Created by Anastasiya on 12.02.2017.
 */
public class LogEntry {
    private static SimpleFormatter formatTxt;
    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger logger = Logger.getLogger(LogEntry.class.getName());
    public static FileHandler errorLog;
    public static FileHandler allLog;

    static {
        try {
            logManager.readConfiguration(new FileInputStream("./logging.properties"));
        } catch (IOException exception) {
            logger.log(Level.SEVERE, "Error IOException", exception);
        }
    }

    public static void entryLog() {
        try {
            formatTxt = new SimpleFormatter();

            errorLog = new FileHandler("c:\\MyLogError.log");
            errorLog.setLevel(Level.WARNING);
            errorLog.setFormatter(formatTxt);
            logger.addHandler(errorLog);

            allLog = new FileHandler("c:\\MyLogAll.log");
            allLog.setLevel(Level.ALL);
            allLog.setFormatter(formatTxt);
            logger.addHandler(allLog);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Не удалось создать файл лога из-за ошибки ввода-вывода.", e);
        }
    }
}
