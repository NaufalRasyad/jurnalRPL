/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

/**
 *
 * @author Praktikum
 */
public class diamond {
    
    public void makeDiamond(int a){
     for (int i = 1; i <= a; i++){

                  for (int j = 0; j < (a - i); j++)

                        System.out.print(" ");

                  for (int j = 1; j <= i; j++)

                        System.out.print("*");

                  for (int k = 1; k < i; k++)

                        System.out.print("*");

                  System.out.println();

            }

 

            for (int i = a - 1; i >= 1; i--)

            {

                  for (int j = 0; j < (a - i); j++)

                        System.out.print(" ");

                  for (int j = 1; j <= i; j++)

                        System.out.print("*");

                  for (int k = 1; k < i; k++)

                        System.out.print("*");

                  System.out.println();

            }

 

            System.out.println();
    }
    
    public void makeDiamondZero(int a){
     for (int i = 1; i <= a; i++){

                  for (int j = 0; j < (a - i); j++)

                        System.out.print("0");

                  for (int j = 1; j <= i; j++)

                        System.out.print("*");

                  for (int k = 1; k < i; k++)

                        System.out.print("*");

                  System.out.println();

            }

 

            for (int i = a - 1; i >= 1; i--)

            {

                  for (int j = 0; j < (a - i); j++)

                        System.out.print("0");

                  for (int j = 1; j <= i; j++)

                        System.out.print("*");

                  for (int k = 1; k < i; k++)

                        System.out.print("*");

                  System.out.println();

            }

 

            System.out.println();
    }
}
