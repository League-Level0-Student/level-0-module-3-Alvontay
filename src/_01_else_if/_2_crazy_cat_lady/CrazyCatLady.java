
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		String cats = JOptionPane.showInputDialog("how many cats do you have?");	// 1. Ask the user how many cats they have
		
		int numOfCats = Integer.parseInt(cats); 	// 2. Convert their answer into an int
			
		if (numOfCats > 2) {
			JOptionPane.showMessageDialog(null, "Your a crazy cat lady");
		} else if (numOfCats > 0 && numOfCats < 3) {
			playVideo("https://images.unsplash.com/photo-1611915387288-fd8d2f5f928b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&w=1000&q=80");
		} else if (numOfCats == 0) {
			playVideo("https://bloximages.newyork1.vip.townnews.com/khq.com/content/tncms/assets/v3/editorial/2/63/263752e5-cec6-5087-aac4-aa8c4c7447bf/5bfe0bbc51bdf.image.jpg");
		}


		
		
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

