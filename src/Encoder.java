import java.lang.*;
import java.io.*;
class Encode
{
    public static void main(String args[]) throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the decimal value:");
        String h = b.readLine();
        int k = Integer.parseInt(h);
        String out = Integer.toBinaryString(k);
        System.out.println("Binary: " + out);
    }
} 