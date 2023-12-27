import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class Project {

    JFrame frame;
    JTextField text1, text2, text3;
    JLabel Train, Stud, Prof;
    JTextArea A1;
    JLabel Mobile, Web, Data;
    JSpinner spin1, spin2, spin3;
    JSpinner spin4, spin5, spin6;
    JLabel Ven, Inc;
    JRadioButton Out, Center;
    JCheckBox Source, Cert, Snack;
    JButton Process, Clear, Exit;

    public Project() {

        frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(1000, 650));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Train = new JLabel("Customer Name: ");
        frame.add(Train);
        Train.setSize(100, 25);
        Train.setLocation(45, 35);

        text1 = new JTextField();
        frame.add(text1);
        text1.setSize(400, 20);
        text1.setLocation(150, 38);

        Stud = new JLabel("Address: ");
        frame.add(Stud);
        Stud.setSize(100, 25);
        Stud.setLocation(45, 75);

        text2 = new JTextField();
        frame.add(text2);
        text2.setSize(400, 20);
        text2.setLocation(150, 80);

        Prof = new JLabel("Zip Code: ");
        frame.add(Prof);
        Prof.setSize(100, 25);
        Prof.setLocation(45, 125);

        text3 = new JTextField();
        frame.add(text3);
        text3.setSize(400, 20);
        text3.setLocation(150, 130);

        // JLabel Train, Stud, Prof;

        Train = new JLabel("Training | Workshop");
        frame.add(Train);
        Train.setFont(new Font("wow", Font.BOLD, 15));
        Train.setSize(185, 25);
        Train.setLocation(45, 185);

        Stud = new JLabel("No. of Students");
        frame.add(Stud);
        Stud.setFont(new Font("wow1", Font.BOLD, 15));
        Stud.setSize(185, 25);
        Stud.setLocation(225, 185);

        Prof = new JLabel("No. of Proffesional");
        frame.add(Prof);
        Prof.setFont(new Font("wow2", Font.BOLD, 15));
        Prof.setSize(185, 25);
        Prof.setLocation(385, 185);

        // Mobile, Web, Data;

        Mobile = new JLabel("Mobile App Development");
        frame.add(Mobile);
        Mobile.setSize(140, 25);
        Mobile.setLocation(55, 235);

        Web = new JLabel("No. of Students");
        frame.add(Web);
        Web.setSize(140, 25);
        Web.setLocation(55, 295);

        Data = new JLabel("No. of Students");
        frame.add(Data);
        Data.setSize(140, 25);
        Data.setLocation(55, 355);

        // spin1, spin2, spin3;

        spin1 = new JSpinner();
        frame.add(spin1);
        spin1.setSize(35, 25);
        spin1.setLocation(250, 237);

        spin2 = new JSpinner();
        frame.add(spin2);
        spin2.setSize(35, 25);
        spin2.setLocation(250, 295);

        spin3 = new JSpinner();
        frame.add(spin3);
        spin3.setSize(35, 25);
        spin3.setLocation(250, 355);

        // spin4, spin5, spin6;

        spin4 = new JSpinner();
        frame.add(spin4);
        spin4.setSize(35, 25);
        spin4.setLocation(425, 237);

        spin5 = new JSpinner();
        frame.add(spin5);
        spin5.setSize(35, 25);
        spin5.setLocation(425, 295);

        spin4 = new JSpinner();
        frame.add(spin4);
        spin4.setSize(35, 25);
        spin4.setLocation(425, 355);

        // Ven, Inc;

        Ven = new JLabel("Venue: ");
        frame.add(Ven);
        Ven.setSize(100, 25);
        Ven.setLocation(65, 415);

        Inc = new JLabel("Inclusion: ");
        frame.add(Inc);
        Inc.setSize(100, 25);
        Inc.setLocation(45, 455);

        // Out, Center;

        Out = new JRadioButton("Outside");
        frame.add(Out);
        Out.setSize(100, 40);
        Out.setLocation(165, 408);

        Out = new JRadioButton("Training Center");
        frame.add(Out);
        Out.setSize(120, 40);
        Out.setLocation(275, 408);

        // Source, Cert, Snack;

        Source = new JCheckBox("Source Code");
        frame.add(Source);
        Source.setSize(100, 40);
        Source.setLocation(145, 447);

        Cert = new JCheckBox("Certificate");
        frame.add(Cert);
        Cert.setSize(100, 40);
        Cert.setLocation(250, 447);

        Snack = new JCheckBox("Snack");
        frame.add(Snack);
        Snack.setSize(100, 40);
        Snack.setLocation(348, 447);

        // Process, Clear, Exit;

        Process = new JButton("Process Order");
        frame.add(Process);
        Process.setSize(125, 25);
        Process.setLocation(185, 500);

        Clear = new JButton("Clear");
        frame.add(Clear);
        Clear.setSize(80, 25);
        Clear.setLocation(325, 500);

        Exit = new JButton("Exit");
        frame.add(Exit);
        Exit.setSize(70, 25);
        Exit.setLocation(415, 500);

        A1 = new JTextArea();
        frame.add(A1);
        A1.setSize(360, 530);
        A1.setLocation(600, 30);

    }

    public static void main(String[] args) {
        Project P1 = new Project();
    }

}
