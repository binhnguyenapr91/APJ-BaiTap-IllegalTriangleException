package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
	public static void main(String[] args) {
		try {
			inputSide();
		}catch (TriangleException te) {
			te.printStackTrace();		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	private static void inputSide() throws IOException, TriangleException {
		int aSide;
		int bSide;
		int cSide;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a side:");
		aSide = Integer.parseInt(br.readLine());
		System.out.println("Enter b side:");
		bSide = Integer.parseInt(br.readLine());
		System.out.println("Enter c side:");
		cSide = Integer.parseInt(br.readLine());
		
		//throw defined exception
		if(aSide<=0||bSide<=0||cSide<=0) {
			throw new TriangleException("Side is not valid value");
		}
		
		if(aSide+bSide<=cSide||aSide+cSide<=bSide||bSide+cSide<=aSide) {
			throw new TriangleException("Not a triangle");
		}
			
		Triangle triangle = new Triangle(aSide,bSide,cSide);
		System.out.print(triangle.getA()+" "+ triangle.getB() +" "+triangle.getC());
	}
}
