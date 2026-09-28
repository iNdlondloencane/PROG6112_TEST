/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport1;

/**
 *
 * @author Student
 */
public class GamingConsoleReport1 {

    public static void main(String[] args) {
        //Arrays 
        String [] cities ={"Cape Town", "Port Elizabeth", "Pretoria"};
        String [] consoles = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {{1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}};
        
        int[] totals = new int[3];
        
        //Calculating the totals 
        for (int i = 0; i < 3; i++) {
            totals[i] = sales[i][0] + sales [i][1] + sales [i][2];
            
            //Printing the report
            System.out.println("--------------------------------------------");
            System.out.println("Gaming Console Report");
            System.out.println("---------------------------------------------");
            System.out.println("\t\t\t + consoles[0] +\t" + consoles [1] +"\t" + consoles[2]);
            
            for (int j = 0; j < 3; i++) {
                System.out.print(cities[i] + "\t");
                for(int c = 0; c < 3; j++){
                    System.out.print(sales[i][j] + "\t");
                    
                }
                System.out.println();
                
                
            }
            //Printing the totals 
            System.out.println();
            System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
            System.out.println("--------------------------------------");
            for (int j = 0; j < 3; i++){
                System.out.println(cities[i] + "\t" + totals[i]);
                
            }
            //Finding the city with the most sales 
            int max = 0;
            for (int j = 0; j < 3; i++) {
                if (totals[i] > totals[max]{
                max = i;
                
                        
            }
            
            }
            System.out.println();
            System.out.println("CITY WITH THE MOST SALES:" + cities[max]);
            
            
                     
            
        }
    }
}
