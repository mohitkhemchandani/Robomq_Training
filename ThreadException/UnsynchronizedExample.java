package ThreadException;

public class UnsynchronizedExample {
	public static void main(String[] args)
	{
		new PrintStringsThread("Hello", " there");
		new PrintStringsThread("How", " are you?");
		new PrintStringsThread("Thankyou", " very much");
	}
}
