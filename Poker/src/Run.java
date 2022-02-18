import java.util.Scanner;
import java.util.ArrayList;

public class Run
	{
//		public static ArrayList <Player> player1 = new ArrayList<Player>();
//		public static ArrayList <Player> player2 = new ArrayList<Player>();
		
		public static Player player1;
		public static Player player2;
		
		//names players
		public static String player1Name;
		public static String player2Name;
		
		//creates chip amount
		public static int balanceP1 = 30000;
		public static int balanceP2 = 30000;
		
		//boolean keeping the world spinning
		public static boolean playingGame = true;
		
		//beginning blinds
		public static int bigBlind = 10;
		public static int smallBlind = 5;
		
		//public bets
		public static int player1Bet;
		public static int player2Bet;
		
		//alternate turns
		public static int turn = 1;
		
		//universal scanner
		public static Scanner tanner = new Scanner(System.in);
		
		//creates the empty pot
		public static int pot = 0;
		
		public static void main(String[] args)
			{
				names();
				begin();
				theRest();
			}
		
	public static void names()
		
		{
				System.out.println("What is player one's name?");
				
				player1Name = tanner.nextLine();
				
				System.out.println("What is player two's name?");
				
				player2Name = tanner.nextLine();
				
				player1 = new Player(new ArrayList<Card>());
				player2 = new Player(new ArrayList<Card>());
		}
		
	public static void begin()
		{
				turn += 1;
				//deck doing deck stuff
				Deck.deck.clear();
				Deck.fillDeck();
				Deck.shuffle();
				
				//deal first two cards
				for(int i = 0; i < 2; i++)
					{
						player1.getHand().add(Deck.deck.get(0));
						Deck.deck.remove(0);
						player2.getHand().add(Deck.deck.get(0));
						Deck.deck.remove(0);
					}
				
				System.out.println(player1Name + ": you have a " + player1.getHand().get(0).getName() + ".");
				System.out.println(player1Name + ": you have a " + player1.getHand().get(1).getName() + ".");
				
				System.out.println(player2Name + ": you have a " + player2.getHand().get(0).getName() + ".");
				System.out.println(player2Name + ": you have a " + player2.getHand().get(1).getName() + ".");
		}
	
	public static void beginHand()
		{
		turn += 1;
		//deck doing deck stuff
		Deck.deck.clear();
		Deck.fillDeck();
		Deck.shuffle();
		
		//deal first two cards
		for(int i = 0; i < 2; i++)
			{
				player1.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
				player2.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
			}
		
		System.out.println(player1Name + ": you have a " + player1.getHand().get(0).getName() + ".");
		System.out.println(player1Name + ": you have a " + player1.getHand().get(1).getName() + ".");
		
		System.out.println(player2Name + ": you have a " + player2.getHand().get(0).getName() + ".");
		System.out.println(player2Name + ": you have a " + player2.getHand().get(1).getName() + ".");
		}
				//sixth card
				public static void flop()
				{
					DealCardsTH.flop();
					System.out.println(player1Name + ": you have a " + player1.getHand().get(0).getName() + " a " + 
							player1.getHand().get(1).getName() + " a " + player1.getHand().get(2).getName() + " a " + 
							player1.getHand().get(3).getName() + " a " + player1.getHand().get(4).getName() + 
							player1.getHand().get(5).getName() + ".");
				
			
					System.out.println(player2Name + ": you have a " + player2.getHand().get(0).getName() + " a "  + 
							player2.getHand().get(1).getName() + " a "  + player2.getHand().get(2).getName() + " a "  + 
							player2.getHand().get(3).getName() + " a "  + player2.getHand().get(4).getName() + 
							player2.getHand().get(5).getName() + ".");
				}
				
				//fifth card
				public static void turn()
				{
					DealCardsTH.turn();
					System.out.println(player1Name + ": you have a " + player1.getHand().get(0).getName() + " a " + 
							player1.getHand().get(1).getName() + " a " + player1.getHand().get(2).getName() + " a " + 
							player1.getHand().get(3).getName() + " a " + player1.getHand().get(4).getName() + 
							player1.getHand().get(5).getName() + player1.getHand().get(6).getName() + ".");
				
			
					System.out.println(player2Name + ": you have a " + player2.getHand().get(0).getName() + " a "  + 
							player2.getHand().get(1).getName() + " a "  + player2.getHand().get(2).getName() + " a "  + 
							player2.getHand().get(3).getName() + " a "  + player2.getHand().get(4).getName() +
							player2.getHand().get(5).getName() + player2.getHand().get(6).getName() + ".");
				}
				
				public static void river()
					{
						DealCardsTH.river();
						System.out.println(player1Name + ": you have a " + player1.getHand().get(0).getName() + " a " + 
								player1.getHand().get(1).getName() + " a " + player1.getHand().get(2).getName() + " a " + 
								player1.getHand().get(3).getName() + " a " + player1.getHand().get(4).getName() + ".");
					
				
						System.out.println(player2Name + ": you have a " + player2.getHand().get(0).getName() + " a "  + 
								player2.getHand().get(1).getName() + " a "  + player2.getHand().get(2).getName() + " a "  + 
								player2.getHand().get(3).getName() + " a "  + player2.getHand().get(4).getName() + ".");
					}
				
	public static void theRest()
		{
				while (playingGame)
					{
						//player 1 goes first
						if(turn % 2 == 0)
							{
								//blinds
								System.out.println();
								System.out.println(player1Name + " bet the big blind which is " + bigBlind);
								balanceP1 -= bigBlind;
								pot += bigBlind;
								
								System.out.println();
								System.out.println(player2Name + " bet the small blind which is " + smallBlind);
								balanceP2 -= smallBlind;
								pot += smallBlind;
								
								//ask to fold
								System.out.println();
								System.out.println(player1Name + ": would you like to fold? /n1) Yes /n2) No");
								int foldChoiceP1 = tanner.nextInt();
								if(foldChoiceP1 == 1)
									{
										System.out.println(player1Name + " folded.");
										balanceP2 += pot;
										begin();
									}
								else
									{
										System.out.println(player2Name + ": would you like to fold? /n1) Yes /n2) No");
										int foldChoiceP2 = tanner.nextInt();
										if(foldChoiceP2 == 1)
											{
												System.out.println(player2Name + " folded.");
												balanceP1 += pot;
												begin();
											}
										else
											{
												flop();
											}
									}
								
								//player 1 choice
								System.out.println();
								System.out.println(player1Name + ": would you like to fold, bet, or check? \n1) Fold \n2) Bet \n3) Check");
								int choiceP1 = tanner.nextInt();
								
								//fold
								if(choiceP1 == 1)
									{
										System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
										balanceP2 += pot;
										begin();
									}
								
								//bet
								else if(choiceP1 == 2)
									{ 
										System.out.println();
										System.out.println("How much would you like to bet?");
										int betP1 = tanner.nextInt();
										betP1 = player1Bet;
										System.out.println("You bet " + betP1 + " chips.");
										balanceP1 -= betP1;
										pot += betP1;
										
										//ask player 2
										System.out.println();
										System.out.println(player2Name + ": would you like to fold, bet, or check? \n1) Fold \n2) Bet \n3) Call");
										int choiceP2 = tanner.nextInt();
										
										//fold
										if(choiceP2 == 1)
											{
												System.out.println(player2Name + " folded.");
												balanceP1 += pot;
												begin();
											}
										
										//bet
										else if(choiceP2 == 2)
											{
												System.out.println("How much would you like to bet?");
												int betP2 = tanner.nextInt();
												
												if(betP2 > player1Bet)
													{
														System.out.println(player2Name + " bet " + betP2 + " chips.");
														balanceP2 -= betP2;
														pot += betP2;
													}
												
												else
													{
														System.out.println("Your bet must be higher than " + player1Name + "'s bet of " + player1Bet + ".");
														System.out.println("How much would you like to bet?");
														int betP2Retry = tanner.nextInt();
														System.out.println(player2Name + " bet " + betP2Retry + " chips.");
														balanceP2 -= betP2Retry;
														pot += betP2Retry;
													}
											
												
										
											}
										
										//call 
										else
											{
												System.out.println(player2Name + " called for " + player1Bet + " chips.");
												balanceP2 -= player1Bet;
												pot += player1Bet;
												System.out.println(player2Name + " bet " + player1Bet + " chips.");
											}
									}
								
								//player 1 check
								else
									{
										System.out.println(player1Name + " checked.");
										System.out.println();
										System.out.println(player2Name + ": would you like to fold, bet, or check? /n1) Fold /n2) Bet /n3) Check");
										int choiceP2 = tanner.nextInt();
										if(choiceP2 == 1)
											{
												System.out.println(player2Name + " folded.");
												balanceP1 += pot;
												begin();
											}
										else if(choiceP2 == 2)
											{
												System.out.println("How much would you like to bet?");
												int betP2 = tanner.nextInt();
												System.out.println("You bet " + betP2 + " chips.");
												balanceP2 -= betP2;
												
												//player 1 choice after player 2 bets
												System.out.println(player1Name + ": would you like to fold, bet, or check? \n1) Fold \n2) Bet \n3) Check");
												int choiceP1Response = tanner.nextInt();
												
												//fold
												if(choiceP1Response == 1)
													{
														System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
														balanceP2 += pot;
														begin();
													}
												
												//bet
												else if(choiceP1 == 2)
													{ 
														System.out.println();
														System.out.println("How much would you like to bet?");
														int betP1 = tanner.nextInt();
														betP1 = player1Bet;
														System.out.println("You bet " + betP1 + " chips.");
														balanceP1 -= betP1;
														pot += betP1;
														
												
											}
										else
											{
												System.out.println(player2Name + " checked.");
											}
											}
							}
							
						//player 2 goes first
						else 
							{
								System.out.println();
								System.out.println(player1Name + " bet the small blind which is " + smallBlind);
								balanceP1 -= smallBlind;
								
								System.out.println();
								System.out.println(player2Name + " bet the big blind which is " + bigBlind);
								balanceP2 -= bigBlind;
								
								//ask to fold
								System.out.println();
								System.out.println("Would " + player2Name + " like to fold? /n1) Yes /n2) No");
								int foldChoice = tanner.nextInt();
								if(foldChoice == 1)
									{
										System.out.println(player2Name + " folded.");
										begin();
									}
								else
									{
										System.out.println("Would " + player2Name + " like to fold? /n1) Yes /n2) No");
										int foldChoice2 = tanner.nextInt();
										if(foldChoice2 == 1)
											{
												System.out.println(player2Name + " folded.");
												begin();
											}
										else
											{
												//flop
												DealCardsTH.flop();
												System.out.println(player1Name + ": you have a " + player1.getHand().get(0).getName() + 
														player1.getHand().get(1).getName() + player1.getHand().get(2).getName() + 
														player1.getHand().get(3).getName() + player1.getHand().get(4).getName() + ".");
											
										
												System.out.println(player2Name + ": you have a " + player2.getHand().get(0).getName() + 
														player2.getHand().get(1).getName() + player2.getHand().get(2).getName() + 
														player2.getHand().get(3).getName() + player2.getHand().get(4).getName() + ".");
											}
									}
							}
						
						
				
				
				bigBlind += 10;
				smallBlind += 10;
				checkForEnd();
				begin();
					}
		}	
				
	public static void checkForEnd()
		{
					if(balanceP1 <= 0)
						{
							playingGame = false;
							System.out.println("Game over: " + player2Name + " wins!");
						}
					else if(balanceP2 <= 0)
						{
							playingGame = false;
							System.out.println("Game over: " + player1Name + " wins!");
						}
		}
				
			
	}