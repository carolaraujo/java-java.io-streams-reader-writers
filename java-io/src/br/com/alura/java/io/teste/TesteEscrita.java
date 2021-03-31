package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException{
		
		//Fluxo de Sa�da de Arquivo
		OutputStream fos = new FileOutputStream("lorem.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("hjbahisdbuiabduiadbuiasbdiawudfbaw");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("akjfbnaijfbaufbauisfbuioasfbweuiofb");
		
		
		bw.close();
	}

}
