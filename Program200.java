import java.util.Scanner;

public class Program200 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int num = 0;
        int i = 0;
   
        System.out.println("enter a your number:");
        num = sobj.nextInt();
        int arr[] = new int[num];
        System.out.println("enter a array element:");
        for (i = 0; i < num; i++) {
            arr[i] = sobj.nextInt();
        }
        System.out.println("unique numbers of element are: ");
        for (i = 0; i < num ; i++) {
            int count=0;
            for (int j = 0; j < num; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }

        sobj.close();
    }
}
