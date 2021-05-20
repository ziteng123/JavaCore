package com.xxx.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread2 extends Thread{
    private String url;
    private String name;

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
    }

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public static void main(String[] args) {
        TestThread2 thread1 = new TestThread2("","");
        thread1.start();
    }
}

class WebDownloader{
    // 下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloaderfa方法出现问题");
        }
    }
}
