

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * A TCP server that runs on port 9090.  When a client connects, it
 * sends the client the current date and time, then closes the
 * connection with that client.  Arguably just about the simplest
 * server you can write.
 */
public class DateServer {

    /**
     * Runs the server.
     */
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9095);
        try {
            while (true) {
                Socket socket = listener.accept();
               
                try {
                	 BufferedReader input =
                             new BufferedReader(new InputStreamReader(socket.getInputStream()));
                             String answer = input.readLine();
                             System.out.println(answer);
                    PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                    out.println(answer);
                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }
}