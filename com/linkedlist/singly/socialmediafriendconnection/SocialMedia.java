package com.linkedlist.singly.socialmediafriendconnection;
import java.util.ArrayList;
import java.util.List;

class SocialMedia {
    private User head;

    public SocialMedia() {
        head = null;
    }

    // Add a new user to the list
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
        System.out.println("User " + name + " added.");
    }

    // Add a friend connection between two users
    public void addFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(userId2)) {
                user1.friendIds.add(userId2);
                user2.friendIds.add(userId1);
                System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
            } else {
                System.out.println("Friend connection already exists.");
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Remove a friend connection between two users
    public void removeFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            if (user1.friendIds.contains(userId2)) {
                user1.friendIds.remove(Integer.valueOf(userId2));
                user2.friendIds.remove(Integer.valueOf(userId1));
                System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
            } else {
                System.out.println("No friend connection exists.");
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friendIds);
            mutualFriends.retainAll(user2.friendIds);

            if (mutualFriends.isEmpty()) {
                System.out.println("No mutual friends found.");
            } else {
                System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
                for (int friendId : mutualFriends) {
                    User friend = findUserById(friendId);
                    System.out.println(friend.name + " (ID: " + friend.userId + ")");
                }
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            for (int friendId : user.friendIds) {
                User friend = findUserById(friendId);
                System.out.println(friend.name + " (ID: " + friend.userId + ")");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    // Search for a user by Name or User ID
    public void searchUser(String nameOrId) {
        User current = head;
        boolean found = false;

        try {
            int userId = Integer.parseInt(nameOrId);
            while (current != null) {
                if (current.userId == userId) {
                    System.out.println("User found: " + current.name + " (ID: " + current.userId + ", Age: " + current.age + ")");
                    found = true;
                    break;
                }
                current = current.next;
            }
        } catch (NumberFormatException e) {
            while (current != null) {
                if (current.name.equalsIgnoreCase(nameOrId)) {
                    System.out.println("User found: " + current.name + " (ID: " + current.userId + ", Age: " + current.age + ")");
                    found = true;
                    break;
                }
                current = current.next;
            }
        }

        if (!found) {
            System.out.println("User not found.");
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        User current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friendIds.size() + " friends.");
            current = current.next;
        }
    }

    // Helper method to find a user by User ID
    private User findUserById(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
