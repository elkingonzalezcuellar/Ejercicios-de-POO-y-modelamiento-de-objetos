
package ejercicio_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PC
 */
public class ValidateData {
    //1.-----

    public static String Data() {
        String input = null;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine();
        } catch (IOException e) {
            System.out.println("ERROR :" + e.getMessage());
        }
        return input;
    }

    //2.-----
    public static int DataInt() {
        try {
            return (Integer.parseInt(Data()));
        } catch (NumberFormatException error) {
            return (Integer.MIN_VALUE);
        }
    }

    //3.-----
    public static float DataFloat() {
        try {
            Float f = new Float(Data());
            return (f.floatValue());
        } catch (NumberFormatException error) {
            return (Float.NaN);
        }
    }

    //4.-----
    public static double DataDouble() {
        try {
            Double d = new Double(Data());
            return (d.doubleValue());
        } catch (NumberFormatException error) {
            return (Double.NaN);
        }
    }

    //5.-----
    public static char DataChar() {
        try {
            char resp = Data().charAt(0);
            return resp;
        } catch (Exception error) {
            return ('z');
        }
    }

    //6.-----
    public static boolean DataBoolean() {
        try {
            return (Boolean.parseBoolean(Data()));
        } catch (NumberFormatException error) {
            return (false);
        }
    }
}
