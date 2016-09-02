package bam;

public class Hej {

	public static void main(String[] args) {
		hitBjarkeInHisHead(4);
		hitBjarkeMore(22);
	}

	private static void hitBjarkeInHisHead(int i) {
		for(int j = 0; j < i; j++) {
			System.out.println("BANG!!!");
		}
	}
	
	private static void hitBjarkeMore(int i) {
		for(int j = 0; j < i; j++) {
			System.out.println("BANGBANG!");
			System.out.println("AND ANOTHER BANG!");
			System.out.println("Pull my finger");
		}
	}

}
