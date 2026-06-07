public class Program187
{
    public static void main(String[] args) 
    {
        int arr[]={7,2,3,4,5,6,7,8};
        int key=7;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                count++;
            }
        }
        System.out.println("total occurence: "+count);
    }
}
