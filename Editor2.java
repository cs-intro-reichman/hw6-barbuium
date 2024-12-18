import java.awt.Color;
import java.awt.Image;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {
	public static void main (String[] args) {
	//// Replace this comment with your code.
	//// This function is similar to the main function of Editor1.java			
	String fileName = args[0];
	int newWidth = Integer.parseInt(args[1]);
	int newHeight = Integer.parseInt(args[2]);

	Color[][] image = Runigram.read(fileName);
	Color[][] scaledImage = Runigram.scaled(image, newWidth, newHeight);

	Runigram.setCanvas(image);
	Runigram.display(image);
	StdDraw.pause(2000); 
	Runigram.setCanvas(scaledImage);
	Runigram.display(scaledImage);
	}
}