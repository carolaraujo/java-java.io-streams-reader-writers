package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWrite {
	
	public static void main(String[] args) throws IOException {
		
		long ini = System.currentTimeMillis();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("ncasnasnasnaaududbdisuvbuivb");
		bw.newLine();
		bw.write("jdnnufufbuefbuiefbbasjkscsajcbauqbcqiucbq");
		
		bw.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - ini) + " milissegundos");
		
		
	}

}
