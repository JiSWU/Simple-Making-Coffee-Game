import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Shop extends JPanel
{

   private static final long serialVersionUID = 1L;
   private JPanel base, success, hint;  // 'base', 'success', 'hint'
   private JLabel baselabel, mainlabel, success1, success2, success3, success4, success5, fail, hintimage,
                  c1, c2, c3, c4, c5, c6, c10;  // JLabel 
   private ImageIcon icon1, icon2, icon3, icon4, icon5, icon6, icon7,icon8, icon9, c11, c22, c33, c44, c55, c66, c1010;  // icon
   private JFrame success_, Hint;//success window, hint window
    //                        material for making coffee(button1~6, 10), hint, again, success, close, back button
   private JButton button1,button2,button3, button4, button5, button6,button7, button8, button9, button10, button11;
  // count when user clicks the button1~6              
   private int count1, count2, count3, count4, count5, count6, count10;
   private int ncount1, ncount3, ncount10;// count when user clicks the shot, vanila or choco source       
   
   //2. declaration of listener object(listener 객체 선언)
   private JButtonListenr buttonL; 
       


   public Shop(){
      setBackground(Color.white); // white background
      setPreferredSize(new Dimension(880,600));// size 880x600
      setLayout(null);// arrange manually layout
     
      // count n = button1 clicked number n
      count1 = 0;
      count2 = 0;
      count3 = 0;
      count4 = 0;
      count5 = 0;
      count6 = 0; 
      count10 = 0;
      
      //ncount1, ncount3, ncount10 count, set 0
      ncount1=0; //shot clikc count
      ncount3=0; //vanila clikc count	  
      ncount10=0; //choco clikc count

      
      //2. creation of listener object (listener 객체 생성)
      buttonL = new JButtonListenr();      

      //base Panel
      base = new JPanel(); 
      base.setBounds(10,10, 860,580); 
      base.setBackground(Color.white); 
      base.setLayout(null); 
      base.addMouseListener(new MyMouseAdapter()); //mouser click event
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
      icon1 = new ImageIcon("./image/shop.jpg"); //Beverage manufacturing window image
       //The image of a beverage
      icon2 = new ImageIcon("./image/americano.jpg");       
      icon3 = new ImageIcon("./image/latte.png");      
      icon4 = new ImageIcon("./image/choco.png");      
      icon5 = new ImageIcon("./image/mocha.png");      
      icon6 = new ImageIcon("./image/vanila.jpg");      
      
      icon7 = new ImageIcon("./image/fail.png"); // fail image
      icon8 = new ImageIcon("./image/cafemain.jpg"); // first image(background image)
      icon9 = new ImageIcon("./image/hint.jpg"); //hint image

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
      c11 = new ImageIcon ("./image/shot.png"); 
      c22 = new ImageIcon  ("./image/ice.png"); 
      c33 = new ImageIcon  ("./image/source.png"); 
      c44 = new ImageIcon  ("./image/cream.png"); 
      c55 = new ImageIcon  ("./image/milk.png");
      c66 = new ImageIcon  ("./image/water.png"); 
      c1010 = new ImageIcon  ("./image/source2.png"); 

        
      c1 = new JLabel (c11); //shot icon
      baselabel.add(c1);
      c1.setBounds(55,450,100,100);  
 		c1.setFont(new Font("Verdan", Font.BOLD,9)); 
      c1.setHorizontalTextPosition(SwingConstants.CENTER);
      c1.setVerticalTextPosition(SwingConstants.TOP); 
      c1.setVisible(false);
         
        
      c2 = new JLabel (c22); 
      baselabel.add(c2);
      c2.setBounds(185,450,100,100); 
 		c2.setFont(new Font("Verdan", Font.BOLD,9));
      c2.setHorizontalTextPosition(SwingConstants.CENTER); 
      c2.setVerticalTextPosition(SwingConstants.TOP);
      c2.setVisible(false); 
      
      c3 = new JLabel (c33); 
      baselabel.add(c3);
      c3.setBounds(285,450,100,100);  
 		c3.setFont(new Font("Verdan", Font.BOLD,8));
      c3.setHorizontalTextPosition(SwingConstants.CENTER); 
      c3.setVerticalTextPosition(SwingConstants.TOP);
      c3.setVisible(false); 
         
      c4 = new JLabel (c44);
      baselabel.add(c4); 
      c4.setBounds(445,450,100,100); 
 		c4.setFont(new Font("Verdan", Font.BOLD,9));
      c4.setHorizontalTextPosition(SwingConstants.CENTER);
      c4.setVerticalTextPosition(SwingConstants.TOP); 
      c4.setVisible(false); 
         
      c5 = new JLabel (c55); 
      baselabel.add(c5);
      c5.setBounds(575,450,100,100); 
 		c5.setFont(new Font("Verdan", Font.BOLD,9));
      c5.setHorizontalTextPosition(SwingConstants.CENTER);
      c5.setVerticalTextPosition(SwingConstants.TOP);
      c5.setVisible(false);
         
      c6 = new JLabel (c66); 
      baselabel.add(c6);
      c6.setBounds(670,450,100,100);  
 		c6.setFont(new Font("Verdan", Font.BOLD,9)); 
      c6.setHorizontalTextPosition(SwingConstants.CENTER);
      c6.setVerticalTextPosition(SwingConstants.TOP); 
      c6.setVisible(false); 
         
      c10 = new JLabel(c1010); 
      baselabel.add(c10);
      c10.setBounds(355,450,100,100); 
      c10.setFont(new Font("Verdan", Font.BOLD,8));
      c10.setHorizontalTextPosition(SwingConstants.CENTER); 
      c10.setVerticalTextPosition(SwingConstants.TOP); 
      c10.setVisible(false); 

      //if hint click (힌트 버튼을 누르면)
      hintimage = new JLabel("",icon9,SwingConstants.CENTER);
      hint.add(hintimage); 
      hintimage.setBounds(0,0,500,350); 
      hintimage.setVisible(true);


      //if success(음료 제조에 성공할 때 )
      //americano success image
      success1 = new JLabel("Americano Success", icon2, SwingConstants.CENTER); 
      success.add(success1); 
      success1.setFont(new Font("Verdana", Font.BOLD, 20)); 
      success1.setForeground(Color.RED);
      success1.setHorizontalTextPosition(SwingConstants.CENTER); 
      success1.setVerticalTextPosition(SwingConstants.BOTTOM);
      success1.setBounds(50,20,400,400);
      success1.setVisible(false); 
      
      //latte success image
      success2 = new JLabel("Ice latte Success", icon3, SwingConstants.CENTER);
      success.add(success2);
      success2.setFont(new Font("Verdana", Font.BOLD, 20));
      success2.setForeground(Color.RED); 
      success2.setHorizontalTextPosition(SwingConstants.CENTER);
      success2.setVerticalTextPosition(SwingConstants.BOTTOM);
      success2.setBounds(50,20,400,400);
      success2.setVisible(false);

      //vanila success image
      success3 = new JLabel("Vanila latte Success", icon6, SwingConstants.CENTER);
      success.add(success3);
      success3.setFont(new Font("Verdana", Font.BOLD, 20));
      success3.setForeground(Color.RED); 
      success3.setHorizontalTextPosition(SwingConstants.CENTER);
      success3.setVerticalTextPosition(SwingConstants.BOTTOM);
      success3.setBounds(50,20,400,400);
      success3.setVisible(false);
      
      //mocha success image
      success4 = new JLabel("Cafemoca Success", icon5, SwingConstants.CENTER);
      success.add(success4);
      success4.setFont(new Font("Verdana", Font.BOLD, 20));
      success4.setForeground(Color.RED); 
      success4.setHorizontalTextPosition(SwingConstants.CENTER);
      success4.setVerticalTextPosition(SwingConstants.BOTTOM);
      success4.setBounds(50,20,400,400);
      success4.setVisible(false);
      
      //choco success image
      success5 = new JLabel("Ice choco Success", icon4, SwingConstants.CENTER);
      success.add(success5);
      success5.setFont(new Font("Verdana", Font.BOLD, 20));
      success5.setForeground(Color.RED); 
      success5.setHorizontalTextPosition(SwingConstants.CENTER);
      success5.setVerticalTextPosition(SwingConstants.BOTTOM);
      success5.setBounds(50,20,400,400);
      success5.setVisible(false);
      
      //if fail 
      fail = new JLabel(icon7); 
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
   
   


// MouseListener
   class MyMouseAdapter extends MouseAdapter // MyMouseAdapter는 MouseAdapter을 상속함
   {
      Point point;   
      
      public void mousePressed(MouseEvent event){ 
    
         point = event.getPoint( ); 
     
         if( (point.x >= 146 && point.x <= 281) && (point.y >= 315 && point.y <= 435)  )
         {  //change page
            mainlabel.setVisible(false); 
            baselabel.setVisible(true);  
         } 
         
      }   //mousePressed class      
   }// MouseEventHandler class
   

   
   // 1.Listener class
   private class JButtonListenr implements ActionListener // JButtonListener 가 ActionListener 인터페이스 상속
   {
      
      public void actionPerformed(ActionEvent event){
         
         //4.event handling
         
         Object obj = event.getSource(); 
         
         // 재료 버튼 클릭시
         if(obj == button1){
            c1.setVisible(true); //shot, count++
            count1++; 
            ncount1++; //1씩 상승
            c1.setText("count:"+ncount1); //show shot count
         }else if(obj == button2){
            c2.setVisible(true); //ice, count++
            count2++;
         }else if(obj == button3){
            c3.setVisible(true); //vanila source, count++
            count3++;
            ncount3++; //1씩 상승 
            c3.setText("count:"+ncount3); //show vanilla count
         }else if(obj == button4){
            c4.setVisible(true); //cream, count++
            count4++;
         }else if(obj == button5){
            c5.setVisible(true); //milk, count++
            count5++;
         }else if(obj == button6){
            c6.setVisible(true); //water, count++
            count6++;
         }else if(obj==button10){
        	   c10.setVisible(true); //choco source, count++
        	   count10++;
            ncount10++; //1씩 상승
            c10.setText("count:"+ncount10);//show chocolate source count
         }
      
         
         
         // if second click, disapear image
         if (count2==2){ //remove ice image
        	 count2=0;
        	 c2.setVisible(false);
         }else if(count4==2){ //remove whipping image
        	 count4=0;
        	 c4.setVisible(false);
         }else if(count5==2){ //remove milk image
        	 count5=0;
        	 c5.setVisible(false);
         }else if(count6==2){ //remove water image
        	 count6=0;
        	 c6.setVisible(false);
         } 
         
         //shot or sources are more than five, show warning
         if(ncount1>4 || ncount3>4 || ncount10>4){
        	   int result = JOptionPane.showConfirmDialog(null,"It's too mush, Reduce!");
        	   if(result==JOptionPane.YES_OPTION){
        	   c1.setVisible(false);           //reset c1~6, c10 
           	c2.setVisible(false);
           	c3.setVisible(false);
           	c4.setVisible(false);
           	c5.setVisible(false);
           	c6.setVisible(false);
           	c10.setVisible(false);
           	count1=0;                       // reset count
           	count2=0;
           	count3=0;
           	count4=0;
           	count5=0;
           	count6=0;
           	count10=0;  
          	ncount1=0;  
          	ncount3=0;  
          	ncount10=0;
        	} else { 
            success_.setVisible(true);
            fail.setVisible(true);
            c1.setVisible(false);           // reset c1~6, c10
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c10.setVisible(false);
            count1=0;                       // reset count
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count10=0;  
            ncount1=0; 
            ncount3=0;  
            ncount10=0; 
         } //else if end
      } //end if
   
   
      if(obj == button7){ //show hint
         Hint.setVisible(true);
      }
   
      if (obj != button7){ 
        	button9.setEnabled(true); //finish button
         button8.setEnabled(true); //again button
      } //button setEnabled(true);


      if(obj == button11){             //reset
         success_.setVisible(false);    
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
         success1.setVisible(false);   
         success2.setVisible(false);
         success3.setVisible(false);
         success4.setVisible(false);
         success5.setVisible(false);
         fail.setVisible(false);
         ncount1=0;  
         ncount3=0;  
         ncount10=0;
      } //success screen exit
     
      if(obj == button8){             //reset
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
      	ncount1=0;  
       	ncount3=0; 
       	ncount10=0; 
         } //reset
    
         if (count1>0 && count2==1 && count6==1 && count3==0 && count4==0 && count5==0 && count10==0){ 
               if(obj == button9){     
        		      success_.setVisible(true);
                  success1.setVisible(true);
               }            
         }  //americano       
         else if (count1>0 && count2==1 && count4==1 && count5==1 && count10>0 && count3==0 && count6==0){ 
        	   if(obj == button9){         
        		 success_.setVisible(true);                 
        		 success4.setVisible(true);
        	   } 
         } //caffe moca
        	
         else if(count1>0 && count2==1 && count3>0 && count5==1 && count4==0 && count6==0 && count10==0){ 
            if(obj == button9){         
               success_.setVisible(true);
               success3.setVisible(true);
            } 
         }//vanila
         else if(count2==1 && count4==1 && count5==1 && count10>0 && count1==0 && count3==0 && count6==0){ 
            if(obj == button9){         
               success_.setVisible(true);
               success5.setVisible(true);
            }
         }  //ice choco
         else if (count1>0 && count2==1 && count5==1 && count3==0 && count4==0 && count6==0 && count10==0){ 
            if(obj == button9){          
               success_.setVisible(true);
               success2.setVisible(true);
            }
         }  //latte
         else{ //fail
            if(obj == button9){         
               success_.setVisible(true);
               fail.setVisible(true);
            }  //fail       
          }  //if else if   
       } //actionPerformed()
     } //ButtonListener class
   
   
   //windowListener
   private class MyWindowListner implements WindowListener
	{

		public void windowOpened(WindowEvent e) {}

		public void windowClosing(WindowEvent e) {
		success_.setVisible(false);    
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
      	success1.setVisible(false);     
      	success2.setVisible(false);
      	success3.setVisible(false);
      	success4.setVisible(false);
      	success5.setVisible(false);
      	fail.setVisible(false);
      	ncount1=0;  
      	ncount3=0; 
      	ncount10=0; 
		}  //success_ Frame에 있는 x버튼을 누르면 버튼11(닫기)과 같은효과(reset)
		
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}	
	} //WindowListener 
	
  } //Shop class