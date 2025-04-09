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

    public FriendController(int phone) {
        friendContainer = friendContainer.getInstance();
    }
    
    public Friend findFriend(String name, int phone, String address, int postalcode, String city){
        Friend friend = new Friend(name, phone, address, postalcode, city);
        return Friend;
    }
    
        public Friend findCustomerById(int phone){
    
        return friendContainer.findFriendById(phone);
    }
}
