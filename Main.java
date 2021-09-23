class Main {
	// 1.a
	public static void main(String args[]) {
		printTheLine();
		printTheString(args[0] +"\n");
		printNameAge("Andreas", 22);
	}
	// 1.b
	static void printTheLine() {
		System.out.print(" ");
	}
	// 1.c
	static void printTheString(String word) {
		System.out.print(word);
	}
	// 1.d
	static void printNameAge(String name, int age) {
		System.out.print("My name is "+ name +", I am "+ age +" years old");
	}
}