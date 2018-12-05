package resource.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	
	private BufferedReader b;
	
	public Console() {
		b=new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String readLine() throws IOException {
		return b.readLine();
	}

	public void writeLine(String string) {
		System.out.println(string);
	}
	
	public int inputInt(String s) {
		int result = 0;
		    try {
		      result = Integer.parseInt(input(s).trim());
		    } catch (Exception e) {
		      result = 0;
		    }
		    return result;
		}
		
	public String input(String s) {
		String inputLine = "";
		System.out.print(s);
		try {
			inputLine = b.readLine();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return inputLine;
	}
}
