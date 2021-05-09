package com.xxx.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        args = new String[1];
        args[0] = "www.baidu.com";
        if(args.length > 0){
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for(InetAddress a:addresses){
                System.out.println(a);
            }
        }
        else {
            InetAddress localhostAddress = InetAddress.getLocalHost();
            System.out.println(localhostAddress);
        }
    }
}
