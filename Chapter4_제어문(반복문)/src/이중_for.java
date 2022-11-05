
public class 이중_for {

	public static void main(String[] args) {
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("\n===for문===");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i + " ");
			
		}
		System.out.println("\n\n===while문===");
		int i = 1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n\n===do~while문===");
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=10);
	}

}
