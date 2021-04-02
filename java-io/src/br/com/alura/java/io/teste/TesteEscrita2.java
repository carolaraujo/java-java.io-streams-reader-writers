package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita2 {
	
	public static void main(String[] args) throws IOException{
		
		//Fluxo de Saída de Arquivo
//		OutputStream fos = new FileOutputStream("lorem.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("nubuabsbBsubfsBFbfBSFbfbSUIFBUe");
		ps.println();
		ps.println("jbdibIUBQbFBBFBFEUUIWasnaNnsnu");
		
		ps.close();
		//bw.write("hjbahisdbuiabduiadbuiasbdiawudfbaw");
		//bw.write("\r\n"); //nova linha
//		bw.write(System.lineSeparator()); //nova linha
//		bw.newLine(); //nova linha
//		bw.newLine();
		//bw.write("akjfbnaijfbaufbauisfbuioasfbweuiofb");
		
		
		//bw.close();
	}

}
