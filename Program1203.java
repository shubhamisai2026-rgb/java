public class Program1203
{
    public static void main(String A[])
    {
        // ParkingLot pobj1 = new ParkingLot();
    
        ParkingLot pobj1 = ParkingLot.getInstance();
        ParkingLot pobj2 = ParkingLot.getInstance();
        ParkingLot pobj3 = ParkingLot.getInstance();
    } 
}
class ParkingLot
{
    private static ParkingLot instance;

    private  ParkingLot()
    {
        System.out.println("ParkingLot object gest created....");
        System.out.println("this is the private object....");
    }

    public static ParkingLot getInstance()
    {
        if(instance == null)
        {
            instance = new ParkingLot();
        }

        return instance;
    }
}

