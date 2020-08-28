package makechange;

public class MakeChange {

	public static void main(String[] args) {
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		float price;
		float tender;
		boolean paidEnough = true;
		
		//User Story #1:	The user is prompted asking for the price of the item.
		System.out.print("Please enter the price of them item: ");
		price = kb.nextFloat();
		
		//User Story #2:	The user is then prompted asking how much money was tendered by the customer.
		System.out.print("How much money did the customer tender? $");
		tender = kb.nextFloat();
		
		//User Story #3:	Display an appropriate message if the customer provided too little money or the exact amount.
		if ( tender < price ) {
			System.err.println("Not enough money tendered. Cannot proceed with transaction");
		} else if ( tender == price ) {
			System.out.println("Exact change provided!");
		} else {
			calculateChange(price, tender);
		}
		
		//User Story #4:	If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
	
		kb.close();
	}
	
	public static void calculateChange ( float due, float paid ) {
	
		
		return;
	}

}