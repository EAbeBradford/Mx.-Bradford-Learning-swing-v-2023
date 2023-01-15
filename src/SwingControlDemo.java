import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo implements ActionListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;

    private JLabel southLabel1;
    private JLabel southLabel2;
    private JLabel southLabel3;
    private JLabel southLabel4;
    private JLabel southLabel5;

    private JLabel northLeftLabel1;
    private JLabel northLeftLabel2;
    private JLabel northLeftLabel3;
    private JLabel northLeftLabel4;
    private JLabel northLeftLabel5;

    private JLabel northRightLabel;

    private JPanel controlPanel;
    private JPanel topPannel;
    private  JPanel bottomPannel;
    private JPanel topLeftPannel;
    private  JPanel topRightPannel;
    private JPanel bottomSouthPannel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta;

    private JTextArea bottomCenterText;
    private int WIDTH=800;
    private int HEIGHT=700;


    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showSouthEventDemo();
        swingControlDemo.showTopLeftEventDemo();
        swingControlDemo.showTopRightEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Mx. Bradford learning swing");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 1));


        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        //ta = new JTextArea();
        //ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        mainFrame.add(mb);
      //  mainFrame.add(ta);
        mainFrame.setJMenuBar(mb);

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        topPannel = new JPanel();
        topPannel.setLayout(new GridLayout(1, 2));

        bottomPannel = new JPanel();
        bottomPannel.setLayout(new BorderLayout());

        topLeftPannel = new JPanel();
        topLeftPannel.setLayout(new GridLayout(3, 3));

        topRightPannel = new JPanel();
        topRightPannel.setLayout(new GridLayout(2, 1));

        bottomSouthPannel = new JPanel();
        bottomSouthPannel.setLayout(new GridLayout(1, 9));
        //bottomSouthPannel.setSize(WIDTH, 100);

        bottomCenterText = new JTextArea();
        bottomCenterText.setBounds(10, 300, WIDTH , HEIGHT-50);

       // mainFrame.add(headerLabel);
      //  mainFrame.add(controlPanel);
        topPannel.add(topLeftPannel);
        topPannel.add(topRightPannel);
        bottomPannel.add(bottomSouthPannel, BorderLayout.SOUTH);
        bottomPannel.add(bottomCenterText, BorderLayout.CENTER);

        mainFrame.add(topPannel);
        mainFrame.add(bottomPannel);
       // mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showSouthEventDemo() {
//        headerLabel.setText("Control in action: Button");
//
//        JButton okButton = new JButton("OK");
//        JButton submitButton = new JButton("Submit");
//        JButton cancelButton = new JButton("Cancel");
//
//        okButton.setActionCommand("OK");
//        submitButton.setActionCommand("Submit");
//        cancelButton.setActionCommand("Cancel");
//
//        okButton.addActionListener(new ButtonClickListener());
//        submitButton.addActionListener(new ButtonClickListener());
//        cancelButton.addActionListener(new ButtonClickListener());

//        controlPanel.add(okButton);
//        controlPanel.add(submitButton);
//        controlPanel.add(cancelButton);

        southLabel1 = new JLabel("0", SwingConstants.CENTER);
        southLabel2 = new JLabel("0", SwingConstants.CENTER);
        southLabel3 = new JLabel("0", SwingConstants.CENTER);
        southLabel4 = new JLabel("0", SwingConstants.CENTER);
        southLabel5 = new JLabel("0", SwingConstants.CENTER);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        button1.setActionCommand("1");
        button2.setActionCommand("2");
        button3.setActionCommand("3");
        button4.setActionCommand("4");

        button1.addActionListener(new ButtonClickListener());
        button2.addActionListener(new ButtonClickListener());
        button3.addActionListener(new ButtonClickListener());
        button4.addActionListener(new ButtonClickListener());

