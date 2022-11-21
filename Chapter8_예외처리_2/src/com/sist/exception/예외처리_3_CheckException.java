package com.sist.exception;
import java.io.*;
public class 예외처리_3_CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\예외처리_1.java");
			int i=0; //한 글자씩 읽어온다(char 대신 int => 코드번호를 읽어오기 때문에)
			while((i=fr.read())!=-1) { // -1 = EOF(파일의 끝)
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}finally {
			try {
			fr.close();
			} catch(IOException ex) {
				System.out.println("파일 닫기 실패");
			}
		} */
		try(FileReader fr=new FileReader("C:\\javaDev\\예외처리_1.java")){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
