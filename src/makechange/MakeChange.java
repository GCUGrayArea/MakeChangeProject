package makechange;

public class MakeChange {

	public static void main(String[] args) {
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		float price;
		float tender;
		
			//User Story #1:	The user is prompted asking for the price of the item.
		System.out.print("Please enter the price of them item: $");
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
			//User Story #4:	If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.			
			calculateChange(price, tender);
		}
		
		kb.close();
	}
	
	
	public static void calculateChange ( float due, float paid ) {
		
		int balance = ( int ) Math.round( ( paid - due ) * 100 );
		String changeGiven = String.format("Amount: %.2f, Tendered: %.2f, Result: ", due, paid);
		String twenties = "";
		String tens = "";
		String fives = "";
		String ones = "";
		String quarters = "";
		String dimes = "";
		String nickels = "";
		String pennies = "";
		//Initializing these as empty strings will allow them to be seamlessly
		//ignored in the final call to System.out.printf(), even though they're
		//technically being "printed".
		
		
		//Twenties
		if ( balance >= 2000 ) {
			twenties += ( balance / 2000 ) + " twenty-dollar bill";
			
			if ( balance / 2000 > 1 ) {
				twenties += "s";
			}
			
			balance %= 2000;
			if ( balance > 0 ) {
				twenties += ", ";
			}

		}
		
		//Tens
		if ( balance >= 1000 ) {
			tens += ( balance / 1000 ) + " ten-dollar bill";
			
			if ( balance / 1000 > 1 ) {
				tens += "s";
			}
			
			balance %= 1000;
			if ( balance > 0 ) {
				tens += ", ";
			}
			
		}
		
		//Fives
		if ( balance >= 500 ) {
			fives += ( balance / 500 ) + " five-dollar bill";
			
			if ( balance / 500 > 1 ) {
				fives += "s";
			}
			
			balance %= 500;
			if ( balance > 0 ) {
				fives += ", ";
			}
			
		}
		
		//Ones
		if ( balance >= 100 ) {
			ones += ( balance / 100 ) + " one-dollar bill";
			
			if ( balance / 100 > 1 ) {
				ones += "s";
			}
			
			balance %= 100;
			if ( balance > 0 ) {
				ones += ", ";
			}
			
		}
		
		//Quarters
		if ( balance >= 25 ) {
			quarters += ( balance / 25 ) + " quarter";
			
			if ( balance / 25 > 1 ) {
				quarters += "s";
			}
			
			balance %= 25;
			if ( balance > 0 ) {
				quarters += ", ";
			}
			
		}
		
		//Dimes
		if ( balance >= 10 ) {
			dimes += ( balance / 10 ) + " dime";
			
			if ( balance / 10 > 1 ) {
				dimes += "s";
			}
			
			balance %= 10;
			if ( balance > 0 ) {
				dimes += ", ";
			}
			
		}
		
		//Nickels
		if ( balance >= 5 ) {
			nickels += ( balance / 5 ) + " nickel";
			
			if ( balance / 5 > 1 ) {
				nickels += "s";
			}
			
			balance %= 5;
			
			if ( balance > 0 ) {
				nickels += ", ";
			}
			
		}
		
		//Pennies
		if ( balance >= 1 ) {
			pennies += balance + " penn";
			
			if ( balance > 1 ) {
				pennies += "ies";
			} else {
				pennies += "y"; //only pennies change their spelling when pluralized
			}
			
			/* Commented out as there are no smaller subunits to check for
			 * and so no comma to possibly add
			 * 
			 * balance %= 100; if ( balance > 0 ) {
			 * changeGiven += ", "; }
			 */	
		}
		
		System.out.printf
		("%s%s%s%s%s%s%s%s%s." ,
				changeGiven ,
				twenties ,
				tens ,
				fives ,
				ones ,
				quarters ,
				dimes ,
				nickels ,
				pennies );

		/* The line comments below represent my original solution to this.
		 * String.format() constructs strings exactly like System.out.printf()
		 * prints, but since it returns the string rather than merely printing 
		 * it we can easily concat other strings onto it, building our desired
		 * output piecemeal and storing it in a single string. It's left in
		 * because I mostly copied it for the above solution using
		 * System.out.printf(), with the local variables for specific bits of
		 * change added when I needed to store strings so they could be used in
		 * that final printf() call, and because I wanted to show off a bit.
		 * -TGM, 5:25 PM on Friday 											*/
		
//
//Twenties
//		if ( balance >= 2000 ) {
//			changeGiven += String.format("%d twenty-dollar bill", balance / 2000);
//			
//			if ( balance / 2000 > 1 ) {
//				changeGiven += "s";
//			}
//			
//			balance %= 2000;
//			if ( balance > 0 ) {
//				changeGiven += ", ";
//			}
//			
//		}
//		
//		//Tens
//		if ( balance >= 1000 ) {
//			changeGiven += String.format("%d ten-dollar bill", balance / 1000);
//			
//			if ( balance / 1000 > 1 ) {
//				changeGiven += "s";
//			}
//			
//			balance %= 1000;
//			if ( balance > 0 ) {
//				changeGiven += ", ";
//			}
//			
//		}
//		
//		//Fives
//		if ( balance >= 500 ) {
//			changeGiven += String.format("%d five-dollar bill", balance / 500);
//			
//			if ( balance / 500 > 1 ) {
//				changeGiven += "s";
//			}
//			
//			balance %= 500;
//			if ( balance > 0 ) {
//				changeGiven += ", ";
//			}
//			
//		}
//		
//		//Ones
//		if ( balance >= 100 ) {
//			changeGiven += String.format("%d one-dollar bill", balance / 100);
//			
//			if ( balance / 100 > 1 ) {
//				changeGiven += "s";
//			}
//			
//			balance %= 100;
//			if ( balance > 0 ) {
//				changeGiven += ", ";
//			}
//			
//		}
//		
//		//Quarters
//		if ( balance >= 25 ) {
//			changeGiven += String.format("%d quarter", balance / 25);
//			
//			if ( balance / 25 > 1 ) {
//				changeGiven += "s";
//			}
//			
//			balance %= 25;
//			if ( balance > 0 ) {
//				changeGiven += ", ";
//			}
//			
//		}
//		
//		//Dimes
//		if ( balance >= 10 ) {
//			changeGiven += String.format("%d dime", balance / 10);
//			
//			if ( balance / 10 > 1 ) {
//				changeGiven += "s";
//			}
//			
//			balance %= 10;
//			if ( balance > 0 ) {
//				changeGiven += ", ";
//			}
//			
//		}
//		
//		//Nickels
//		if ( balance >= 5 ) {
//			changeGiven += String.format("%d nickel", balance / 5 );
//			
//			if ( balance / 5 > 1 ) {
//				changeGiven += "s";
//			}
//			
//			balance %= 5;
//			
//			if ( balance > 0 ) {
//				changeGiven += ", ";
//			}
//			
//		}
//		
//		//Pennies
//		if ( balance >= 1 ) {
//			changeGiven += String.format("%d penn", balance );
//			
//			if ( balance > 1 ) {
//				changeGiven += "ies";
//			} else {
//				changeGiven += "y"; //only pennies change their spelling when pluralized
//			}
//			
//			/* Commented out as there are no smaller subunits to check for
//			 * and so no comma to possibly add
//			 * 
//			 * balance %= 100; if ( balance > 0 ) {
//			 * changeGiven += ", "; }
//			 */	
//		}
//		
//		changeGiven += ".";
//		
//		System.out.println(changeGiven);

		return;
	}

}