package baitap;

import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTwo, numberThree;
        do{
            System.out.println("Nhap so 1");
            String numberOne = scanner.nextLine();
            try{
                numberTwo = Integer.parseInt(numberOne);
                break;
            }catch (NumberFormatException e){
                System.err.println("Invalid input value.");
            }
        }while(true);
        do{
            System.out.println("Nhap so 2");
            String numberOne = scanner.nextLine();
            try{
                numberThree = Integer.parseInt(numberOne);
                break;
            }catch (NumberFormatException e){
                System.err.println("Invalid input value.");
            }
        }while(true);
        System.out.println("Tong: " + (numberTwo + numberThree));
    }
}
