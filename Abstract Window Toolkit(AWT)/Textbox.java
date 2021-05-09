import java.awt.*;
class Textbox extends Frame
{
  TextField tf,tf1;
   Textbox()
   {  
   	 Frame f= new Frame("Java Programing");
     tf=new TextField();
     tf.setBounds(50,50,60,20);
     tf1=new TextField();
     tf1.setBounds(70,100,60,20);
     f.add(tf);
     f.add(tf1);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);
    }
     public static void main(String args[])
       {
        Textbox t= new Textbox();
       }
}