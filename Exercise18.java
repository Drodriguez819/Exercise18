 /*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 17
* Description: program that read in arbitrary numbers of integers that are in the range 0 to 50 inclusive 
*               and counts how many occurrence of each are entered.
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
*   1) Create a main
*      (a) create an array using int with a range of 50 
*           (i) create a counter for each number
*           (ii) put the array in a for loop
*           (iii) display the counters in a menue using print ln 
*---------------------------------------------------------------------------------------
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise18 {

    public static void main (String [] args){

//scanner & Random
    Scanner scnnerInput = new Scanner(System.in);
    Random  rdmNumber   = new Random();
    int     intCounter  = 0;
//variables
int intRdmNumber = rdmNumber.nextInt(50)+1;
//array
    final int size = 51;
    int[] intArray = new int [size];
    int[] aryNumbers = {1,2,3,4};
   
    //for(int intIndex = 0; int intIndex <= size; intIndex++){
    //arryNumbers[intIndex] = intIndex.nextRandom(intRdmNumber);
    //}

//output
    System.out.println(Arrays.toString(aryNumbers));

        
    }
}