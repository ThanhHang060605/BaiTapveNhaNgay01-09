package processing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class NumbersClass {
    

   
    public static ArrayList <Integer> enterData (ArrayList <Integer> numbers) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int size = sc.nextInt();
        for (int i=0; i< size; i++){
            System.out.println("Numbers [" + i + "]");
            int value = sc.nextInt();
            numbers.add(value);
        }
        return numbers;      
    }
    
    public static void printData (ArrayList <Integer> numbers) {
        System.out.print("Mang vua nhap la: " + Arrays.toString( numbers.toArray()));       
    }
 
    public static Integer findMax2 (ArrayList <Integer> numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int num : numbers){
            if (num > max1){
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1){
                max2 = num;
            }
        }
        return max2;
    }
    
    public static void deleteOddNumbers (ArrayList <Integer> numbers){
        numbers.removeIf(num -> num % 2!=0);       

    }
  
 
   
}



