package DM;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
    String[] DeliveryArea = new String[]{"area1","area2","area3","area4","area5"};
    DeliveryMan x = new DeliveryMan("007","Bang",DeliveryArea);
    String str = x.toString();
    System.out.println(str);
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("input area name:");
    String area = sc.next();
    boolean a = DeliveryMan.isArrived(area);
    if(a){
        System.out.println("yes");
    }
    else System.out.println("sorry");
    }
}