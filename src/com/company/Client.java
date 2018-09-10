package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by admin on 17.04.2017.
 */
public class Client {
    public static void main(String[] args) {
        ChatClient client = new ChatClient("localhost", 5555);
        client.startChat();
    }
}
