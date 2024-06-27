package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of elements");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            try{
                System.out.println("Enter element");
                String s = sc.nextLine();
                arr.add(Integer.parseInt(s));
            }catch(NumberFormatException e){
                System.err.println("Invalid number");
            }
        }
    }
}
