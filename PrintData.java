/**=======================
 * Title: PrintData
 * Function: prints an arrayList data set in a layout more palatable to the eye
 *///=====================
package com.mycompany.finalproject_cs300;

import java.util.Arrays;
import java.util.Scanner;

public class PrintData {
    public static void prettyPrint(String[][] arrayList) {
        System.out.println(Arrays.deepToString(arrayList).replace("], ", "]\n").replace(", ", "\t").replace("[", "")
                .replace("]", ""));

    }

    public static void uiInputError() {
        System.out.println("Please enter a valid input from the list of options above");
    }
}
