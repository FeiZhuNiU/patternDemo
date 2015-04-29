package eric.yu.demo.Command;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/
//服务员

public class Invoker
{
    Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void invoke(){
        command.excute();
    }
}
