package MP2.model;
import java.util.ArrayList;

public class FriendContainer
{
    private ArrayList<Friend> friends;
    private static FriendContainer instance;
    private int nextNo;
    private int friendPhone;

    
    public static FriendContainer getInstance(){
        if(instance == null) {
            instance = new FriendContainer();
        }

        return instance;
    }

    private FriendContainer()
    {
        friends = new ArrayList<>();
        nextNo = 1;
    }
    
    public void addFriend(Friend friend) {
            friends.add(friend);
            nextNo++;
            
            this.friendPhone++;
            friend.setPhone(friendPhone);
            
        }
        
        
        public Friend findCustomerById(int id){
        Friend friend = null;
        boolean found = false;
        int i = 0;
        while(!found && i < friends.size()){
            Friend c = friends.get(i);
            if(c.getPhone()==phone){
                friends = c;
                found = true;
            }
            else { i++; }
        }
        return friend;
    
    }

    }
    

