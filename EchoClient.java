import java.io.*;
import java.net.*;
public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        //part 1 prepare socket and connection

        try {
        echoSocket = new Socket("tcpbin.com", 4242);
        out = new PrintWriter(echoSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(
        echoSocket.getInputStream()));
        }

        catch (UnknownHostException e) {
        System.err.println("Don't know about host.");
        System.exit(1); }
        catch (IOException e){
        System.err.println("Couldn't get I/O for "+ e + "the connection to:tcpbin.");
        System.exit(1); }

        //part 2 sending and receiving from the server
        
        BufferedReader stdIn = new BufferedReader(
        new InputStreamReader(System.in));
        String userInput;
        while ((userInput = stdIn.readLine()) != null){
        out.println(userInput);
        System.out.println("echo: " + in.readLine());
        }
        out.close();
        in.close();
        stdIn.close();
        echoSocket.close();
    }
}