package br.com.vieiracode.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um arquivo.

		String arquivo =  "lorem-2.txt";

		OutputStream fos = new FileOutputStream(arquivo);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Meu nome � ari e eu n�o estou nem ai.");
		bw.newLine();
		bw.newLine();
		bw.write("Hello world!");

		bw.close();

	}

}