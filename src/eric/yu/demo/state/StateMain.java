package eric.yu.demo.state;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class StateMain
{
    public static void main(String[] args)
    {
        VoteManager voteManager = new VoteManager();
        for(int i = 0; i < 10; ++i){
            voteManager.vote("Eric", String.valueOf(i));
        }
    }
}
