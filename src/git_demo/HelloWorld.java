package git_demo;

public class HelloWorld {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 11; j++) {
				if (j>i) {
					continue;
				}
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
