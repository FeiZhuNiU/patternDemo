package eric.yu.demo.BeatDemo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public interface ControllerInterface
{
    void start();

    void stop();

    void increateBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
