import java.util.Scanner;
class Evm 
{
	static int bjp, aap, cong, mns,nota;
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the population of area:");
		int population= sc.nextInt();
		
		for (int i= 1; i<= population ; i++ )
		{
			System.out.println("\n ********* Welcome ********* ");
			System.out.println(" apka ek vote desh badal sakta hai \n ");
			System.out.println("1. BJP \n 2. AAP \n 3. CONG  \n 4. MNS \n 5. NOTA ");
			System.out.println("\n ********* enter your response ********* ");
			String resp= sc.next().toUpperCase();
			
			if(resp.equals("BJP")) {
				bjp++;
				System.out.println("\n you have voted for bjp ");
				System.out.println("\n ACHE DIN AYENGE \n ");
				
			}
			else if(resp.equals("CONG")) {
				cong++;
				System.out.println("\n you have voted for cong ");
				System.out.println("\n Allo wali machine \n ");
				
			}
			else if(resp.equals("AAP")) {
				aap++;
				System.out.println("\n you have voted for AAP ");
				System.out.println("\n DAWA DARU KA INTEZAM \n ");
				
			}
			else if(resp.equals("MNS")) {
				mns++;
				System.out.println("\n you have voted for MNS ");
				System.out.println("\n JAI MAHARASHTRA \n ");
				
			}
			else if(resp.equals("NOTA")) {
				nota++;
				System.out.println("\n you have voted for NOTA ");
				System.out.println("\n CONGRATS \n ");
				
			}
			else {
				System.out.println("INVALID RESPONSE");
				i-- ;
			}
		}
		System.out.println("\n BJP \n " +bjp);
		System.out.println("\n CONG \n " + cong);
		System.out.println("\n MNS \n " + mns);
		System.out.println("\n AAP \n " + aap);
		System.out.println("\n NOTA \n " + nota);
		
		if (bjp>=cong && bjp>=mns && bjp>=aap && bjp>=nota)
		{
			System.out.println("bjp wins by :" +bjp + "votes" );
		} else	if (cong>=bjp && cong>=mns && cong>=aap && cong>=nota)
		{
			System.out.println("congress wins by :" + cong + "votes" );
		} else if (mns >= bjp && mns>= cong && mns >= aap && mns >=nota)
		{
			System.out.println("mns wins by :" + mns + " votes");
		}
		else if (aap>= bjp && aap >=cong && aap >= mns && aap >=nota)
		{
			System.out.println("aap wins by :" + aap + "votes");
		}
		else {
			System.out.println("nobody won because nota got :" + nota + "votes");
		}
	}
}
