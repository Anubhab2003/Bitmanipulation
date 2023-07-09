import java.util.*;
public class evenodd{
    public static void check(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String args[]){
        check(5);
        check(17);
        check(4);
    }
}