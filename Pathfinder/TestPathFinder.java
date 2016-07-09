package assignment9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestPathFinder {

	
	public static void main(String[] args) {
		
		/*
		 * The below code assumes you have a file "unsolvable.txt" in your project folder.
		 * If PathFinder.solveMaze is implemented, it will create a file "unsolvableSol.txt" in your project folder.
		 * You will have to browse to that folder to view the output, it will not
		 * automatically show up in Eclipse.
		 */
		
		PathFinder.solveMaze("unsolvable.txt", "unsolvableOutput.txt");
		String solution = fileToString("unsolvableSol.txt");
		if(PathFinder.getOutputString().equals(solution)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	}

	private static String fileToString(String filename) {

		String s = "";
		try {
			BufferedReader input = new BufferedReader(new FileReader(filename));
			while(input.ready()){
				s += (char) input.read();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return s;
	}

}