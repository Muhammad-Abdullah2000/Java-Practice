import java.io.FileNotFoundException;
import java.io.IOException;                                     ////        NAME:     M.ABDULLAH
import java.net.MalformedURLException;                          //          Reg#      FA20-BSE-052
import java.rmi.UnknownHostException;                           ///      Subject:    Oject Orianted Programming
import java.util.Scanner;                                       //     Assingment#         2
public class Assingment_2 {                                     ///   Submitted to:     Sir Nasir Mehdi
    public static void main(String[] args) {
        System.out.println("Details: ");
        System.out.println("First taking input for Exception. After taking input, it will show (ClassNotFoundException and CloneNotSupportedException)");
        System.out.println();

        System.out.println("Type exception: ");
        String x;
        Scanner input = new Scanner(System.in);
        x = input.nextLine();
        if (x .equals("exception")) {
            try {
                throw new Exception("Exception");
            } catch (Exception q) {
                q.printStackTrace();
            }
                try {
                    throw new ClassNotFoundException("ClassNotFoundException Occured");
                } catch (Exception c) {
                    c.printStackTrace();
                }
                try {
                    throw new CloneNotSupportedException("CloneNotSupportedException Occured");
                } catch (Exception f) {
                    f.printStackTrace();
                }
            System.out.println("Type IoException: ");
            String y;
            Scanner input2 = new Scanner(System.in);
            y = input2.nextLine();
            if (y .equals("IoException")) {
                try {
                    throw new IOException("IoException Occured");

                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        throw new FileNotFoundException("FileNotFoundException");
                    } catch (FileNotFoundException m) {
                        m.printStackTrace();
                    }
                    try{
                        throw new MalformedURLException("MailformedURLException");
                    }catch(MalformedURLException w){
                        w.printStackTrace();
                    }
                    try{
                        throw new UnknownHostException("UnknwonHostException");
                    }catch(UnknownHostException t){
                        t.printStackTrace();
                    }
                }
            }
        }
    }
}







