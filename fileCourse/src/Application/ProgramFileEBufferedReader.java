package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileEBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stup
	
		String path = "C:\\Users\\Gustavo\\OneDrive\\Área de Trabalho\\planilhas\\GABARITO ORCAMENTOS.txt";

		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
			
		}
		catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		
		

	}

}
