
public class DealCardsTH
	{
		public static void preflop()
			{
				for(int i = 0; i < 2; i++)
					{
				Run.player1.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
				Run.player2.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
					}
			}
		
		public static void flop()
			{
				for(int i = 0; i < 3; i++)
					{
				Run.player1.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
				Run.player2.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
					}
			}
		
		public static void turn()
			{
				
				Run.player1.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
				Run.player2.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
					
			}
		
		public static void river()
			{
				
				Run.player1.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
				Run.player2.getHand().add(Deck.deck.get(0));
				Deck.deck.remove(0);
					
			}
	}
