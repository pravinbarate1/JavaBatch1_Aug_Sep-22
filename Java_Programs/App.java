class App{
	static int a = 10;    // Here a represents a data member.

	public static void main(String [] args){   // method
		System.out.println("Hello World...");

		System.out.println("a :: "+a);

		new App().main();
	}

	public void main(){
		System.out.println("This is another main");
	}
}