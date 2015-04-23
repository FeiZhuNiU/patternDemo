package eric.yu.demo.state;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class RepeatVoteState implements VoteState
{
    @Override
    public void vote(String user, String item, VoteManager voteManager)
    {
        System.out.println(user + "   Warning: don't vote more than once");
    }
}
