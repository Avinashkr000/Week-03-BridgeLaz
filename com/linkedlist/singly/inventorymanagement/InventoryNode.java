package com.linkedlist.singly.inventorymanagement;

import com.linkedlist.singly.studentrecordmanagement.StudentNode;

public class InventoryNode {
    private String itemName;
    private int itemId;
    private int quantity;
    private double price;
    InventoryNode next;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InventoryNode getNext() {
        return next;
    }

    public void setNext(InventoryNode next) {
        this.next = next;
    }


    public InventoryNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    public void display(){
        System.out.println("Item name: " + itemName + "\nquantity: " + quantity + "\nitem id: " + itemId + "\nprice: " + price);
    }
}
