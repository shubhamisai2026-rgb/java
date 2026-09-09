import java.io.*;
import java.net.*;
import java.util.*;

public class Program1150
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("-------------------------------------");
            System.out.println("----- Marvellous Client Started -----");
            System.out.println("-------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",
                                        9000
                                        );

            System.out.println("Connection with Server is succesful");
        
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dis.close();
            dos.close();

             socket.close();

        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }

        sobj.close();
       
    }
}