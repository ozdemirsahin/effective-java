package com.example.trycatchfinally;

import java.io.*;

public class Test {
    private static final int BUFFER_SIZE = 0;

    //1
    static String firstLineOfFile(String path, String defaultVal) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try
        {
            return br.readLine();
        }
        finally
        {
            // TODO: handle exception
            br.close();
        }
    }

    //Burada finally'e gerek yok.finally varmış gibi BufferedReader kapatılıyor.(try with resources)
    static String firstLineOfFileWell(String path, String defaultVal) throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            return br.readLine();
        }
    }

    // 2  connection'da try içinde yazılabilir.
    static void copy(String src, String dst) throws IOException
    {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst))
        {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }



}
