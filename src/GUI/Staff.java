package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staff implements ActionListener{
JFrame guu;
JTable bookingTable2;
JLabel managelabel,checkedin,roomNo,roomType;
JPanel manageBookingSection,firstPanel1;
JComboBox chekfield;
JComboBox chekfield2;
JComboBox chekfield3;
JButton btn;
Staff(){

guu= new JFrame();
//guu.getContentPane().setBackground(Color.decode("#A6A6A6"));

firstPanel1= new JPanel();
//firstPanel1.setBackground(Color.decode("#575050"));
//---------------------------------------------------
//manageBookingSection= new JPanel();
//managelabel= new JLabel("<html> MANAGE<BR>BOOKING</HTML>");
//managelabel.setFont(new Font("times new roman",Font.BOLD,50));
//manageBookingSection.add(managelabel);
//manageBookingSection.setBounds(0,0,250,140);
//manageBookingSection.setForeground(Color.black);
//manageBookingSection.setBackground(Color.decode("#575050"));
//guu.add(manageBookingSection);

//--------------------------------------------------
btn=new JButton("UPDATE");
btn.setBounds(250,150,90,30);
guu.add(btn);


//--------------------------------------------------
checkedin= new JLabel("Checked-IN  :");
//checkedin.setForeground(Color.white);
checkedin.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
checkedin.setBounds(270,5,150,50);
firstPanel1.add(checkedin);
firstPanel1.setBounds(0,0,1000,220);

chekfield= new JComboBox();
chekfield.setBounds(400,14,230,30);
chekfield.setBackground(Color.WHITE);
//chekfield.setForeground(Color.black);
chekfield.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,16));
firstPanel1.add(chekfield);

//----------------------------------
roomNo= new JLabel("Room Number  :");
//roomNo.setForeground(Color.white);
roomNo.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
roomNo.setBounds(270,50,150,50);
firstPanel1.add(roomNo);
firstPanel1.setBounds(0,0,1000,220);

chekfield2= new JComboBox();
chekfield2.setBounds(430,60,200,30);
chekfield2.setBackground(Color.WHITE);
//chekfield2.setForeground(Color.black);
chekfield2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,16));
firstPanel1.add(chekfield2);

//----------------------------------
roomType= new JLabel("Room Type  :");
//roomType.setForeground(Color.white);
roomType.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
roomType.setBounds(650,50,150,50);
firstPanel1.add(roomType);
firstPanel1.setBounds(0,0,1000,220);

chekfield3= new JComboBox();
chekfield3.setBounds(780,60,180,30);
chekfield3.setBackground(Color.WHITE);
//chekfield3.setForeground(Color.black);
chekfield3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,16));
firstPanel1.add(chekfield3);
firstPanel1.setLayout(null);
guu.add(firstPanel1);

Border tableBorder= BorderFactory.createLineBorder(Color.black,3);
    // ---------------------------------------------------------------------------------------------------------
       String[] customerViewColumn = { "FullName", "Email", "CheckInDate", "CheckOutDate","Room Type","Price","bookingStatus"};
       DefaultTableModel tableModel = new DefaultTableModel();
       tableModel.setColumnIdentifiers(customerViewColumn);
       bookingTable2 = new JTable(tableModel);
       JScrollPane scroll = new JScrollPane(bookingTable2);
       //-----------------------------------------------------------------------------------------------------------
       bookingTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
       bookingTable2.setFillsViewportHeight(true);
       scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
       scroll.setBounds(25, 230, 935, 480);
       bookingTable2.setBorder(tableBorder);
       guu.add(scroll);


guu.setResizable(false);
guu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
guu.setSize(1000,760);
guu.setLocationRelativeTo(null);
guu.setLayout(null);
        guu.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

}
public static void main(String[]args) {
Staff kk=new Staff();
}
}