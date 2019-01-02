import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Shop extends JPanel
{


   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private JPanel base, success, hint; // 'base', 'success', 'hint'
   private JLabel baselabel, mainlabel, success1, success2, success3, success4, success5, fail, hintimage,
                  c1, c2, c3, c4, c5, c6, c10; // JLabel 
   private ImageIcon icon1, icon2, icon3, icon4, icon5, icon6, icon7,icon8, icon9, c11, c22, c33, c44, c55, c66, c77; // icon
   private JFrame success_, Hint; //success window, hint window

   //                        material for making coffee(button1~6, 10), hint, again, success, close, back button
   private JButton button1,button2,button3, button4, button5, button6,button7, button8, button9, button10, button11, button12;
   // count when user clicks the button1~6          
   private int count1, count2, count3, count4, count5, count6, count10;
   
   //2. declaration of listener object
   private JButtonListenr buttonL; 
       


   public Shop(){
      setBackground(Color.white); // white background
      setPreferredSize(new Dimension(880,600)); // size 880x600
      setLayout(null); // arrange manually layout
     
      // count n = button1 clicked number n
      count1 = 0;
      count2 = 0;
      count3 = 0;
      count4 = 0;
      count5 = 0;
      count6 = 0; 
      count10 = 0;
      
      
      //2. creation of listener object
      buttonL = new JButtonListenr();      
      
      //base Panel
      base = new JPanel();
      base.setBounds(10,10, 860,580); //(x,y,w,h)
      base.setBackground(Color.white); 
      base.setLayout(null); 
      base.addMouseListener(new MyMouseAdapter()); // MouseListener event
      add(base); 
      
      //when user success making coffe, frame and panel(음료 제조 성공 시 나오는 창)
      success_= new JFrame("COFFEE SUCCESS"); // success_  frame title: "COFFEE SUCCESS"
      success_.setBackground(Color.white); // white background
      success_.setPreferredSize(new Dimension(500,500)); // size 500x500으로 
      success_.setLocation(190,50); // location fix
      success_.addWindowListener(new MyWindowListner()); //closing window = reset
      success_.setLayout(null); 
         
      success = new JPanel(); 
      success.setPreferredSize(new Dimension(500,500)); 
      success.setBounds(0,0,500,500);
      success.setBackground(Color.white);
      success.setLayout(null);
      // success frame and panel end
      
      
      // Hint Screen and panel
      Hint= new JFrame("RECIPE HINT"); // title: "RECIPE HINT"
      Hint.setBackground(Color.white);
      Hint.setPreferredSize(new Dimension(500,400)); 
      Hint.setLocation(190,50); 
      Hint.setLayout(null); 
      
      hint = new JPanel(); 
      hint.setPreferredSize(new Dimension(500,400)); 
      hint.setBounds(0,0,500,500);
      hint.setBackground(Color.white);
      hint.setLayout(null);
      //Hint Screen and panel end
      
      
      //icon image
      icon1 = new ImageIcon("image/shop.jpg"); //Beverage manufacturing window image
       //The image of a beverage
      icon2 = new ImageIcon("image/americano.jpg");       
      icon3 = new ImageIcon("image/latte.png");      
      icon4 = new ImageIcon("image/choco.png");      
      icon5 = new ImageIcon("image/mocha.png");      
      icon6 = new ImageIcon("image/vanila.jpg");      
      
      icon7 = new ImageIcon("image/fail.png"); 
      icon8 = new ImageIcon("image/cafemain.jpg"); 
      icon9 = new ImageIcon("image/hint.jpg"); 

      //baselabel = shop screen 
      baselabel = new JLabel("", icon1, SwingConstants.CENTER); 
      base.add(baselabel); 
      baselabel.setBounds(0,0, 860, 580);
      baselabel.setVisible(false); 
      
      //first scereen (MainDoor)
      mainlabel = new JLabel("", icon8, SwingConstants.CENTER); 
      base.add(mainlabel);
      mainlabel.setBounds(0,0, 860, 580);
      
      //button
      button1 = new JButton("shot"); 
      button1.setBounds(65, 280, 80, 20); 
      button1.addActionListener(buttonL); 
      baselabel.add(button1);
      
      button2 = new JButton("ice");
      button2.setBounds(195, 280, 80, 20);  
      button2.addActionListener(buttonL);
      baselabel.add(button2); 
      
      button3 = new JButton("vanilla"); 
      button3.setBounds(325, 280, 80, 20); 
      button3.setBackground(Color.yellow);
      button3.addActionListener(buttonL); 
      baselabel.add(button3); 
      
      button4 = new JButton("whipping"); 
      button4.setBounds(455, 280, 80, 20);  
      button4.addActionListener(buttonL);
      baselabel.add(button4); 
      
      button5 = new JButton("milk"); 
      button5.setBounds(585, 280, 80, 20);  
      button5.addActionListener(buttonL); 
      baselabel.add(button5); 
      
      button6 = new JButton("water"); 
      button6.setBounds(715, 280, 80, 20);  
      button6.addActionListener(buttonL); 
      baselabel.add(button6);
      
      button7 = new JButton("hint"); 
      button7.setBounds(750, 40, 70, 35);  
      button7.addActionListener(buttonL); 
      baselabel.add(button7);
      
      button8 = new JButton("again"); 
      button8.setBounds(750, 450, 70, 35);  
      button8.addActionListener(buttonL); 
      button8.setEnabled(false);
      baselabel.add(button8); 
      
      button9 = new JButton("finish"); 
      button9.setBounds(750, 500, 70, 35);  
      button9.addActionListener(buttonL); 
      button9.setEnabled(false); 
      baselabel.add(button9); 
      
      button10 = new JButton("Chocolate Syrup"); 
      button10.setBounds(315, 310, 100, 20);
      button10.setBackground(new Color(130,58,62));
      button10.addActionListener(buttonL); 
      baselabel.add(button10);

      button11 = new JButton("close"); 
      button11.setBounds(370,410, 100, 30); 
      button11.addActionListener(buttonL); 
      success.add(button11); 

      
      // generate icon image
        c11 = new ImageIcon ("image/shot.png");
        c22 = new ImageIcon  ("image/ice.png");
        c33 = new ImageIcon  ("image/source.png");
        c44 = new ImageIcon  ("image/cream.png");
        c55 = new ImageIcon  ("image/milk.png");
        c66 = new ImageIcon  ("image/water.png");
        c77 = new ImageIcon  ("image/source2.png"); 

        
         c1 = new JLabel (c11);
         baselabel.add(c1);
         c1.setBounds(55,450,80,80);
         c1.setVisible(false); 
                 
         c2 = new JLabel (c22);
         baselabel.add(c2);
         c2.setBounds(185,450,80,80);
         c2.setVisible(false);
      
         c3 = new JLabel (c33);
         c3.setBounds(315,410,80,80);
         baselabel.add(c3);
         c3.setVisible(false);
              
         c4 = new JLabel (c44);
         c4.setBounds(445,450,80,80);
         baselabel.add(c4); 
         c4.setVisible(false); 
         c5 = new JLabel (c55);
         c5.setBounds(575,450,80,80);
         baselabel.add(c5);
         c5.setVisible(false); 
         
         c6 = new JLabel (c66);
         c6.setBounds(670,450,80,80);
         baselabel.add(c6);
         c6.setVisible(false); 

         c10 = new JLabel(c77);
         c10.setBounds(315,490,80,80);
         baselabel.add(c10);
         c10.setVisible(false); 
         
         

      //if hint click 
      hintimage = new JLabel("",icon9,SwingConstants.CENTER); //show hint.jpg
      hint.add(hintimage); 
      hintimage.setBounds(0,0,500,350); 
      hintimage.setVisible(true); 


      //if success making coffee
      //americano success
      success1 = new JLabel("Americano Success", icon2, SwingConstants.CENTER); 
      success.add(success1); 
      success1.setFont(new Font("Verdana", Font.BOLD, 20)); 
      success1.setForeground(Color.RED); 
      success1.setHorizontalTextPosition(SwingConstants.CENTER); 
      success1.setVerticalTextPosition(SwingConstants.BOTTOM); 
      success1.setBounds(50,20,400,400);
      success1.setVisible(false); 
      
      //latte success
      success2 = new JLabel("Ice latte Success", icon3, SwingConstants.CENTER);
      success.add(success2);
      success2.setFont(new Font("Verdana", Font.BOLD, 20));
      success2.setForeground(Color.RED); 
      success2.setHorizontalTextPosition(SwingConstants.CENTER);
      success2.setVerticalTextPosition(SwingConstants.BOTTOM);
      success2.setBounds(50,20,400,400);
      success2.setVisible(false);

      //vanila success
      success3 = new JLabel("Vanila latte Success", icon6, SwingConstants.CENTER);
      success.add(success3);
      success3.setFont(new Font("Verdana", Font.BOLD, 20));
      success3.setForeground(Color.RED); 
      success3.setHorizontalTextPosition(SwingConstants.CENTER);
      success3.setVerticalTextPosition(SwingConstants.BOTTOM);
      success3.setBounds(50,20,400,400);
      success3.setVisible(false);
      
      //mocha success
      success4 = new JLabel("Cafemoca Success", icon5, SwingConstants.CENTER);
      success.add(success4);
      success4.setFont(new Font("Verdana", Font.BOLD, 20));
      success4.setForeground(Color.RED); 
      success4.setHorizontalTextPosition(SwingConstants.CENTER);
      success4.setVerticalTextPosition(SwingConstants.BOTTOM);
      success4.setBounds(50,20,400,400);
      success4.setVisible(false);
      
      //choco success
      success5 = new JLabel("Ice choco Success", icon4, SwingConstants.CENTER);
      success.add(success5);
      success5.setFont(new Font("Verdana", Font.BOLD, 20));
      success5.setForeground(Color.RED); 
      success5.setHorizontalTextPosition(SwingConstants.CENTER);
      success5.setVerticalTextPosition(SwingConstants.BOTTOM);
      success5.setBounds(50,20,400,400);
      success5.setVisible(false);
      
      //if fail 
      fail = new JLabel(icon7); //show fail.jpg 
      success.add(fail); 
      fail.setBounds(50,20,400,400);
      fail.setVisible(false);

      
      //Hint Visible false
      Hint.getContentPane().add(hint); 
      Hint.pack(); 
      Hint.setVisible(false);

      
      //success_ Visible false
      success_.getContentPane().add(success);
      success_.pack(); 
      success_.setVisible(false);

      
   } //Shop()
   
   


// MouseListener, change label
   class MyMouseAdapter extends MouseAdapter 
   {
      Point point;   
      
      public void mousePressed(MouseEvent event){ 
    
         point = event.getPoint( ); // get mouse point 
     
         if( (point.x >= 146 && point.x <= 281) && (point.y >= 315 && point.y <= 435)  ) // When the mouse is within the x, y coordinate range
         {
            mainlabel.setVisible(false); 
            baselabel.setVisible(true);  
         } //if        
      }   //mousePressed class      
   }// MouseEventHandler class
   

   
   // button click 
   private class JButtonListenr implements ActionListener 
   {
      
      public void actionPerformed(ActionEvent event){
         
         //4.event handling
         
         Object obj = event.getSource(); 
         
         // material, count++
         if(obj == button1){
            c1.setVisible(true); //shot, when clicking this button, count1 ++
            count1++;
         }else if(obj == button2){
            c2.setVisible(true); //ice, count2 ++
            count2++;
         }else if(obj == button3){
            c3.setVisible(true); //vanila source, count3 ++
            count3++;
         }else if(obj == button4){
            c4.setVisible(true); //cream, count4 ++
            count4++;
         }else if(obj == button5){
            c5.setVisible(true); //milk, count5 ++
            count5++;
         }else if(obj == button6){
            c6.setVisible(true); //water, count6 ++
            count6++;
         }else if(obj==button10){
        	 c10.setVisible(true); //choco source, count10 ++
        	 count10++;
         }
          
         if(obj == button7){ //hint, show hint label
             Hint.setVisible(true);
          }
         
         if (obj != button7 && obj != button12){
        	button9.setEnabled(true);
            button8.setEnabled(true);
            } //button setEnabled(true);


         if(obj == button11){               // go to previous page
            success_.setVisible(false);    
            c1.setVisible(false);           // c1~6, c10 count reset
          	c2.setVisible(false);
          	c3.setVisible(false);
          	c4.setVisible(false);
          	c5.setVisible(false);
          	c6.setVisible(false);
          	c10.setVisible(false);
          	count1=0;                       // count1~6, count10 횟수 초기화
          	count2=0;
          	count3=0;
          	count4=0;
          	count5=0;
          	count6=0;
          	count10=0;  
          	success1.setVisible(false);     // reset
          	success2.setVisible(false);
          	success3.setVisible(false);
          	success4.setVisible(false);
          	success5.setVisible(false);
          	fail.setVisible(false);
          } //success screen exit
         
         if(obj == button12) {             // disappear hint screen
             Hint.setVisible(false);                
          } //hint screen exit
         
         if(obj == button8){               // count reset
         	c1.setVisible(false);
         	c2.setVisible(false);
         	c3.setVisible(false);
         	c4.setVisible(false);
         	c5.setVisible(false);
         	c6.setVisible(false);
         	c10.setVisible(false);
         	count1=0;
         	count2=0;
         	count3=0;
         	count4=0;
         	count5=0;
         	count6=0;
         	count10=0;
          	fail.setVisible(false);
         } //reset

         if (count1>0 && count2>0 && count6>0 && count3==0 && count4==0 && count5==0 && count10==0){     
                 if(obj == button9){     
        		  success_.setVisible(true);
                  success1.setVisible(true);
               }   // if button9                                
            }  //succuess americano       
         else if (count1>0&& count2>0 && count4>0 && count5>0 && count10>0 && count3==0 && count6==0){ 
        	 if(obj == button9){         
        		 success_.setVisible(true);                 
        		 success4.setVisible(true);
        	 } //if button9
         } //succuess caffe moca
        	
         else if(count1>0&& count2>0 && count3>0 && count5>0 && count4==0 && count6==0 && count10==0){
            	  if(obj == button9){         
                  success_.setVisible(true);
                  success3.setVisible(true);
                  } //if button9 
            }//succuess vanila
         else if(count2>0 && count4>0 && count5>0 && count10>0 && count1==0 && count3==0 && count6==0){ 
                  if(obj == button9){         
                  success_.setVisible(true);
                  success5.setVisible(true);
                  } //if button9
            }  //succuess ice choco
         else if (count1>0 && count2>0 && count5>0 && count3==0 && count4==0 && count6==0 && count10==0){ 
                if(obj == button9){          
                success_.setVisible(true);
                success2.setVisible(true);
                } //if button9
         }  //succuess latte
          else{                                  
                  if(obj == button9){         
                  success_.setVisible(true);
                  fail.setVisible(true);
                  success2.setVisible(false);
                	  }  //fail       
          }  //if else if     
       } //actionPerformed()
     } //ButtonListener class
   
   
   //windowListener
   private class MyWindowListner implements WindowListener
	{

		public void windowOpened(WindowEvent e) {}

		public void windowClosing(WindowEvent e) {success_.setVisible(false);    
        c1.setVisible(false);           // click status reset
      	c2.setVisible(false);
      	c3.setVisible(false);
      	c4.setVisible(false);
      	c5.setVisible(false);
      	c6.setVisible(false);
      	c10.setVisible(false);
      	count1=0;                       // count1~6, count10 reset
      	count2=0;
      	count3=0;
      	count4=0;
      	count5=0;
      	count6=0;
      	count10=0;  
      	success1.setVisible(false);     
      	success2.setVisible(false);
      	success3.setVisible(false);
      	success4.setVisible(false);
      	success5.setVisible(false);
      	fail.setVisible(false);}  

		public void windowClosed(WindowEvent e) {}

		public void windowIconified(WindowEvent e) {}

		public void windowDeiconified(WindowEvent e) {}

		public void windowActivated(WindowEvent e) {}

		public void windowDeactivated(WindowEvent e) {}
	
	} //WindowListener 
	
  } //Shop class