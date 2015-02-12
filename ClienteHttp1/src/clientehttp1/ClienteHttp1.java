package clientehttp1;
import java.net.*;
import java.io.*;

public class ClienteHttp1 {

    public static void main(String[] args) {
        try{
            
            Socket cliente = new Socket("www.google.com", 80);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream());
            
            out.println ("GET /\n");
            out.flush();
            
            String linha = in.readLine();
            
            while(linha != null){
                System.out.println(linha);
                linha = in.readLine();
            }    
        } catch(IOException io1){
       
        }   
    }
}
    

