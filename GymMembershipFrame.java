/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mojel
 */
public class GymMembershipFrame extends JFrame {

    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractsPnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel personalTrainerLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idNoTxtFld;
    
    private JComboBox genderComboBox;
    
    private JRadioButton monthToMonthRadBtn;
    private JRadioButton sixMonthRadBtn;
    private JRadioButton annualRadBtn;
    
    private JCheckBox personalTrainerChkBx;
    
    private ButtonGroup btnGrp;
    
    private JTextArea commentsArea;
    private JScrollPane scrollableTxtArea;
    private JButton applyBtn;
    
    public GymMembershipFrame() {
        setTitle("Gym membership");
        setSize(500, 500);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Client details" ));
   
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl = new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Contract options"));

        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl = new JPanel(new BorderLayout());
        membershipCommentsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        
        headingLbl = new JLabel("Membership Form ");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        idNoLbl = new JLabel("id no: ");
        genderLbl = new JLabel("Gender: ");
        contractTypeLbl = new JLabel("Type of contract: ");
        personalTrainerLbl = new JLabel("Select the checkbox if you need a personal trainer");
        
        nameTxtFld = new JTextField(10);
        surnameTxtFld = new JTextField(10);
        idNoTxtFld = new JTextField(13);
        
        genderComboBox = new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        monthToMonthRadBtn = new JRadioButton("Month-to-month");
        sixMonthRadBtn = new JRadioButton("Six Months");
        annualRadBtn = new JRadioButton("Annual");
        
        personalTrainerChkBx = new JCheckBox();
        
        btnGrp = new ButtonGroup();
        btnGrp.add(monthToMonthRadBtn);
        btnGrp.add(sixMonthRadBtn);
        btnGrp.add(annualRadBtn);
        
        commentsArea = new JTextArea(20, 40);
        commentsArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Comments"));
        
        scrollableTxtArea = new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn = new JButton("Apply");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtFld);
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderComboBox);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        
        headingClientCombinedPnl.add(headingPnl, BorderLayout.NORTH);
        headingClientCombinedPnl.add(clientPnl, BorderLayout.CENTER);
        
        contractsPnl.add(contractTypeLbl);
        contractsPnl.add(monthToMonthRadBtn);
        contractsPnl.add(sixMonthRadBtn);
        contractsPnl.add(annualRadBtn);
        
        personalTrainerOptionPnl.add(personalTrainerLbl);
        personalTrainerOptionPnl.add(personalTrainerChkBx);
        
        membershipPnl.add(contractsPnl);
        membershipPnl.add(personalTrainerOptionPnl);
        
        commentsPnl.add(scrollableTxtArea);
        
        membershipCommentsCombinedPnl.add(membershipPnl, BorderLayout.NORTH);
        membershipCommentsCombinedPnl.add(commentsPnl, BorderLayout.CENTER);
        
        btnsPnl.add(applyBtn);
        
        mainPnl.add(headingClientCombinedPnl, BorderLayout.NORTH);
        mainPnl.add(membershipCommentsCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
