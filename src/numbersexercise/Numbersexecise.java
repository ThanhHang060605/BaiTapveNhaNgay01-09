package numbersexercise;

import processing.NumbersClass;
import java.util.ArrayList;
import java.util.Scanner;

public class Numbersexecise {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String check;
        do {
            System.out.println("Menu: Nhap Data (phim 1), Xoa so le (phim 2), Xuat Data (phim 3), Tim Max 2 (phim 4)");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                   NumbersClass.enterData(numbers);
                    break;
                case 2: 
                    NumbersClass.deleteOddNumbers(numbers);
                    break;
                case 3:
                   NumbersClass.printData(numbers);
                   break;
                case 4:
                    int max2 = NumbersClass.findMax2(numbers);
                    if (max2 != Integer.MIN_VALUE) {
                        System.out.println("Gia tri lon thu 2 la: " + max2);
                    } else {
                        System.out.println("Khong co gia tri lon thu 2 trong mang.");
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!!");
            }
            System.out.print("Nhap Yes de tiep tuc chuong trinh: ");
            check = sc.nextLine();        
        } while (check.equalsIgnoreCase("yes"));

        sc.close(); 
    }
}