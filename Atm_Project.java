//Write a program to implement operations on ATM

import java.util.Scanner;
import java.util.*;
import java.lang.*;
class ATM_Project
{
		public static void clearScreen()
		{
			try
			{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
			catch(Exception e)
			{
		
			}

		}

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
//Database Creation	
			ArrayList<Integer> atm_number=new ArrayList<Integer>();
			atm_number.add(60706565);
			atm_number.add(60717171);
			atm_number.add(60727272);
			atm_number.add(60737373);
			atm_number.add(60747474);
			ArrayList<Integer> atm_pin=new ArrayList<Integer>();
			atm_pin.add(6070);
			atm_pin.add(6071);
			atm_pin.add(6072);
			atm_pin.add(6073);
			atm_pin.add(6074);
			ArrayList<Integer> account_no=new ArrayList<Integer>();
			account_no.add(29080012);
			account_no.add(29090013);
			account_no.add(29100014);
			account_no.add(29110015);
			account_no.add(29120016);			
			ArrayList<String> name=new ArrayList<String>();
			name.add("Sanjeev Kumar");
			name.add("Aman Kumar");		
			name.add("Rahul Raj");
			name.add("DeepShikha");			
			name.add("Sarvesh");
			ArrayList<Integer> Total_Amount=new ArrayList<Integer>();
			Total_Amount.add(5000);
			Total_Amount.add(5500);			
			Total_Amount.add(0);
			Total_Amount.add(25000);
			Total_Amount.add(90000);
//Enter ATM Number and PIN
		int x=1;
		menuloop:
		while(x!=10)
		   {	
			
				
			clearScreen();

			
			System.out.println("\n\nEnter 8-Digit ATM Number:");
			int Atm_Number=sc.nextInt();
			System.out.println("Enter 4-DIgit ATM PIN Number:");
			int Atm_Pin=sc.nextInt();
			
		
		if(atm_number.contains(Atm_Number) && atm_pin.contains(Atm_Pin))
		    {	
			int index1=atm_number.indexOf(Atm_Number);
			int index2=atm_pin.indexOf(Atm_Pin);
			
			
			for(int i=0;i<10;i++)
			     {	
				if(index1==index2) 			
				{			try
								{ 	System.out.println("\n\t\t One Moment please.......");
									Thread.sleep(2000);

								}
						catch(Exception e){}


//Menu Driven Program	
						clearScreen();
						System.out.println("\n\n*****Press 1 for Withdraw:");
						System.out.println("*******Press 2 for Deposit:");
						System.out.println("*********Press 3 for Mini Staement:");
						System.out.println("***********Press 4 for Reset ATM PIN:");
						System.out.println("**************Press 5 for EXIT:");
						System.out.println("\n\n Enter Your Choice:");

						
						int choice=sc.nextInt();
						
						
		//Switch Case Implementation
				switch(choice)
				{
	
			//press 1 For Withdraw
	
					case 1 :	clearScreen();
						System.out.println("\n Select Account Type:");			
						System.out.println("\n 1. Saving Account :");
						System.out.println("\n 2. Current Account :");
						System.out.println("\n \n Enter your choice:");
						
						int choice1=sc.nextInt();
						
//Saving Mode			
						if(choice1==1)
							{
								
										
										clearScreen();
										 System.out.println("You are in Saving Mode :");
										System.out.println("\n \n Enter Amount :");
										
										int amount=sc.nextInt();
										
											
										i=index1;	
														if(amount<=Total_Amount.get(i))
														{		clearScreen();
																System.out.println("\nPlease Wait your Transaction of  Rs "+ amount +" is being Processed. Please wait a moment :");
																int l=Total_Amount.get(i);	
																int t=l-amount;
																System.out.println("Remaining Balance = "+t);
																int k=Total_Amount.set(i,t);
																	
																try
																{
																	Thread.sleep(10000);

																}
																catch(Exception e){}

																System.out.println("\n \nPlease collect Your cash.\n \n Thank You for Your  Visit !");
																System.out.println("");
																break;

														}
														else

															
																System.out.println("\n \n Insufficient Balanace.");
																break;
																
										
				

							}
//current mode
						else
							{
								
												
										clearScreen();
										System.out.println("You are in Current Mode :");
										System.out.println("\n \n Enter Amount :");
										
										int amount=sc.nextInt();
										
										i=index1;	
														
														if(amount<=Total_Amount.get(i))
														{		clearScreen();
																System.out.println("\nPlease Wait your Transaction of  Rs "+ amount+ " is being Processed . Please Wait a moment.");
																int l=Total_Amount.get(i);	
																int t=l-amount;
																System.out.println("Remaining Balance = "+t);	
																int k=Total_Amount.set(i,t);
																try
																{
																	Thread.sleep(6000);

																}
																catch(Exception e){}

																System.out.println("\n \nPlease collect Your cash.\n \n Thank You for Your  Visit ! ");
																
																break;

														}
														else
														{		clearScreen();
															
																System.out.println("\n \n Insufficient Balanace.");
														}
																break;
																
										




							} 
				//press 2 for Deposit
						case 2 : 	clearScreen();
							System.out.println("Deposit Money");
							System.out.println("\n \n Enter Amount :");
							int amount1=sc.nextInt();
							System.out.println("\n Select Account Type:");			
							System.out.println("\n 1. Saving Account :");
							System.out.println("\n 2. Current Account :");
							System.out.println("\n \n Enter your choice:");
							
							int choice2=sc.nextInt();
							int index3=index1;
							if(choice2==1) // saving mode deposit 
							{
								for(int m=0;m<5;m++)
								{
							
									if(m==index3)
									{	clearScreen();
										System.out.println("\t\t\t\t \tSaving Account Deposit\n");
										int l=Total_Amount.get(m);				
										System.out.println("\nPrevious Balance	 :"+l);
										System.out.println("\nAdded Amount	 :"+amount1);
										
										int r=Total_Amount.get(m);	
										r=l+amount1;
										System.out.println("\nUpdated Balance	   :"+r);
										int k=Total_Amount.set(m,r);
										System.out.println("\nCongrats ! Your Amount has been Deposited Successfully");
																try
																{
																	Thread.sleep(5000);

																}
																catch(Exception e){}

										clearScreen();

									}
								
					
								}
							}
							else
								
							{
								for(int m=0;m<5;m++)
								{
							
									if(m==index3)
									{	clearScreen();
										System.out.println("\t\t\t\t\t Current Account Deposit\n");
										int l=Total_Amount.get(m);
										System.out.println("\nPrevious Balance	 :"+l);
										System.out.println("\nAdded Amount		 :"+amount1);
										
										int r=Total_Amount.get(m);	
										r=l+amount1;
										System.out.println("\nUpdated Balance		   :"+r);
										int k=Total_Amount.set(m,r);
										System.out.println("\nCongrats ! Your Amount has been Deposited Successfully");
																try
																{
																	Thread.sleep(5000);

																}
																catch(Exception e){}

										clearScreen();



									}
								
					
								}
							}	
			
							break;
				
				//press 3 for Mini Statement

						case 3 :	clearScreen();
							int index4=index1;
							for(int m=0;m<5;m++)
							{
							
									if(m==index4)
									{

										String n=name.get(m);
										System.out.println("				Account holder Name	:"+n);
										int a=account_no.get(m);
										System.out.println("				Account Number		:"+a);
										int l=Total_Amount.get(m);
										System.out.println("				 Total Balance 		:"+l);
										
										
										System.out.println("\n				       Money makes money");

														try
																{
																	Thread.sleep(5000);

																}
																catch(Exception e){}

										clearScreen();


									}
								
					
							}
							break;
							
								


				//Reset ATM PIN
						case 4 :	clearScreen();
							
							int index5=index1;

							
							System.out.println("Enter Old Pin :");
							
							int oldpin=sc.nextInt();
							
							if(atm_pin.contains(oldpin))
							{
								
								System.out.println("Enter New Pin :");
								int newpin=sc.nextInt();
								System.out.println("ReEnter New Pin :");
								int newpin1=sc.nextInt();
								
										
									for(int m=0;m<5;m++)
									{
							
										if(m==index5)
										{	clearScreen();
											int l=atm_pin.set(m,newpin1);
											System.out.println("Previous PIN	:"+l);
											System.out.println("New PIN	:"+newpin1);
										
											int r=atm_pin.get(m);	
											
											System.out.println("Updated PIN	:"+r);
											System.out.println("Congrats! Your PIN has been changed successfully. ");
											System.out.println("Please keep your PIN secret ...");
															try
																{
																	Thread.sleep(5000);

																}
																catch(Exception e){}

										clearScreen();	


										}
								
					
									}
								
								
							}
							else { 
									System.out.println("Invalid PIN !");
									

													try
																{
																	Thread.sleep(3000);

																}
																catch(Exception e){}

										clearScreen();


	
							       }
								break;			

							
										
				//Exit
						case 5:

							break menuloop;



					default :
						System.out.println("\n\n $$$$$$$$$         Invalid Choice!         $$$$$$$$$$$$$$$$");
									
										
							
							
						


						}//switch closed	
							



					  



					}//if closed of checching index 
					

			}//for loop closed for traversing the whole switch program


		}//if closed check atm number and pin
		else 
			{
			System.out.println("\t Incorrect PIN/ ATM Number !");
			System.out.println("\t\t\t Please Try Again......");
						try
							{
								Thread.sleep(3000);

							}
						catch(Exception e){}
			
			
			}


	      }//while closed

	}//public main closed

} //class closed









