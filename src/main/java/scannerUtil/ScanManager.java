package scannerUtil;

import java.util.Scanner;

/**
 * Created by Anastasiya on 12.02.2017.
 */
public class ScanManager {
    private static Scanner readValue;

    public static int consoleReadInt() {
        readValue = new Scanner(System.in);
        return readValue.nextInt();
    }

    public static String consoleReadString() {
        readValue = new Scanner(System.in);
        return readValue.nextLine();
    }
}
