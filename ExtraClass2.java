package com.Bridgelabz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExtraClass2 {
	
	
	
	
	

		private static final String FILENAME = "/home/bridgelabz3/Desktop/Raghava/raghava/fileiodemo";

		public static void main(String[] args)
		{

			BufferedWriter bw = null;
			FileWriter fw = null;

			try {

				String content = "This is the content to write into file\n";

				fw = new FileWriter(FILENAME);
				bw = new BufferedWriter(fw);
				bw.write(content);

				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}

		}

	}
	
	
	
	


