
public class Main {
	
	/*
	 * *********************************************
	 * What is the output of this code?
	 * (Qual é a saída deste código?)
	 * *********************************************
	 * 
	 * 1 - It will run forever
	 * 2 - It will print "Hello World!" three times ==> correct
	 * 3 - It will not compile
	 * 4 - It will throw a runtime exception
	 * 
	 */
	
	static int count = 0;

	public static void main(String[] args) {
		
		if (count < 3) {
			
			count++;
			main(null);
			
		} else {
			
			return;
		}
		
		System.out.println("Hello World!");		
		
	}

}
