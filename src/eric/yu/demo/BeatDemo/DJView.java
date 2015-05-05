package eric.yu.demo.BeatDemo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener, BeatObserver, BPMObserver
{
    BeatModelInterface model;
    ControllerInterface controller;

    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;

    public DJView(BeatModelInterface model, ControllerInterface controller)
    {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BPMObserver) this);
        model.registerObserver((BeatObserver) this);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == setBPMButton)
        {
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        }
        else if(event.getSource() == increaseBPMButton)
        {
            controller.increateBPM();
        }
        else if (event.getSource() == decreaseBPMButton)
        {
            controller.decreaseBPM();
        }
    }

    @Override
    public void updateBPM()
    {
        int bpm = model.getBPM();
        if(bpm == 0)
        {
            bpmOutputLabel.setText("offline");
        }
        else
        {
            bpmOutputLabel.setText("Current BPM: " + model.getBPM());
        }
    }

    @Override
    public void updateBeat()
    {
        beatBar.setValue(100);
    }




    JFrame controlFrame;
    JPanel controlPanel;

    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public void enableStopMenuItem()
    {
        stopMenuItem.setEnabled(true);
    }
    public void disableStopMenuItem()
    {
        stopMenuItem.setEnabled(false);
    }
    public void enableStartMenuItem()
    {
        startMenuItem.setEnabled(true);
    }
    public void disableStartMenuItem()
    {
        startMenuItem.setEnabled(false);
    }

    public void createView()
    {
        viewPanel = new JPanel(new GridLayout(1,2));
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100,80));
        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
        beatBar = new BeatBar();
        beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2,1));
//        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel,BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }

    public void createControls()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100,80));

        controlPanel = new JPanel(new GridLayout(1,2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJ control");
        startMenuItem = new JMenuItem("start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                controller.start();
            }
        });

        stopMenuItem = new JMenuItem("stop");
        menu.add(stopMenuItem);
        stopMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                controller.stop();
            }
        });

        JMenuItem exit = new JMenuItem("Quit");
        menu.add(exit);
        exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter BPM: ", SwingConstants.RIGHT);
        setBPMButton = new JButton("Set");
        setBPMButton.setSize(new Dimension(10,40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");
        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        buttonPanel.add(decreaseBPMButton);
        buttonPanel.add(increaseBPMButton);

        JPanel enterPanel = new JPanel(new GridLayout(1,2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);

        JPanel insideControlPanel = new JPanel(new GridLayout(3,1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPMButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel,BorderLayout.CENTER);
        controlFrame.pack();
        controlFrame.setVisible(true);
    }
}
