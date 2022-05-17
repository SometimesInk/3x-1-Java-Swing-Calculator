import javax.swing.*;
import java.util.*;

class Main{
	public static void main(String [] arg){
		Boolean isEnded = false;
		Scanner newScan = new Scanner(System.in);
		
		JFrame jf = new JFrame("3x+1 Calculator V1");
		JLabel jl = new JLabel("No Seed Entered.");
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jf.setSize(300,300);
		jf.getContentPane().add(jl);
		jf.setVisible(true);

		System.out.println("Enter a seed: ");
		String seed = newScan.nextLine();
		Integer x = Integer.valueOf(seed);
		Integer y = 0;
		Integer n = 100;

		while(isEnded == false)					
		{
			    try {
					Thread.sleep(n);
					}
				catch (InterruptedException e) {
					System.err.format("IOException: %s%n", e);
					}
			
			if(x == 1)	
			{
				isEnded = true;
				jl.setText(x + ". Finished in " + y + " calculations.");
			}		
			else
			{
				if(x % 2 == 0)	
				{		
					System.out.println(x / 2);
					x = x / 2;
					y = y + 1;
					jl.setText("Now:" + x + ". " + y + " calculations.");
				}	
				else
				{	
					System.out.println(x * 3 + 1);	
					x = x * 3 + 1;
					y = y + 1;
					jl.setText("Now:" + x + ". " + y + " calculations.");
				}	
			}	
		}
	}
}
