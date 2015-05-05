package eric.yu.demo.BeatDemo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class BeatController implements ControllerInterface
{
    BeatModelInterface model;

    DJView view;

    public BeatController(BeatModelInterface model)
    {
        this.model = model;
        model.initialize();
        view = new DJView(model,this);
        view.createView();
        view.createControls();
        view.disableStartMenuItem();
        view.enableStopMenuItem();

    }

    @Override
    public void start()
    {
        model.on();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void stop()
    {
        model.off();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void increateBPM()
    {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM()
    {
        model.setBPM(model.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm)
    {
        model.setBPM(bpm);
    }
}
