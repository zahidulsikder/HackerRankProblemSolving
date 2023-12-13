
package hackerrankproblemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HackerRankProblemSolving {

    public static void main(String[] args) {
        Namata n = new Namata();
        try {
            n.namataMethod();
        } catch (IOException ex) {
            Logger.getLogger(HackerRankProblemSolving.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
