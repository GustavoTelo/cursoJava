package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileEBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stup
	
		String path = "C:\\Users\\Gustavo\\OneDrive\\Área de Trabalho\\planilhas\\GABARITO ORCAMENTOS.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			// jeito mais simples:  br = new BufferedReader(new FileReader(path)); mas com isso faz ficar mais dificil de fechar manualmente
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
			
		}
		catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			}
			catch (IOException e ) {
				e.printStackTrace();
			}
			
		}
		

	}

}
