import java.io.*;
public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:\\javaDev\\news.txt");
		int i =0;
		String s ="";
		while((i=fr.read())!=-1) {
			s+= String.valueOf((char)i);
		}
		fr.close();
		System.out.println(s);
		System.out.println();

	}

}
