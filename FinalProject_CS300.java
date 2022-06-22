/**=======================
 * Title: FinalProject_CS300 
 * Function: Final Project main function
 *///=====================
package com.mycompany.finalproject_cs300;

import static com.mycompany.finalproject_cs300.PrepareData.*;
import static com.mycompany.finalproject_cs300.UserUI.*;

public class FinalProject_CS300 {

    /**
     * ===============================================================================
     * REQUIREMENTS TO BUILD AND RUN
     * chromedriver installed
     * selenium library installed
     * latest version of chrome installed
     * NetBeans 13 required for selenium to work, earlier versions wont work
     * 
     * @param args
     */// ==============================================================================

    public static void main(String[] args) {
        final String[][] playerStats = getTableData(); // add each player w/ their stats into a 2d array
        initializeUI(playerStats); // initialize the user input
    }

}
