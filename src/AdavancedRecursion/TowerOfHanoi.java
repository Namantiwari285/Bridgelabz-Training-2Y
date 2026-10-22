package AdavancedRecursion;
import java.util.Scanner;
public class TowerOfHanoi {
    static void main(String[] args) {
        int n = 3;
        tho(n, 'A', 'C', 'B');
    }

    public static void tho(int n, char Source, char destination, char helper) {
        if (n == 1) {
            System.out.println("move disk " + n + " from " + Source + " to " + destination);
            return;
        }
        tho(n - 1, Source, destination, helper);
        System.out.println("move disk " + n + " from " + Source + " to " + destination);
        tho(n - 1, helper, destination, Source);
    }
}
