package shopping;
import java.util.Scanner;
public class RetailStore {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name=sc.nextLine();
			System.out.println("Hii "+name+" Choose the one which you belong to: ");
			System.out.println("1.Employee of the store\n2.Affliate of the store\n3.Customer");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
				System.out.println("Enter your bill: ");
				float bill_e=sc.nextFloat();
				double bill1_e=(bill_e*0.7);
				if(bill1_e>100)
				{
					double bill2_e=Math.floor((bill1_e/100))*5;
					System.out.println(name+" Your bill is "+(bill1_e-bill2_e));
				}
				else
				{
					System.out.println(name+" Your bill is "+bill1_e);
				}
				break;
			case 2:
				System.out.println("Enter your bill: ");
				float bill_a=sc.nextFloat();
				double bill1_a=(bill_a*0.9);
				if(bill1_a>100)
				{
					double bill2_a=Math.floor((bill1_a)/100)*5;
					System.out.println(name+" Your bill is "+(bill1_a-bill2_a));
				}
				else
				{
					System.out.println(name+" Your bill is "+bill1_a);
				}
				break;
			case 3:
				System.out.println("Are you a customer over 2 years:\n1.Yes 2.No");
				int v=sc.nextInt();
				if(v==1)
				{
					System.out.println("Enter your bill: ");
					float bill_c=sc.nextFloat();
					double bill1_c=(bill_c*0.95);
						if(bill1_c>100)
						{
							double bill2_c=Math.floor(bill1_c/100)*5;
							System.out.println(name+" Your bill is "+(bill1_c-bill2_c));
						}
						else
						{
							System.out.println(name+" Your bill is "+bill1_c);
						}
				}		
				if(v==2)
				{
					System.out.println("Enter your bill: ");
					float bill=sc.nextFloat();
					if(bill>100)
					{
						double bill1=Math.floor(bill/100)*5;
						System.out.println(name+" Your bill is "+(bill-bill1));
					}
					else
					{
						System.out.println(name+" your bill is "+bill);
					}
				}
			}
				
		}

	 }