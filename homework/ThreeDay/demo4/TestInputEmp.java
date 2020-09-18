package demo4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;

public class TestInputEmp {
	public static void main(String[] args) throws IOException {
		File file;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		System.out.print("请输入员工人数：");
		int num = s.nextInt();
		Writer writer=null;
		for(int i=0;i<num;i++) {
			String str = bf.readLine();
			String fname = str.split(",")[0];
			file = new File("./" + fname + ".obj");
			file.createNewFile();
			writer= new FileWriter(file);
			writer.write(str);
		}
		
		writer.close();
	}
}

