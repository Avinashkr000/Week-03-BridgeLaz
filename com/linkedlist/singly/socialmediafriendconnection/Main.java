package com.linkedlist.singly.socialmediafriendconnection;

public class Main {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        // Add users
        socialMedia.addUser(1, "Uday", 25);
        socialMedia.addUser(2, "saurabh", 30);
        socialMedia.addUser(3, "Nishant", 22);
        socialMedia.addUser(4, "Pankaj", 28);

        // Add friend connections
        socialMedia.addFriend(1, 2);
        socialMedia.addFriend(1, 3);
        socialMedia.addFriend(2, 4);
        socialMedia.addFriend(3, 4);

        // Display friends of a user
        socialMedia.displayFriends(1);

        // Find mutual friends
        socialMedia.findMutualFriends(1, 4);

        // Remove a friend connection
        socialMedia.removeFriend(1, 3);

        // Search for a user by Name or User ID
        socialMedia.searchUser("saurabh");
        socialMedia.searchUser("2");

        // Count the number of friends for each user
        socialMedia.countFriends();
    }
}