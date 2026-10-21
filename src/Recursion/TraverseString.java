package Recursion;
import java.util.Scanner;
public class TraverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the string");
        String str=sc.nextLine();
        int idx=0;
        traverse(str,idx);
    }

    public static void traverse(String str,int idx){
        if(idx==str.length()){
            return;
        }
        System.out.print(str.charAt(idx)+"");
        idx++;
        traverse(str,idx);

    }}

