package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer");
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number of el");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            try{
                String a = sc.nextLine();
                list.add(Integer.parseInt(a));
            }catch (NumberFormatException e){
                list.add(0);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
