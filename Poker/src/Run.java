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
		
		//beginning blinds
		public static int bigBlind = 0;
		public static int smallBlind = -5;
		
		//public bets
		public static int player1Bet;
		public static int player2Bet;
		
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
			System.out.println("This is texas hold-em. Each player will have 7 available cards to form their best five card hand. \nBlinds are both increased by ten each hand.");
			System.out.println();
			
				System.out.println("What is player one's name?");
				
				player1Name = tanner.nextLine();
				
				System.out.println("What is player two's name?");
				
				player2Name = tanner.nextLine();
				
				player1 = new Player(new ArrayList<Card>());
				player2 = new Player(new ArrayList<Card>());
		}
		
	public static void begin()
		{
			//blinds increase
			bigBlind += 10;
			smallBlind += 10;
			
			//check for end
			checkForEnd();
			
			System.out.println();
			System.out.println(player1Name + " has " + balanceP1 + " chips.");
			System.out.println(player2Name + " has " + balanceP2 + " chips.");
			System.out.println();
				
				//clear hands
				player1.getHand().clear();
				player2.getHand().clear();
				
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
				
				System.out.println(player1Name + ": you were dealt a " + player1.getHand().get(0).getName() + " of " + player1.getHand().get(0).getSuit() 
						+ " and a " + player1.getHand().get(1).getName() + " of " + player1.getHand().get(1).getSuit() + ".");
				
				System.out.println();
				
				System.out.println(player2Name + ": you were dealt a " + player2.getHand().get(0).getName() + " of " + player2.getHand().get(0).getSuit()
						+ " and a " + player2.getHand().get(1).getName() + " of " + player2.getHand().get(1).getSuit() + ".");
				
				theRest();
		}
	

				//3rd 4th and 5th cards
				public static void flop()
				{
					DealCardsTH.flop();
					//player 1 flop cards
					System.out.println(player1Name + ": you have 5 available cards: \n" 
					+ player1.getHand().get(0).getName() + " of " + player1.getHand().get(0).getSuit() + "\n" 
					+ player1.getHand().get(1).getName() + " of " + player1.getHand().get(1).getSuit() + "\n"
					+ player1.getHand().get(2).getName() + " of " + player1.getHand().get(2).getSuit() + "\n"
					+ player1.getHand().get(3).getName() + " of " + player1.getHand().get(3).getSuit() + "\n"
					+ player1.getHand().get(4).getName() + " of " + player1.getHand().get(4).getSuit());
					
					System.out.println();
					
					//player 2 flop cards
					System.out.println(player1Name + ": you have 5 available cards: \n" 
							+ player2.getHand().get(0).getName() + " of " + player2.getHand().get(0).getSuit() + "\n" 
							+ player2.getHand().get(1).getName() + " of " + player2.getHand().get(1).getSuit() + "\n"
							+ player2.getHand().get(2).getName() + " of " + player2.getHand().get(2).getSuit() + "\n"
							+ player2.getHand().get(3).getName() + " of " + player2.getHand().get(3).getSuit() + "\n"
							+ player2.getHand().get(4).getName() + " of " + player2.getHand().get(4).getSuit());	
				
			
					
				}
				
				//sixth card
				public static void turn()
				{
					DealCardsTH.turn();
					System.out.println();
					System.out.println(player1Name + ": you have 6 available cards: \n" 
							+ player1.getHand().get(0).getName() + " of " + player1.getHand().get(0).getSuit() + "\n" 
							+ player1.getHand().get(1).getName() + " of " + player1.getHand().get(1).getSuit() + "\n"
							+ player1.getHand().get(2).getName() + " of " + player1.getHand().get(2).getSuit() + "\n"
							+ player1.getHand().get(3).getName() + " of " + player1.getHand().get(3).getSuit() + "\n"
							+ player1.getHand().get(4).getName() + " of " + player1.getHand().get(4).getSuit() + "\n"
							+ player1.getHand().get(5).getName() + " of " + player1.getHand().get(5).getSuit());
				
					System.out.println();
					
					System.out.println(player1Name + ": you have 6 available cards: \n" 
							+ player2.getHand().get(0).getName() + " of " + player2.getHand().get(0).getSuit() + "\n" 
							+ player2.getHand().get(1).getName() + " of " + player2.getHand().get(1).getSuit() + "\n"
							+ player2.getHand().get(2).getName() + " of " + player2.getHand().get(2).getSuit() + "\n"
							+ player2.getHand().get(3).getName() + " of " + player2.getHand().get(3).getSuit() + "\n"
							+ player2.getHand().get(4).getName() + " of " + player2.getHand().get(4).getSuit() + "\n"
							+ player2.getHand().get(5).getName() + " of " + player2.getHand().get(5).getSuit());
				}
				
				//seventh card
				public static void river()
					{
						DealCardsTH.river();
						System.out.println();
						System.out.println(player1Name + ": you have 7 available cards: \n" 
								+ player1.getHand().get(0).getName() + " of " + player1.getHand().get(0).getSuit() + "\n" 
								+ player1.getHand().get(1).getName() + " of " + player1.getHand().get(1).getSuit() + "\n"
								+ player1.getHand().get(2).getName() + " of " + player1.getHand().get(2).getSuit() + "\n"
								+ player1.getHand().get(3).getName() + " of " + player1.getHand().get(3).getSuit() + "\n"
								+ player1.getHand().get(4).getName() + " of " + player1.getHand().get(4).getSuit() + "\n"
								+ player1.getHand().get(5).getName() + " of " + player1.getHand().get(5).getSuit() + "\n"
								+ player1.getHand().get(6).getName() + " of " + player1.getHand().get(6).getSuit());
					
				System.out.println();
						
						System.out.println(player1Name + ": you have 7 available cards: \n" 
								+ player2.getHand().get(0).getName() + " of " + player2.getHand().get(0).getSuit() + "\n" 
								+ player2.getHand().get(1).getName() + " of " + player2.getHand().get(1).getSuit() + "\n"
								+ player2.getHand().get(2).getName() + " of " + player2.getHand().get(2).getSuit() + "\n"
								+ player2.getHand().get(3).getName() + " of " + player2.getHand().get(3).getSuit() + "\n"
								+ player2.getHand().get(4).getName() + " of " + player2.getHand().get(4).getSuit() + "\n"
								+ player2.getHand().get(5).getName() + " of " + player2.getHand().get(5).getSuit() + "\n"
								+ player2.getHand().get(6).getName() + " of " + player2.getHand().get(6).getSuit());
					}
				
				//runs after the turn is dealt
				public static void afterTurn()
				{
					//player 1 choice
					System.out.println();
					System.out.println(player1Name + ": would you like to:\n1) Fold \n2) Bet \n3) Check");
					int choiceP1 = tanner.nextInt();
					
					//fold
					if(choiceP1 == 1)
						{
							System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
							balanceP2 += pot;
							pot = 0;
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
							System.out.println(player2Name + ": would you like to:\n1) Fold \n2) Bet \n3) Call");
							int choiceP2 = tanner.nextInt();
							
							//fold
							if(choiceP2 == 1)
								{
									System.out.println(player2Name + " folded.");
									balanceP1 += pot;
									pot = 0;
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
							
							//ask player 2
							System.out.println(player2Name + ": would you like to: \n1) Bet \n2) Check");
							int choiceP2 = tanner.nextInt();
							//fold
							
							//bet
							 if(choiceP2 == 1)
								{
									System.out.println(player2Name + ": how much would you like to bet?");
									int betP2 = tanner.nextInt();
									System.out.println("You bet " + betP2 + " chips.");
									balanceP2 -= betP2;
									
									//player 1 choice after player 2 bets
									System.out.println(player1Name + ": would you like to: \n1) Fold \n3) Call");
									int choiceP1Response = tanner.nextInt();
									
									//fold
									if(choiceP1Response == 1)
										{
											System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
											balanceP2 += pot;
											pot = 0;
											begin();
										}
									
									else
										{
											System.out.println(player1Name + " called for " + betP2 + ".");
											balanceP1 -= betP2;
											System.out.println();
											System.out.println("The dealer will now deal the River.");
											turn();
											afterRiver();
										}
								}
							else 
								{
									System.out.println(player2Name + " checked.");
									river();
									afterRiver();
								}
				}
				}
				
				//runs after the river is dealt
				public static void afterRiver()
					{
						//player 1 choice
						System.out.println();
						System.out.println(player1Name + ": would you like to:\n1) Fold \n2) Bet \n3) Check");
						int choiceP1 = tanner.nextInt();
						
						//fold
						if(choiceP1 == 1)
							{
								System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
								balanceP2 += pot;
								pot = 0;
								begin();
							}
						
						//bet
						else if(choiceP1 == 2)
							{ 
								System.out.println();
								System.out.println("How much would you like to bet?");
								int betP1River = tanner.nextInt();
								player1Bet = betP1River;
								System.out.println("You bet " + betP1River + " chips.");
								balanceP1 -= betP1River;
								pot += betP1River;
								
								//ask player 2
								System.out.println();
								System.out.println(player2Name + ": would you like to:\n1) Fold \n2) Bet \n3) Call");
								int choiceP2 = tanner.nextInt();
								
								//fold
								if(choiceP2 == 1)
									{
										System.out.println(player2Name + " folded.");
										balanceP1 += pot;
										pot = 0;
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
								System.out.println(player2Name + ": would you like to: \n1) Fold \n2) Bet \n3) Check");
								int choiceP2 = tanner.nextInt();
								if(choiceP2 == 1)
									{
										System.out.println(player2Name + " folded.");
										System.out.println(player1Name + " won the pot!");
										balanceP1 += pot;
										pot = 0;
										begin();
									}
								else if(choiceP2 == 2)
									{
										System.out.println(player2Name + ": how much would you like to bet?");
										int betP2 = tanner.nextInt();
										System.out.println("You bet " + betP2 + " chips.");
										balanceP2 -= betP2;
										
										//player 1 choice after player 2 bets
										System.out.println(player1Name + ": would you like to: \n1) Fold \n2) Bet \n3) Check");
										int choiceP1Response = tanner.nextInt();
										
										//fold
										if(choiceP1Response == 1)
											{
												System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
												balanceP2 += pot;
												pot = 0;
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
												System.out.println();
												System.out.println("The dealer will now deal the River.");
												river();
												
											}
									}
					}
						showHands();
					}
	
				//runs after first two cards are dealt and includes the flop
				public static void theRest()
		{				
								//blinds
								System.out.println();
								System.out.println(player1Name + " bet the big blind which is " + bigBlind + ".");
								balanceP1 -= bigBlind;
								pot += bigBlind;
								
								System.out.println();
								System.out.println(player2Name + " bet the small blind which is " + smallBlind + ".");
								balanceP2 -= smallBlind;
								pot += smallBlind;
								
								//ask to fold
								System.out.println();
								System.out.println(player1Name + ": would you like to fold? \n1) Yes \n2) No");
								int foldChoiceP1 = tanner.nextInt();
								if(foldChoiceP1 == 1)
									{
										System.out.println(player1Name + " folded.");
										balanceP2 += pot;
										pot = 0;
										begin();
									}
								else
									{
										System.out.println(player2Name + ": would you like to fold? \n1) Yes \n2) No");
										int foldChoiceP2 = tanner.nextInt();
										if(foldChoiceP2 == 1)
											{
												System.out.println(player2Name + " folded.");
												balanceP1 += pot;
												pot = 0;
												begin();
											}
										else
											{
												flop();
											}
									}
								
								//player 1 choice
								System.out.println();
								System.out.println(player1Name + ": would you like to:\n1) Fold \n2) Bet \n3) Check");
								int choiceP1 = tanner.nextInt();
								
								//fold
								if(choiceP1 == 1)
									{
										System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
										balanceP2 += pot;
										pot = 0;
										begin();
									}
								
								//bet
								else if(choiceP1 == 2)
									{ 
										System.out.println();
										System.out.println("How much would you like to bet?");
										int betP1 = tanner.nextInt();
										player1Bet = betP1;
										System.out.println("You bet " + betP1 + " chips.");
										balanceP1 -= betP1;
										pot += betP1;
										
										//ask player 2
										System.out.println();
										System.out.println(player2Name + ": would you like to:\n1) Fold \n2) Bet \n3) Call");
										int choiceP2 = tanner.nextInt();
										
										//fold
										if(choiceP2 == 1)
											{
												System.out.println(player2Name + " folded.");
												balanceP1 += pot;
												pot = 0;
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
														
														System.out.println();
														System.out.println(player1Name + ": would you like to:\n1) Fold \n3) Call");
														int choiceP1call = tanner.nextInt();
														
														//fold
														if(choiceP1call == 1)
															{
																System.out.println(player2Name + " folded.");
																balanceP1 += pot;
																pot = 0;
																begin();
															}
														else
															{
																System.out.println(player1Name + " called for " + betP2 + " chips.");
																balanceP1 -= betP2;
																pot += betP2;
																System.out.println(player1Name + " bet " + betP2 + " chips.");
															}
													}
												
												else
													{
														System.out.println("Your bet must be higher than " + player1Name + "'s bet of " + player1Bet + ".");
														System.out.println("How much would you like to bet?");
														int betP2Retry = tanner.nextInt();
														System.out.println(player2Name + " bet " + betP2Retry + " chips.");
														balanceP2 -= betP2Retry;
														pot += betP2Retry;
														
														System.out.println();
														System.out.println(player1Name + ": would you like to:\n1) Fold \n3) Call");
														int choiceP1call = tanner.nextInt();
														
														//fold
														if(choiceP1call == 1)
															{
																System.out.println(player2Name + " folded.");
																balanceP1 += pot;
																pot = 0;
																begin();
															}
														else
															{
																System.out.println(player1Name + " called for " + betP2 + " chips.");
																balanceP1 -= betP2;
																pot += betP2;
																System.out.println(player1Name + " bet " + betP2 + " chips.");
															}
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
										System.out.println(player2Name + ": would you like to: \n1) Fold \n2) Bet \n3) Check");
										int choiceP2 = tanner.nextInt();
										if(choiceP2 == 1)
											{
												System.out.println(player2Name + " folded.");
												System.out.println(player1Name + " won the pot!");
												balanceP1 += pot;
												pot = 0;
												begin();
											}
										else if(choiceP2 == 2)
											{
												System.out.println("How much would you like to bet?");
												int betP2 = tanner.nextInt();
												System.out.println("You bet " + betP2 + " chips.");
												balanceP2 -= betP2;
												
												//player 1 choice after player 2 bets
												System.out.println(player1Name + ": would you like to: \n1) Fold \n2) Bet \n3) Check");
												int choiceP1Response = tanner.nextInt();
												
												//fold
												if(choiceP1Response == 1)
													{
														System.out.println(player1Name + " folded. \n" + player2Name + " won the pot.");
														balanceP2 += pot;
														pot = 0;
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
											}
										else
											{
												System.out.println(player2Name + " checked.");
												System.out.println();
												System.out.println("The dealer will now deal the turn.");
												
											}
											
							
									}
							
						
				turn();
				afterTurn();
				checkForEnd();
				
					}
			
					
				//shows hands so that winner can be decided
				public static void showHands()
				{
					river();
					System.out.println();
					System.out.println("You must now compare hands and input who won.");
					System.out.println("Who won this hand? \n1) " + player1Name + "\n 2) " + player2Name);
					
					int winnerChoice = tanner.nextInt();
					
					if(winnerChoice == 1)
						{
							System.out.println(player1Name + " won this hand!");
							balanceP1 += pot;
							pot = 0;
							checkForEnd();
							begin();
						}
					else
							{
								System.out.println(player2Name + " won this hand!");
								balanceP2 += pot;
								pot = 0;
								checkForEnd();
								begin();
							}
				}
				
				//checks if whole game is over
				public static void checkForEnd()
		{
					if(balanceP1 <= 0)
						{
							System.out.println("Game over: " + player2Name + " wins!");
							System.exit(1);
						}
					else if(balanceP2 <= 0)
						{
							System.out.println("Game over: " + player1Name + " wins!");
							System.exit(1);
							
						}
					else
						{
							
						}
		}
				
			
	}