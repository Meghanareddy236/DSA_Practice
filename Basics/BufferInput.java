package Basics;
import java.io.*;
public class BufferInput {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);

        String name=br.readLine();
        
        pw.println("My Name is"+" "+name);
        pw.flush();
        pw.close();
        br.close();
    }
}
