package eric.yu.demo.state;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.HashMap;
import java.util.Map;

public class VoteManager
{
    private VoteState state;

    public Map<String, String> getVoteMap()
    {
        return voteMap;
    }

    private Map<String,String> voteMap;
    private Map<String,Integer> voteCount;

    public VoteManager(){
        voteMap = new HashMap<String, String>();
        voteCount = new HashMap<String, Integer>();
    }

    public void vote(String user, String item){
        int cnt ;
        Integer temp = voteCount.get(user);
        if(temp == null)
            cnt = 0;
        else
            cnt = temp;
        cnt += 1;
        voteCount.put(user,cnt);

        if(cnt == 1){
            state = new NormalVoteState();
        }
        else if (cnt < 5){
            state = new RepeatVoteState();
        }
        else if (cnt <8){
            state = new SpiteVoteState();
        }
        else
            state = new BlackVoteState();

        state.vote(user,item,this);
    }

}
