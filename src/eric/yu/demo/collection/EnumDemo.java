package eric.yu.demo.collection;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.bind.SchemaOutputResolver;
import java.util.EnumSet;

public class EnumDemo
{

    public static void main(String[] args)
    {
        ColorEnum colorEnum = ColorEnum.RED;
        EnumSet<ColorEnum> enums = EnumSet.allOf(ColorEnum.class);

        System.out.println(enums);
    }
}
