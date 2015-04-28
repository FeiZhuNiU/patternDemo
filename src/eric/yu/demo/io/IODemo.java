package eric.yu.demo.io;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/24/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.io.*;

public class IODemo
{
    public static void main(String[] args) throws IOException
    {
        OutputStream os = new FileOutputStream("d:/iotest.txt");

        String str = "hello";
        os.write(str.getBytes());
        os.close();

    }
}
