import java.util.*;
public class clearithbit{
    public static int clear(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number and ith position to get its bit");
        int n=s.nextInt();
        int i=s.nextInt();
        System.out.println(clear(n,i));

    }

}