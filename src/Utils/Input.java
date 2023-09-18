package Utils;

import java.util.Scanner;

public class Input {
    public static String inputString(){
        return new Scanner(System.in).next();
    }

    public static int inputInt(){
        return new Scanner(System.in).nextInt();
    }

    public static float inputFloat(){
        return new Scanner(System.in).nextFloat();
    }
}
