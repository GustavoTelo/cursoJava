package Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileEBufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] list = new String[] {"Salém" , "Mavis", "Buck", "Neve", "Julia", "Gustavo"};
		
		
		String path = "C:\\projetos-eclipse\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for ( String line : list) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
