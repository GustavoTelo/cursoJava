package Application;

import java.io.File;
import java.util.Scanner;

public class ProgramInformationPathFile {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a file path: ");
		String strPath = sc.nextLine();

		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); // obtem nome do arquivo
		System.out.println("getParent: " + path.getParent());// obtem somente o caminho
		System.out.println("getPath: " + path.getPath());// imprime o caminho completo
		
		
		
		
		sc.close();
		
		
	}
}
