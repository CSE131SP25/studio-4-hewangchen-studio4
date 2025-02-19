package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double pOne = in.nextDouble();
		double pTwo = in.nextDouble();
		double pThree = in.nextDouble();
		double pFour = in.nextDouble();
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if (shape.equals("rectangle")) {
		if (isFilled == true) {
			StdDraw.filledRectangle(pOne, pTwo, pThree, pFour);
		}
		else {
			StdDraw.rectangle(pOne, pTwo, pThree, pFour);
		}
		StdDraw.show();}
		else if(shape.equals("ellipse")) {
			if (isFilled == true) {
				StdDraw.filledEllipse(pOne, pTwo, pThree, pFour);
			}
			else {
				StdDraw.ellipse(pOne, pTwo, pThree, pFour);
			}
			StdDraw.show();
		}
		else if(shape.equals("triangle") ) {
			double pFive = in.nextDouble();
			double pSix = in.nextDouble();
			double[] xCoord = {pOne, pThree, pFive};
			double[] yCoord = {pTwo, pFour, pSix};
			
			
			if (isFilled == true) {
				StdDraw.filledPolygon(xCoord, yCoord);
			}
			else {
				StdDraw.polygon(xCoord, yCoord);
			}
			StdDraw.show();
			}
		}
	}

