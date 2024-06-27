package prcatice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import io.restassured.internal.support.FileReader;

public class PracticeFile {
	public File f=new File("./sample.txt");
	
	public PracticeFile() throws IOException {
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.newLine();
			bw.write("benarji");
			bw.newLine();
			bw.write("benarji");
		
		    bw.flush();
		
	}
	}
	public void read() throws IOException {
		if(f.exists()) {
			java.io.FileReader r=new java.io.FileReader(f);
			//System.out.println(r.read());
//			int i=r.read();
//			while(i!=-1) {
//				System.out.print(i+"  ");
//				System.out.println();
//				System.out.print((char)i);
//				System.out.println();
//				i = r.read();
//			}
//	
			
			
		}
	}
	
	public void write() {
		
		
		
	}
   public static void main(String[] args) throws IOException {
	   PracticeFile p=new PracticeFile() ;
	  // 
	   p.write();
	   p.read();
	   
   }
}
