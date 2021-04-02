package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita3 {
	
	public static void main(String[] args) throws IOException{
		
		//Fluxo de Saída de Arquivo
//		OutputStream fos = new FileOutputStream("lorem.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("hjbahisdbuiabduiadbuiasbdiawudfbaw");
		//bw.write("\r\n"); //nova linha
		bw.write(System.lineSeparator()); //nova linha
		bw.newLine(); //nova linha
		bw.newLine();
		bw.write("akjfbnaijfbaufbauisfbuioasfbweuiofb");
		
		
		bw.close();
	}

}
