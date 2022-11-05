import java.util.Arrays;

/* p.206
 *
 */
public class 문자열배열_1 {

	public static void main(String[] args) {
		System.out.println("홍길동".length());
		String[] names = {"홍길동", "이순신","강감찬","박문수","김두한"};
		//출력
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		for(String name:names) {
			System.out.print(name + " ");

		}
		System.out.println();
		System.out.println(Arrays.toString(names));
		

	}

}
