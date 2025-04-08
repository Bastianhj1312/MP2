package MP2.model;
import java.util.ArrayList;

public class FriendContainer
{
    private ArrayList<Friend> friends;
    private static FriendContainer instance;
    private int nextNo;

    
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
            
        }

    }
    

