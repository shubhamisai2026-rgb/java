public class Program1015
{
    public static void main(String A[])
    {
        // Jagged array
        
        int Arr[][] = {{10,20,30}, {40,50,60}, {70,80,90,100}, {11,21}};

        System.out.println(Arr.length);  //4

        System.out.println(Arr[0].length); //3
        System.out.println(Arr[1].length); //3
        System.out.println(Arr[2].length); //4
        System.out.println(Arr[3].length); //2
    }

}