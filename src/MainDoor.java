import javax.swing.JFrame;


public class MainDoor
{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("SWU COFFEE"); // frame title: "SWU COFFEE"
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // for closing frame
		frame.setResizable(false); // fix frame size
		
	
		Shop primary = new Shop();
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
}