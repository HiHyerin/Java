package com.sist.manager;
// 사용자 정의 타입(MusicVO => 활용) => 메소드
import java.io.*;
import com.sist.VO.MusicVO;
public class MusicManager {
	public static MusicVO[] music = new MusicVO[100];
	
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\genie.txt");
			String mu="";
			int i=0; // read() => 문자 1개
			while((i=fr.read())!=-1) { // -1 = 파일 끝(EOF)
				mu+=String.valueOf((char)i);
			}
			fr.close();
			String[] m=mu.split("\n");
			i=0;
			for(String s:m) {
				String[] ss=s.split("\\|");
				music[i]=new MusicVO();
				music[i].setMno(Integer.parseInt(ss[0]));
				music[i].setTitle(ss[1]);
				music[i].setSinger(ss[2]);
				// 변수에 직접 접근을 못하게 때문에 메소드를 이용해서 저장 => setXxx()
				music[i].setAlbum(ss[3]);
				music[i].setKey(ss[4]);
				i++;
			}
		}catch(Exception ex) {}
		
	}
	// 초기화 블록을 쓸거냐 생성자를 쓸거냐 => 파일읽기는 구현이므로 클래스 영역에서 할 수 없다.
	/* 
	 	변수
	   -----
	   		기본형 변수 (int, double ...)
	   		참조형 변수 (배열, 클래스)
	   	--------------------------------> 반드시 초기화를 해야 한다.
	   	
	   	
	   	* 변수의 초기화
	   		인스턴스
	   		정적변수(static)
	   		--------------
	   			명시적 초기화 => int a=10;
	   			초기화 블록 , 생성자	=> { } , static{ }
	   				ex. 파일 읽어서 초기화, 외부에 크롤링..
	   			
		* 패키지가 다른 경우 public만 연결 가능
		  ----- > 관련된 기능을 모아서 관리
		  ----- > 반드시 import를 이용해서 클래스를 읽어 온다.
		  		   (단 같은 패키지에 있는 클래스는 import를 하지 않는다.)
		 * 캡슐화는 데이터 보호 목적이므로 반드시 모든 변수를 private로 만들고 getter/setter사용
		 * 명시적 초기화가 불가능할 때 반드시 초기화 블록이나 생성자를 이용
		 * 접근 범위
		 	- 자신의 클래스에서 사용
		 	- 같은 패키지에서 사용
		 	- 전체에서 사용
	 */
	// 1. 기능 => 목록출력
	public MusicVO[] musicListData() {
		return music;
	}
	
	// 2. 동영상 실행
	public String musicDetailData(int index) {
		return music[index].getKey();
	}
	
	// 3. 노래명 검색
	// 4. 가수명 검색

}
