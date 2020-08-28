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
		int balance = ( int ) ( ( paid - due ) * 100 );
		String changeGiven = String.format("Amount: %.2f, Tendered: %.2f, Result: ", due, paid);
//		System.out.println(changeGiven); //Used this to test String.format(), no longer needed
		
		//Twenties
		if ( balance >= 2000 ) {
			changeGiven += String.format("%d twenty-dollar bill", balance / 2000);
		
			if ( balance / 2000 > 1 ) {
				changeGiven += "s";
			}
			
			balance %= 2000;
			if ( balance > 0 ) {
				changeGiven += ", ";
			}

		}
		
		//Tens
		if ( balance >= 1000 ) {
			changeGiven += String.format("%d ten-dollar bill", balance / 1000);
			
			if ( balance / 1000 > 1 ) {
				changeGiven += "s";
			}
			
			balance %= 1000;
			if ( balance > 0 ) {
				changeGiven += ", ";
			}
			
		}
		
		//Fives
		if ( balance >= 500 ) {
			changeGiven += String.format("%d five-dollar bill", balance / 500);
			
			if ( balance / 500 > 1 ) {
				changeGiven += "s";
			}
			
			balance %= 500;
			if ( balance > 0 ) {
				changeGiven += ", ";
			}
			
		}
		
		//Ones
		if ( balance >= 100 ) {
			changeGiven += String.format("%d one-dollar bill", balance / 100);
			
			if ( balance / 100 > 1 ) {
				changeGiven += "s";
			}
			
			balance %= 100;
			if ( balance > 0 ) {
				changeGiven += ", ";
			}
			
		}
		
		//Quarters
		if ( balance >= 25 ) {
			changeGiven += String.format("%d quarter", balance / 25);
			
			if ( balance / 25 > 1 ) {
				changeGiven += "s";
			}
			
			balance %= 25;
			if ( balance > 0 ) {
				changeGiven += ", ";
			}
			
		}
		
		//Dimes
		if ( balance >= 10 ) {
			changeGiven += String.format("%d dime", balance / 10);
			
			if ( balance / 10 > 1 ) {
				changeGiven += "s";
			}
			
			balance %= 10;
			if ( balance > 0 ) {
				changeGiven += ", ";
			}
			
		}
		
		//Nickels
		if ( balance >= 5 ) {
			changeGiven += String.format("%d nickel", balance / 5 );
			
			if ( balance / 5 > 1 ) {
				changeGiven += "s";
			}
			
			balance %= 5;
			
			if ( balance > 0 ) {
				changeGiven += ", ";
			}
			
		}
		
		//Pennies
		if ( balance >= 1 ) {
			changeGiven += String.format("%d penn", balance );
			
			if ( balance > 1 ) {
				changeGiven += "ies";
			} else {
				changeGiven += "y"; //only pennies change their spelling when pluralized
			}
			
			/* Commented out as there are no smaller subunits to check for
			 * and so no comma to possibly add
			 * 
			 * balance %= 100; if ( balance > 0 ) {
			 * changeGiven += ", "; }
			 */
			
		}
		
		System.out.println(changeGiven);
		return;
	}

}