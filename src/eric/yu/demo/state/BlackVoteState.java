package eric.yu.demo.state;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class BlackVoteState implements VoteState
{
    @Override
    public void vote(String user, String item, VoteManager voteManager)
    {
        System.out.println("you are moved to black!");
    }
}
