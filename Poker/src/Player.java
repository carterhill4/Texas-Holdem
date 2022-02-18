import java.util.ArrayList;

public class Player
	{ 
		//static ArrayList <Card> hand = new ArrayList<Card>(); 

//		private int balance;
//		private String name;
		//private int position;
		private ArrayList <Card> hand;
		

		public Player(ArrayList h)
		{
//			balance = b;
//			name = n;
			//position = p;
			hand = h;
			
		}

//		public int getBalance()
//			{
//				return balance;
//			}
//
//		public void setBalance(int balance)
//			{
//				this.balance = balance;
//			}
//
//		public String getName()
//			{
//				return name;
//			}
//
//		public void setName(String name)
//			{
//				this.name = name;
//			}

		public ArrayList<Card> getHand()
			{
				return hand;
			}

		public void setHand(ArrayList<Card> hand)
			{
				this.hand = hand;
			}

//		public int getPosition()
//			{
//				return position;
//			}
//
//		public void setPosition(int position)
//			{
//				this.position = position;
//			}
		
	}
