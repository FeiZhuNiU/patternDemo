package eric.yu.demo.BeatDemo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class DJViewDrive
{
    public static void main(String[] args)
    {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
