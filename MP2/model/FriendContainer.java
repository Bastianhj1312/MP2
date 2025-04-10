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

    public boolean addFriend(Friend friend) {
        Friend conflict = findPhone(friend.getPhone());
        boolean fres = false;
        if (conflict == null) {
            friends.add(friend);
            fres = true;
        }
        return fres;

    }

    public Friend findPhone(int phone){
        for(Friend f: friends) {
            if(f.getPhone() == phone) {
                return f;
            }
        }
        return null;
    }
}

