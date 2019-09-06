/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationform1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


class RegForm extends JFrame implements ActionListener{

    JLabel name;
    JLabel mobile;
    JLabel gender;
    JRadioButton male;
    JRadioButton female;
    JCheckBox jCheckBox;
    JTextField t_name;
    JTextField t_mobile;
    JLabel address;
    JTextArea t_area;
    JButton submit;
    Container c;
    ButtonGroup buttonGroup;
    JTextArea t_area2;
    JLabel dob;
    JComboBox date;
    JComboBox month;
    JComboBox year;
    
    RegForm(){
    
        c= this.getContentPane();
        c.setLayout(null);
        
        name=new JLabel();
        name.setText("Name");
        name.setBounds(100,50,100,50);
        c.add(name);
        
        t_name= new JTextField();
        t_name.setBounds(220, 55, 150, 30);
        c.add(t_name);
        
        mobile = new JLabel();
        mobile.setText("Mobile");
        mobile.setBounds(100, 90, 100, 50);
        c.add(mobile);
        
         t_mobile= new JTextField();
        t_mobile.setBounds(220, 95, 150, 30);
        c.add(t_mobile);
        
        gender = new JLabel();
        gender.setBounds(100, 130, 100, 50);
        gender.setText("Gender");
        c.add(gender);
        
        male= new JRadioButton();
        male.setText("Male");
        male.setBounds(220, 130, 90, 50);
        c.add(male);
        
        female= new JRadioButton();
        female.setText("Female");
        female.setBounds(310, 130, 100, 50);
        c.add(female);
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        
        dob = new JLabel();
        dob.setText("Date of Birth");
        dob.setBounds(100, 170 ,100 , 50);
        c.add(dob);
        
        String[] dat = new String[31];
        for(int i=1;i<=31;i++)
        {
           dat[i-1]=Integer.toString(i);
           date = new JComboBox(dat);
        }
        date.setBounds(220,185,40,20);
        c.add(date);
        
        String[] mon ={"Jan","feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        month = new JComboBox(mon);
        month.setBounds(265,185,50,20);
        c.add(month);
        
        String[] yea = new String[80];
        for(int i=1950;i<2020;i++)
        {
          yea[i-1950]=Integer.toString(i);
          year= new JComboBox(yea);
        }
        year.setBounds(320,185,55,20);
        c.add(year);
        
        
        address =new JLabel();
        address.setText("Address");
        address.setBounds(100, 210, 100, 50);
        c.add(address);
        
        t_area = new JTextArea();
        t_area.setBounds(220, 230, 150, 100);
        Border border = BorderFactory.createLineBorder(Color.black,1);
        t_area.setBorder(border);
        c.add(t_area);
        
        
        jCheckBox = new JCheckBox();
        jCheckBox.setText("Acccept all terms and conditions");
        jCheckBox.setBounds(120,335,220,50);
        c.add(jCheckBox);        

        submit = new JButton();
        submit.setText("submit");
        submit.setBounds(150,388,100,30);
        c.add(submit);
        submit.addActionListener(this);
        
        t_area2 = new JTextArea();
        t_area2.setBounds(520,50,255,300);
        c.add(t_area2);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {    
        if(jCheckBox.isSelected()==true){
            
            String f_name=t_name.getText();
            String f_mobile=t_mobile.getText();
            String f_gen="Male";
            
            if(female.isSelected()==true){
               f_gen="Female";
            }
            
            String f_date = (String)date.getSelectedItem();
            String f_month =(String)month.getSelectedItem();
            String f_year = (String)year.getSelectedItem();
            String f_tarea= t_area.getText();
            
            t_area2.setText("Name :-> "+f_name +"\nMobile :-> "+f_mobile+"\nGender :-> "+f_gen+"\nDate of Birth :-> "+f_date+"/"+f_month
            +"/"+f_year+"\n Address :->"+f_tarea);
           
            
        }
       else
        {
           t_area2.setText("please accept terms and conditions ");
        
        }
    }


}
public class RegistrationForm1 {

    
    public static void main(String[] args) {
        RegForm regForm = new RegForm();
        regForm.setVisible(true);
        regForm.setTitle("Registration Form");
        regForm.setBounds(100, 50, 1000, 500);
        regForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
