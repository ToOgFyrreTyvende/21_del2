package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MettlerScale implements IMettlerScale {

    Socket pingSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;

    public MettlerScale(String host, int port) {
        try {
            pingSocket = new Socket(host, port);
            out = new PrintWriter(pingSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
        } catch (IOException e) {
            return;
        }
    }

    public String requestUserInput(String text){
        // We already return a read line from the following command. RM20 uses #2 response
        scaleRequest(String.format("RM20 8 \"%s\" \"\" \"&3\"", text));
        String returnString = "";
        try {
            returnString = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnString.split("\"")[1];
    }

    @Override
    public String awaitConfirmation(String text) {
        return null;
    }

    @Override
    public String taraWeight(String text) {
        return null;
    }

    @Override
    public String getWeight() {
        // Read the current weight number from the weight
        scaleRequest(String.format("S"));
        String returnWeight = "";
        try {
            returnWeight = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnWeight.split("\"")[1];
    }

    private String scaleRequest(String text){
        out.println(text);
        String returnString = "";
        try {
            returnString = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  returnString;
    }
}
