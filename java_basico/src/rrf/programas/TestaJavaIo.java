package rrf.programas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaJavaIo {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new FileInputStream("Leitura.txt"));
		PrintStream ps = new PrintStream("Saida.txt");
		
		while(sc.hasNextLine()){
			String linha = sc.nextLine();	
			ps.println(linha);
		}		
		
		ps.close();
		sc.close();
		
		
		/*InputStream is = new FileInputStream("Leitura.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		while(linha != null){
			System.out.println(linha);
			linha = br.readLine();			
		}
		
		br.close();*/
	}

}
