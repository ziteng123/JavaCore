package com.xxx.socket;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        try(var s = new Socket("time-a.nist.gov",13);
        var in = new Scanner(s.getInputStream(), StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
        System.out.println(1/0);
    }
}
