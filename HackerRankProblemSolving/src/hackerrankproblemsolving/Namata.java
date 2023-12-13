/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Zahidul Sikder
 */
public class Namata {
    
   public void namataMethod() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Give an integer value : ");
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
          System.out.println("Output : ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + i * N);
        }

        bufferedReader.close();
    }
    
    
    
    
}
