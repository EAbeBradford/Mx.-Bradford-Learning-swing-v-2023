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
        swingControlDemo.showEventDemo();
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

    private void showEventDemo() {
        headerLabel.setText("Control in action: Button");

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        southLabel1 = new JLabel("0");
        southLabel2 = new JLabel("0");
        southLabel3 = new JLabel("0");
        southLabel4 = new JLabel("0");
        southLabel5 = new JLabel("0");

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