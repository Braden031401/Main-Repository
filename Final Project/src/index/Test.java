package index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import java.net.URL;
class Test extends JFrame implements ActionListener
{
  String home = System.getProperty("user.home");
  JButton btn = new JButton("Play Sound");
  URL url = new URL(home + "/Downloads/boo.wav");
  AudioClip sound;
  @SuppressWarnings("deprecation")
public Test()
  {
    setSize(300,100);
    setLocation(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel jp = new JPanel();
    btn.addActionListener(this);
    jp.add(btn);
    getContentPane().add(jp);
    pack();
    try{sound = Applet.newAudioClip(url.toURI());}
    catch(Exception e){e.printStackTrace();}
  }
  public void actionPerformed(ActionEvent ae){sound.play();}
  public static void main(String args[]){new Test().setVisible(true);}
}
//c:\\Windows\\media\\ding.wav