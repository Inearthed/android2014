import java.util.Scanner;
import jss2.ArrayStack;


public class SpringerProblemet 
{
	
	static ArrayStack<String> stack = new ArrayStack<String>();
	


	public static int FRI = 0, BRUKT = 1;
	
	private static int n;
	private static int L[][];
	
	private static String sti;
	
	public static int counter = 0;

	
	public static boolean finnVei(int i, int j)
	{

		
		//HVIS ALLE VEIENE ER BRUKT? RETURN TRUE
		if(++counter == (n*n))
		{			
			return true;
		}
		
		L[i][j] = BRUKT;

		/*
		 * 8 muligheter springeren kan gå
		 */
		
		// 2 opp og 1 til venstre
		if (i-2>=0 && j-1>=0 && L[i-2][j-1] == FRI)	
		{	    
		    if (finnVei(i-2,j-1))
		    {
			
			sti = ("Fra: " + i + "," + j + " til " + (i-2) + "," + (j-1));
			stack.push(sti);
		
			
			return true;
		    }
		}		
		
		// 2 opp og 1 til høyre 
		if(i-2>=0 && j+1<n && L[i-2][j+1] == FRI)	
		{	    
		    if (finnVei(i-2,j+1))
		    {

			sti = ("Fra: " + i +"," + j + " til " + (i-1) + "," + (j+1));
			stack.push(sti);			
			
			return true;
		    }
		}				

		// 2 til høyre og 1 opp
		if(i-1>=0 && j+2<n && L[i-1][j+2] == FRI)	
		{	    
		    if (finnVei(i-1,j+2))
		    {

			sti = ("Fra: " + i +"," + j + " til " + (i-1) + "," + (j+2));
			stack.push(sti);			
			
			return true;
		    }
		}					
		
		// 2 til høyre og 1 ned
		if(i+1<n && j+2<n && L[i+1][j+2] == FRI)
		{	    
		    if (finnVei(i+1,j+2))
		    {
			
			sti = ("Fra: " + i +"," + j + " til " + (i+1) + "," + (j+2));
			stack.push(sti);			
			
			return true;
		    }
		}			
		
		// 2 ned og 1 til høyre
		if(i+2<n && j+1<n && L[i+2][j+1] == FRI)
		{	    
		    if (finnVei(i+2,j+1))
		    {

			sti = ("Fra: " + i +"," + j + " til " + (i+2) + "," + (j+1));
			stack.push(sti);			
			
			return true;
		    }
		}			
		
		// 2 ned og 1 til venstre
		if(i+2<n && j-1>=0 && L[i+2][j-1] == FRI)
		{	    
		    if (finnVei(i+2,j-1))
		    {

			sti = ("Fra: " + i +"," + j + " til " + (i+2) + "," + (j-1));
			stack.push(sti);			
			
			return true;
		    }
		}		
		
		// 2 til venstre og 1 opp
		if(i-1>=0 && j-2>=0 && L[i-1][j-2] == FRI)
		{	    
		    if (finnVei(i-1,j-2))
		    {

			sti = ("Fra: " + i +"," + j + " til " + (i-1) + "," + (j-2));
			stack.push(sti);			
			
			return true;
		    }
		}			
		
		// 2 til venstre og 1 ned
		if(i+1<n && j-2>=0 && L[i+1][j-2] == FRI)
		{	    
		    if (finnVei(i+1,j-2))
		    {

			sti = ("Fra: " + i +"," + j + " til " + (i+1) + "," + (j-2));
			stack.push(sti);			
			
			return true;
		    }
		}			
		
		L[i][j] = FRI;
		counter--;
	
		
		return false;
	}
	
	
	public static void main(String[] args)
	{
		int x, y;
		
		
		//Scanner inn størrelsen på brettet
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Velg størrelse på brette n X n ruter. Skriv inn n :");
		
		n = scan.nextInt();
		
		L = new int[n][n];
		
		//Velger x og y posisjon (0,0) er øverst til venstre
		
		System.out.println("Velg x posisjon på brettet :");
		x = scan.nextInt();
		
		System.out.println("Velg y posisjon på brettet :");
		y = scan.nextInt();
			
		scan.close();		
		

		//Skriver ut elementene i stacken
		
		if (finnVei(x,y))
		{
			while(!stack.isEmpty())
				System.out.println(stack.pop());
		}
		else
		{
		    System.out.println("\nFant ingen vei!");		
		}
	}
}
