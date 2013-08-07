
import java.security.SecureRandom;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Trivial client for the date server.
 */
public class TCPClient {
	private static SecureRandom random = new SecureRandom();
	  public static String nextSessionId(int l)
	  {
	    return new BigInteger(l, random).toString(32);
	  }
	  

	  
    /**
     * Runs the client as an application.  First it displays a dialog
     * box asking for the IP address or hostname of a host running
     * the date server, then connects to it and displays the date that
     * it serves.
     */
    public static void main(String args) throws IOException {
        String serverAddress = args;
        Socket s = new Socket(serverAddress, 22);
        PrintWriter out =
                new PrintWriter(s.getOutputStream(), true);
    
    
            out.println("WORKS2");
        BufferedReader input =
            new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer = input.readLine();
        //JOptionPane.showMessageDialog(null, answer);
        for (int i=0;i<1000000000;i++){
        System.out.println(nextSessionId(50000000));}
        //System.exit(0);
    }
}