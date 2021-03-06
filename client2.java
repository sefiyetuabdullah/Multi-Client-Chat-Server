import java.io.*;
import java.net.*;

public class client2 {
    public static void main(String[] args) throws IOException {

        String serverHostname = new String ("127.0.0.2");

        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket("127.0.0.2", 10008);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                                        echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + serverHostname);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
                               + "the connection to: " + serverHostname);
            System.exit(1);
        }

	       BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	       String userInput;

        System.out.println ("Type Message (\"Bye.\" to quit)");
	       while ((userInput = stdIn.readLine()) != null)
           {
	            out.println(userInput);

          if (userInput.equals("Bye."))
                break;

	    System.out.println("Server : " + in.readLine());
	   }

	out.close();
	in.close();
	stdIn.close();
	echoSocket.close();
    }
}
