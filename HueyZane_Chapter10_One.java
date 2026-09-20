//Chapter 10, Assignment One
//Person - Creates objects that store names, addresses, and telephone numbers
//Customer - Creates objects that store customer numbers and whether or not they want on a mailing list

//Declaration of public class
public class HueyZane_Chapter10_One
{
	
	//Main function
	public static void main(String[] args)
	{	
		//Declaration of Customer object named julie
		Customer julie = new Customer("Julie James", "123 Main Street", 
		"555-1212", "147-A049", true);
		
		//Print statements telling the user what the customer's name, address, phone number, and customer number are
		//as well as if they do or don't want on the mailing list
		System.out.println("Name: " + julie.getName());
		System.out.println("Address: " + julie.getAddress());
		System.out.println("Telephone: " + julie.getTelephoneNumber());
		System.out.println("Customer Number: " + julie.getCustomerNumber());
		//If statement to determine if the customer wants on the mailing list
		if(julie.getWantOnMailingList() == true) {
			//Print statement telling the user that the customer wants on the mailing list
			System.out.println("Mailing List: YES");
		}
		else if(julie.getWantOnMailingList() == false) {
			//Print statement telling the user that the customer does not want on the mailing list
			System.out.println("Mailing List: NO");
		}
	}
}