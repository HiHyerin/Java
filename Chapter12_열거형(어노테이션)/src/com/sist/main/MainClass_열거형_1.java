package com.sist.main;
import java.util.*;
// Map => 키, 값 => 주로 사용
enum 전화국번{
	서울특별시("02"), 경기도("031"), 강원도("033"),
	인천광역시("032"),충청남도("041"),대전광역시("042"),세종("044"),
	충청북도("043"), 부산("051"), 울산("052"), 대구("053"), 경상북도("054"),
	경상남도("055"), 전라남도("061"), 광주광역시("062"), 전라북도("063"),
	제주("064");
	
	private String code;
	전화국번(String code) { // public사용 x
		this.code=code;
	}
	public String getCode() {
		return code;
	}
	
}
public class MainClass_열거형_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("지역 입력:");
		String loc=scan.next();
		
		for(전화국번 n:전화국번.values()) { // values() = 지역이름
			if(n.name().contains(loc)) { // contains() : 정확한 입력 아닌 포함으로
				System.out.println(n+":"+n.getCode());
			}
		}
	}

}
