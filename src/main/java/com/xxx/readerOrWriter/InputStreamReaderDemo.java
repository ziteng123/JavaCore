package com.xxx.readerOrWriter;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader input = new InputStreamReader(fileInputStream)) {
            char[] chars = new char[1024];
            int length = 0;
            while((length = input.read(chars))!=-1){
                System.out.println(new String(chars,0,length));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
