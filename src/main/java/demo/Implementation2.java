package demo;

import logger.LogEntry;
import operation.Operation;
import scannerUtil.ScanManager;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Anastasiya on 13.02.2017.
 */
public class Implementation2 {
    private static Logger logger = Logger.getLogger(Implementation2.class.getName());
    private static String loggingLevel;
    private static int number1;
    private static int number2;
    private static String operation;

    static void entryStart() {
        logger.addHandler(LogEntry.allLog);

        /*System.out.println("Уровень логирования(ERROR, WARN, INFO, DEBUG, TRACE):");
        loggingLevel = ScanManager.consoleReadString();
        selectLoggingLevel();*/

        initialization();
    }

    private static void initialization() {
        System.out.println("Введите число1: ");
        number1 = ScanManager.consoleReadInt();

        System.out.println("Введите операцию(+, -, *, /): ");
        operation = ScanManager.consoleReadString();

        System.out.println("Введите число2: ");
        number2 = ScanManager.consoleReadInt();
        selectOperation();
    }

    private static void selectLoggingLevel() {
        switch (loggingLevel) {
            case "ERROR": logger.setLevel(Level.SEVERE);
                break;
            case "WARN": logger.setLevel(Level.WARNING);
                break;
            case "INFO": logger.setLevel(Level.INFO);
                break;
            case "DEBUG": logger.setLevel(Level.CONFIG);
                break;
            case "TRACE": logger.setLevel(Level.FINE);
                break;
        }
    }

    private static void selectOperation() {
        Operation operationNew = new Operation(number1, number2);
        int result;
        logger.log(Level.INFO, "Запись лога с уровнем INFO");

        switch (operation) {
            case "+": result = operationNew.getResultAddition();
                break;
            case "-": result = operationNew.getResultSubtraction();
                break;
            case "*": result = operationNew.getResultMultiplication();
                break;
            case "/": result = operationNew.getResultDivide();
                break;
            default: return;
        }
        System.out.println("Результат: " + result);
    }
}
