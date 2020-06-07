/*
 * Shane Kaestner. this program will calculate how many cubes
 * can be shipped and how many containers will be needed based
 * on the dimensions given for the cubes and the containers.
 */
package cubetransporter;

import java.util.Scanner; // allows the program to interact with a user

public class CubeTransporter {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in); // needs for the scanner
		
		double  containerHeight = 0, containerLength = 0, containersUsed,
		containerWidth = 0, containerTotal, cubeAmount = 0, cubeTotal, cubeSide = 0,
		smallestSpace, smallestVertical, usedSpace, availibleSpace;
		
		System.out.println ("Enter cube side");
		cubeSide = stdln.nextInt(); // assigns a value to cube side
		while (cubeSide <= 0) {
			System.out.println ("It looks like you haven't specified" +
					"a valid number please re-enter cube side length");
			cubeSide = stdln.nextInt();
		}
		
		System.out.println ("What is the width of the shipping container?");
		containerWidth = stdln.nextDouble();
		while (containerWidth < cubeSide) {
			System.out.println ("It looks like your imput for the container " +
					"width will not allow you to ship your cargo, please" +
					"re-enter container width");
			containerWidth = stdln.nextDouble();
		}
		
		System.out.println ("What is the length of the shipping container?");
		containerLength = stdln.nextDouble();
		while (containerLength < cubeSide) {
			System.out.println ("It looks like your imput for the container " +
					"length will not allow you to ship your cargo, please" +
					"re-enter container length");
			containerLength = stdln.nextDouble();	
		}
		
		System.out.println ("What is the height of the shipping container?");
		containerHeight = stdln.nextDouble(); 
		while (containerHeight < cubeSide) {
			System.out.println ("It looks like your imput for the container " +
					"height will not allow you to ship your cargo, please" +
					"re-enter container height");
			containerHeight = stdln.nextDouble();
		}
		
		System.out.println ("How many cubes are you shipping?");
		cubeAmount = stdln.nextInt(); //tells how many cubes will be shipped
		
		cubeTotal =  Math.pow(cubeSide, 3); // a full cube with all 3 sides
		containerTotal = containerHeight*containerWidth*containerLength;
		containersUsed = Math.ceil(cubeTotal*cubeAmount/ containerTotal);
		smallestVertical = Math.min(containerLength, containerWidth);
		smallestSpace = Math.min(cubeSide, containerLength)*
			Math.min(cubeSide, containerHeight)*
			Math.min(cubeSide, containerWidth)/Math.min(smallestVertical, 
					containerHeight);
		usedSpace = (cubeTotal*smallestSpace*containersUsed);
		availibleSpace = containerTotal*containersUsed;
		
		System.out.println ("You will need " + containersUsed +" containers to ship ");
		System.out.println ("Each container can hold up to " + smallestSpace
				+ " cubes");
		System.out.println ("You can ship a maximum total of " + (smallestSpace * 
				containersUsed) + " with your current dimensions");
		System.out.println ("You have " + (availibleSpace - (cubeTotal*cubeAmount)) + " while shipping " +
				cubeAmount + "cubes");
		System.out.println ("This leaves " + (availibleSpace - usedSpace) + " units of " +
				"wasted space");
	}
}
