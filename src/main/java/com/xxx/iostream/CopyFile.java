package com.xxx.iostream;

import java.io.*;
// 采用字节流方式复制文件
public class CopyFile {
    public static void main(String[] args) {
        // 定义源数据文件
        File src = new File("test.txt");
        // 定义目标数据文件
        File tar = new File("abc.txt");
        // 创建输入流对象
        try (InputStream input = new FileInputStream(src);
             OutputStream output = new FileOutputStream(tar)
        ) {
            // 带缓存的输入输出方式
            byte[] buffer = new byte[1024];
            int length = 0;
            while((length = input.read(buffer))!=-1){
                output.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
