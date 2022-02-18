
public class Card
	{
		private	String name;
		private String suit;
		private int value;
		
		public Card(String n, String s, int v)
		{
			name = n;
			suit = s;
			value = v;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}
		
	}
