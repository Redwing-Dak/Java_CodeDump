//Exercise 10

//Declaration of public class
public class HueyZane_Lab10_10
{
	
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Ship object named lolipop
		Ship lolipop = new Ship("Lolipop", "1960");
		//Declaration of CruiseShip object named disneyMagic
		CruiseShip disneyMagic = new CruiseShip("Disney Magic", "1998", 2400);
		//Declaration of CargoShip object named blackPearl
		CargoShip blackPearl = new CargoShip("Black Pearl", "1800", 50000);
	
		//Declaration of a Ship array
		//Passes in lolipop, disneyMagic, and blackPearl
		Ship[] ships = {lolipop, disneyMagic, blackPearl};
		
		//Calls the ToString method of each object
		ships[0].ToString();
		System.out.println("");
		ships[1].ToString();
		System.out.println("");
		ships[2].ToString();
	}
}