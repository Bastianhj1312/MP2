package MP2.controller;
import MP2.model.*;

/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendController {
    private FriendContainer friendContainer;
    //private Friend friend;

    public FriendController() {
        friendContainer = FriendContainer.getInstance();
    }

    public Friend findFriend(int phone){
        return friendContainer.findPhone(phone);
    }

}
