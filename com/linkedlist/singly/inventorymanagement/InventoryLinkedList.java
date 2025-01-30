package com.linkedlist.singly.inventorymanagement;

import com.linkedlist.singly.studentrecordmanagement.StudentNode;

public class InventoryLinkedList {
    private InventoryNode head;
    int size;

    void insertAtFirst(String itemName, int itemId, int quantity, double price){
        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity, price);
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
        size++;
    }

    public void insertAtLast(String itemName, int itemId, int quantity, double price) {
        if (head == null ) {
            insertAtFirst(itemName, itemId, quantity, price);
            return;
        }

        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity, price);

        InventoryNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public void insertAtIndex(String itemName, int itemId, int quantity, double price, int index) {
        if (index == 0) {
            insertAtFirst(itemName, itemId, quantity, price);
        }
        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity, price);
        InventoryNode temp = head;
        if (size < index) {
            System.out.println("Error index out of bound");
            return;
        } else {
            for(int i = 0; i<index-1; i++) {
                temp = temp.next;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void updateByItemId(int itemId, int quantity) {
        InventoryNode temp = head;
        while(temp != null) {
            if(temp.getItemId() == itemId) {
                temp.setQuantity(quantity);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void searchByItemId(int itemId){
        InventoryNode temp = head;
        while(temp != null) {
            if(temp.getItemId() == itemId) {
                System.out.println("Item name: " + temp.getItemName() + "\nItem Id: " + temp.getItemId() + "\nQuantity: " + temp.getQuantity() + "\nItem price: " + temp.getPrice() +"\n");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public double totalPrice() {
        double totalPrice = 0;
        InventoryNode temp = head;
        while(temp!= null) {
            totalPrice += temp.getQuantity() * temp.getPrice();
            temp = temp.next;
        }
        return totalPrice;
    }

    public void displayAllNode(){
        InventoryNode temp = this.head;

        while(temp != null){
            System.out.println("Item details: ");
            System.out.println("Item name: " + temp.getItemName() + "\nItem Id: " + temp.getItemId() + "\nQuantity: " + temp.getQuantity() + "\nItem price: " + temp.getPrice() +"\n");
            temp = temp.next;
        }
    }
}
