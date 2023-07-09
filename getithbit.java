import java.util.*;
public class getithbit{
    public static int get(int n, int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 0;

        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number and ith position to get its bit");
        int n=s.nextInt();
        int i=s.nextInt();
        System.out.println(get(n,i));

    }

}