//        button2.setSize(50, 50);
//        button1.setSize(50, 50);
//        button3.setSize(50, 50);
//        button4.setSize(50, 50);

        bottomSouthPannel.add(southLabel1);
        bottomSouthPannel.add(button1);
        bottomSouthPannel.add(southLabel2);
        bottomSouthPannel.add(button2);
        bottomSouthPannel.add(southLabel3);
        bottomSouthPannel.add(button3);
        bottomSouthPannel.add(southLabel4);
        bottomSouthPannel.add(button4);
        bottomSouthPannel.add(southLabel5);

        mainFrame.setVisible(true);
    }
    private void showTopLeftEventDemo() {
        northLeftLabel1 = new JLabel("Top 0", SwingConstants.CENTER);
        northLeftLabel2 = new JLabel("Top 0", SwingConstants.CENTER);
        northLeftLabel3 = new JLabel("Top 0", SwingConstants.CENTER);
        northLeftLabel4 = new JLabel("Top 0", SwingConstants.CENTER);
        northLeftLabel5 = new JLabel("Top 0", SwingConstants.CENTER);

        JButton button1 = new JButton("Top 1");
        JButton button2 = new JButton("Top 2");
        JButton button3 = new JButton("Top 3");
        JButton button4 = new JButton("Top 4");

        button1.setActionCommand("top1");
        button2.setActionCommand("top2");
        button3.setActionCommand("top3");
        button4.setActionCommand("top4");

        button1.addActionListener(new ButtonClickListener());
        button2.addActionListener(new ButtonClickListener());
        button3.addActionListener(new ButtonClickListener());
        button4.addActionListener(new ButtonClickListener());

        topLeftPannel.add(northLeftLabel1);
        topLeftPannel.add(button1);
        topLeftPannel.add(northLeftLabel2);
        topLeftPannel.add(button2);
        topLeftPannel.add(northLeftLabel3);
        topLeftPannel.add(button3);
        topLeftPannel.add(northLeftLabel4);
        topLeftPannel.add(button4);
        topLeftPannel.add(northLeftLabel5);
    }
    private void showTopRightEventDemo() {
        northRightLabel = new JLabel("TopRight", SwingConstants.CENTER);

        JButton button1 = new JButton("1");

        button1.setActionCommand("TopRight");

        button1.addActionListener(new ButtonClickListener());

        topRightPannel.add(northRightLabel);

        topRightPannel.add(button1);

        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("1")) {
                //statusLabel.setText("Ok Button clicked.");
                southLabel1.setText("1");
                southLabel2.setText("1");
                southLabel3.setText("1");
                southLabel4.setText("1");
                southLabel5.setText("1");
            } else if (command.equals("2")) {
                //statusLabel.setText("Ok Button clicked.");
                southLabel1.setText("2");
                southLabel2.setText("2");
                southLabel3.setText("2");
                southLabel4.setText("2");
                southLabel5.setText("2");
            } else if (command.equals("3")) {
                //statusLabel.setText("Ok Button clicked.");
                southLabel1.setText("3");
                southLabel2.setText("3");
                southLabel3.setText("3");
                southLabel4.setText("3");
                southLabel5.setText("3");
            } else if(command.equals("TopRight")) {
                northRightLabel.setText("clicked the top right button");
            } else if (command.equals("top1")) {
                //statusLabel.setText("Ok Button clicked.");
                northLeftLabel1.setText("Top 1");
                northLeftLabel2.setText("Top 1");
                northLeftLabel3.setText("Top 1");
                northLeftLabel4.setText("Top 1");
                northLeftLabel5.setText("Top 1");

            } else if (command.equals("top2")) {
                //statusLabel.setText("Ok Button clicked.");
                northLeftLabel1.setText("Top 2");
                northLeftLabel2.setText("Top 2");
                northLeftLabel3.setText("Top 2");
                northLeftLabel4.setText("Top 2");
                northLeftLabel5.setText("Top 2");
            }else if (command.equals("top3")) {
                //statusLabel.setText("Ok Button clicked.");
                northLeftLabel1.setText("Top 3");
                northLeftLabel2.setText("Top 3");
                northLeftLabel3.setText("Top 3");
                northLeftLabel4.setText("Top 3");
                northLeftLabel5.setText("Top 3");
            }else if (command.equals("top4")) {
                //statusLabel.setText("Ok Button clicked.");
                northLeftLabel1.setText("Top 4");
                northLeftLabel2.setText("Top 4");
                northLeftLabel3.setText("Top 4");
                northLeftLabel4.setText("Top 4");
                northLeftLabel5.setText("Top 4");
            } else {
                //statusLabel.setText("Ok Button clicked.");
                southLabel1.setText("4");
                southLabel2.setText("4");
                southLabel3.setText("4");
                southLabel4.setText("4");
                southLabel5.setText("4");
            }
        }
    }
}