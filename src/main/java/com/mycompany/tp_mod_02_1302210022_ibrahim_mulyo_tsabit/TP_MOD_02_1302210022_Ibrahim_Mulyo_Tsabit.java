/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_02_1302210022_ibrahim_mulyo_tsabit;

/**
 *
 * @author Ibrahim
 */
import java.util.Scanner;
public class TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit {

    public static void main(String[] args)throws Exception {
        Scanner writeline = new Scanner(System.in);
        //1
        int[][] arr = {
            {2,4,6},
            {1,3,5,7,9},
            {0,1,1,2,3,5,8},
        };
        int i = 0;
        
        while (i<arr.length){
            int j = 0;
            while (j<arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            i++;
            System.out.println(" ");
        }
        System.out.println(" ");

        //2
        System.out.println("Input bilangan 1: ");
        int inputan1 = writeline.nextInt();
        System.out.println("Input bilangan 2: ");
        int inputan2 = writeline.nextInt();
        
        int fpb = funcfpb(inputan1,inputan2);
        int kpk = (inputan1 * inputan2) / fpb;

        System.out.println(" ");

        System.out.println("Hasil KPK: "+ kpk);
        System.out.println("Hasil FPB: "+ fpb);

        System.out.println(" ");
    }

    public static int funcfpb(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return funcfpb(b, a % b);
        }
    }
}
