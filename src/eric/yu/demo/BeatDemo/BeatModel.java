package eric.yu.demo.BeatDemo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener
{
    Sequencer sequencer;
    ArrayList<BPMObserver> bpmObservers;
    ArrayList<BeatObserver> beatObservers;
    int bpm;

    Sequence sequence;
    Track track;

    @Override
    public void initialize()
    {
        beatObservers = new ArrayList<BeatObserver>();
        bpmObservers = new ArrayList<BPMObserver>();
        bpm = 90;

        setUpMidi();
        buildTrackAndStart();
    }

    private void buildTrackAndStart()
    {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);

    }

    private void makeTracks(int[] list)
    {
        for(int i = 0; i < list.length; ++i)
        {
            int key = list[i];
            if(key != 0)
            {
                track.add(makeEvent(144,9,key,100,i));
                track.add(makeEvent(129,9,key,100,i+1));
            }
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick)
    {
        MidiEvent event = null;
        try
        {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return event;
    }

    private void setUpMidi()
    {
        try
        {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void on()
    {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off()
    {
        sequencer.stop();
        setBPM(0);
    }

    @Override
    public void setBPM(int bpm)
    {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    public void notifyBPMObservers()
    {
        for(BPMObserver bpmObserver : bpmObservers)
        {
            bpmObserver.updateBPM();
        }
    }

    public void notifyBeatObservers()
    {
        for(BeatObserver beatObserver : beatObservers)
        {
            beatObserver.updateBeat();
        }
    }

    @Override
    public int getBPM()
    {
        return this.bpm;
    }

    @Override
    public void registerObserver(BeatObserver o)
    {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o)
    {
        beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o)
    {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o)
    {
        bpmObservers.remove(o);
    }

    @Override
    public void meta(MetaMessage meta)
    {
        if(meta.getType() == 47)
        {
            notifyBeatObservers();
            sequencer.start();
            setBPM(getBPM());
        }
    }


}
