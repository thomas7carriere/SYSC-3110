import java.util.ArrayList;

public class AddressBook {
	private ArrayList<Buddyinfo> buddies;
	
	public AddressBook()
	{
		buddies = new ArrayList<Buddyinfo>();
	}
	
	public ArrayList<Buddyinfo> getBuddies() {
		return buddies;
	}
	
	public void setBuddies(ArrayList<Buddyinfo> buddies) {
		this.buddies = buddies;
	}
	
	public void addBuddy(Buddyinfo bud)
	{
		if (bud !=null)
		{
		buddies.add(bud);
		}
		return;
	}
	
	public Buddyinfo removeBuddy(int index)
	{
		if( index < this.buddies.size() && index >= 0)
		{
			return this.buddies.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args) {
		AddressBook buds = new AddressBook();
		Buddyinfo bud = new Buddyinfo("1200 Wood Av", "613400","Jimbo");
		buds.addBuddy(bud);
		buds.removeBuddy(0);
		
		
	}
}
