	import java.util.*;
	class Bank 
	{
	static String name,address;
	static long contact;
	static long adhaar;
	static String pancard;
	static double balance;
	static int pin; 
	static ArrayList<String> transaction = new ArrayList<String>();
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	welcomeLoop:
	for (; ; )
	{
	System.out.println("\n ****WELCOME****");
	System.out.println("\n ****LAXMI CHIT FUND**** \n");
	System.out.println("\n 1.CREATE ACCOUNT \n2.LOGIN \n");
	System.out.println("Enter Your Responce:");
	int resp=sc.nextInt();
	switch (resp)
	{
	case 1:
	{
	if (name!=null)
	{
	System.out.println("ACCOUNT ALREADY EXIST");
	continue;
	}
	else 
	{
	System.out.println ("\n ACCOUNT CREATION PAGE \n ");
	System.out.print("Name :");
	name = new Scanner(System.in).nextLine();
	System.out.print("Address :");
	address= new Scanner(System.in).nextLine();
	System.out.print("Contact:");
	contact = new Scanner(System.in).nextLong();
	System.out.print("Adhaar:");
	adhaar = new Scanner(System.in).nextLong();
	System.out.print("Pancard :");
	pancard= new Scanner(System.in).next();
	System.out.print("Balance:");
	balance = new Scanner(System.in).nextDouble();
	transaction.add("Deposit (creation) : " +balance);
	System.out.print("Pin:");
	pin = new Scanner(System.in).nextInt();
	System.out.println("\n *** ACCOUNT CREATED SCUCCESFULLY ***\n");
	break; 
	}
	}
	case 2: 
	{
	if (name ==null)
	{
	System.out.println("\n CREATE YOUR ACCOUNT FIRST \n");
	continue;
	}
	System.out.println("\n LOGIN MODULE \n");
	System.out.print("Contact:");
	long userContact = new Scanner(System.in).nextLong();
	System.out.print("Pin:");
	int userPin = new Scanner(System.in).nextInt();
	if(contact==userContact && pin==userPin)
	{
	System.out.println("\n LOGIN SCUCCESFULLY ");
	features:
	for (; ; )
	{
	System.out.println("\n **** FEATURES ****\n");
	System.out.println("1.DEPOSIT \n 2.WITHDRAW \n3. CHECK BALANCE \n 4. Transaction \n5.LOGOUT");
	System.out.print("\n Eneter your option: ");
	int opt =sc.nextInt();
	switch (opt)
	{
	case 1:
	{
	System.out.println("\n DEPOSIT AMMOUNT MODULES :\n");
	System.out.println("Enter Your Desposit amount:");
	double deptAmount =new Scanner(System.in).nextDouble();
	balance+=deptAmount;
	transaction.add("Deposit  : " +deptAmount);
	System.out.println("YOUR AMMOUNT IS DEPOSIT SCUCCESFULLY \n");
	break;
	}
	case 2: 
	{
	System.out.println("\n WITHDRAW AMMOUNT MODULES :\n");
	System.out.print("Enter Your Withdraw amount:");
	double wdrwAmt =new Scanner(System.in).nextDouble();
	System.out.print("Eneter Your Pin:");
	int pin2= new Scanner(System.in).nextInt();
	if (pin2==pin)
	{
	if (wdrwAmt<= balance)
	{
	balance -= wdrwAmt;
	transaction.add("withdraw  : " +wdrwAmt);
	System.out.println("\n YOUR AMOUNT IS DEBITED SCUCCESFULLY \n");
	}
	else 
	{
	System.out.println("\n INSUFFICINT FUNDS \n");
	}
	}
	else 
	{
	System.out.println(" \n INVALID PIN \n");
	}
	break;
	}
	case 3:
	{
	System.out.println("\n CHECK BALANCE MODULES :\n");
	System.out.print("Eneter Your Pin:");
	int pin2= new Scanner(System.in).nextInt();
	if(pin==pin2)
	{
	System.out.println("Your Acoount Balance :"+ balance+"rs");
	}
	else 
	{
	System.out.println("INVALID PIN");
	}
	break;
	}
	case 4 :{
		System.out.println("\n *** transaction **** \n");
		for (String ele; ; )
		{
		}
	}
	case 5:
	{
	System.out.println("\n THANK YOU & VISIT AGAIN \n");
	continue welcomeLoop;
	}
	default :
	{
	System.out.println("\n INVALID RESPONSE \n");
	}
	}
	}
	} else 
	{
	System.out.println("\n INVALID CRED \n");
	}
	break;
	}
	default :{
	System.out.println("\n INVALID RESPONSE \n");
	}
	} 
	}
	}
	}