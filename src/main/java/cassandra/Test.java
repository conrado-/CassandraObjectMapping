package cassandra;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		System.out.print("Enter some text: ");
		String n = getLine();
		int n1 = Integer.parseInt(n);
		String klm = getLine();
		int klm1 = Integer.parseInt(klm);
		String text = getLine();
		System.out.println(n);
		System.out.println(klm);
		System.out.println(text);

	}

	private static String getLine() {
		StringBuilder line = new StringBuilder();
		int ch;
		try {
			while ((ch = System.in.read()) != '\n')
				line.append((char) ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line.toString();
	}
}
