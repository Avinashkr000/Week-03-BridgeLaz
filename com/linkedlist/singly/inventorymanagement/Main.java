package com.linkedlist.singly.inventorymanagement;

public class Main {
    public static void main(String[] args) {
        InventoryLinkedList list = new InventoryLinkedList();
        list.insertAtLast("Glob", 5, 2, 300);
        list.insertAtFirst("Glob", 4, 2, 300);
        list.insertAtFirst("Glob", 3, 2, 300);
        list.insertAtFirst("Glob", 2, 2, 300);
        list.insertAtFirst("Glob", 1, 2, 300);
        list.insertAtIndex("Glob", 6, 2, 300, 5);
        list.updateByItemId(3, 4);
        list.searchByItemId(3);
        System.out.println("-----------------------------------");
        list.displayAllNode();
        System.out.println("Total price:" + list.totalPrice());
        System.out.println(list.size);
    }
}
