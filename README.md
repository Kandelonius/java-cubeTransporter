# java-cubeTransporter
simulates a cube transporter

The assignment criteria:

1. Programming Assignment   (more challenging -  from JHU Intro to Java Class that also uses Dean and Dean )
A large percentage of worldwide freight moves on cargo ships in shipping containers. The shipping containers are of standardized dimensions, so it would be to the advantage of a company to ensure that the products they place within the shipping containers are making as much use of the container space as possible.
In this problem, you are to write a program for CubeCorp, a company which specializes in meeting the worldwide demand for cubes. Your program will calculate the number of shipping containers of a given size necessary to contain a shipment of cubes. You will input the following information:
 The size of the side of one of the cubes.
 The height, width, and length of a shipping container.
 The number of cubes to ship.
You will then output the following:
 The number of shipping containers which are necessary to ship that number of cubes.
 The number of cubes which  
are necessary to ship that number of cubes.
 The number of cubes which fit into each shipping container.
 The total number of cubes which would fit in the shipping containers.
 The total volume of wasted space in the shipping containers both for the number of cubes specified and the maximum number that would fit.
You may assume that the user will not specify a shipping container such that no cubes will fit inside of it. 
An example of a session in such a program is shown below:
Welcome to CubeCorp shipping calculator!
What is the size of one side of the cube? 3
What is the width of the container? 10
What is the length of the container? 10
What is the height of the container? 3
How many cubes are being shipped? 15
You will need 2 shipping containers.
Each container holds 9 cubes.
The containers could hold up to 18 cubes.
With 15 cubes, there are 195 cubic units of wasted space.
With 18 cubes, there are 114 cubic units of wasted space.
Hints:
Bear in mind that you cannot simply calculate the total volume of the shipping containers and divide by the total volume of a cube. The above values give us a shipping container with 10 x 10 x  3 = 300 cubic units and our cube has a volume of 3 x 3 x  3 = 27 cubic units. Thus, two shipping containers have (300 x 2)/27  = 22.2222 which is  > 22 times the volume of one such cube, but only 18 cubes could be made to fit within the containers.
 You will probably need to use Math.min (see page 157) for some comparisons.
Deliverables:
1. A listing of your code (just select and then copy it from the Eclipse workbench and paste it into Word).  Clearly print in Bold 16 point  your full name  and PROGRAM 1  at the top of that page.   Staple it as the first page to:
2. A screen shot of Eclipse showing around 15 lines of your code, and ALL of the contents of the console after a run of your program. Use the same input values shown above,
