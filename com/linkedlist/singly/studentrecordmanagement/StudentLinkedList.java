package com.linkedlist.singly.studentrecordmanagement;

public class StudentLinkedList {
    private int size = 0;
    private StudentNode head;

    public int getSize() {
        return size;
    }

    public void insertAtBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode sn = new StudentNode(rollNumber, name, age, grade);
        if (this.head == null) {
            this.head = sn;
        }
        else {
            sn.next = this.head;
            this.head = sn;
        }
        size++;
    }

    public void insertAtLast(int rollNumber, String name, int age, String grade) {
        StudentNode sn = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            insertAtBeginning(rollNumber, name, age, grade);
        }
        StudentNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = sn;
        size++;
    }

    public void insertAtIndex(int rollNumber, String name, int age, String grade, int index) {
        if (index == 0) {
            insertAtBeginning(rollNumber, name, age, grade);
        }
        StudentNode sn = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp = head;
        if (size < index) {
            System.out.println("Error index out of bound");
            return;
        } else {
            for(int i = 0; i<index-1; i++) {
                temp = temp.next;
            }
        }
        sn.next = temp.next;
        temp.next = sn;
        size++;
    }

    public void deleteByIndex(int index) {
        StudentNode temp = head;

        if (size <= index) {
            System.out.println("Error index out of bound");
        } else {
            for(int i = 0; i<index-1; i++) {
                temp = temp.next;
            }
        }
        temp.next = temp.next.next;
    }

    public void searchByIndex(int rollNumber) {
        StudentNode temp = head;
        while(temp != null) {
            if(temp.getRollNumber() == rollNumber) {
                System.out.println("Roll number: " + temp.getRollNumber() + "\nName: " + temp.getName() + "\nAge: " + temp.getAge() + "\nGrade: " + temp.getGrade() +"\n");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    public void updateByRollNumber(int rollNumber, String grade) {
        StudentNode temp = head;
        while(temp != null) {
            if(temp.getRollNumber() == rollNumber) {
                temp.setGrade(grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");

    }

    public void displayAllNode(){
        StudentNode temp = this.head;

        while(temp != null){
            System.out.println("Student details: ");
            System.out.println("Roll number: " + temp.getRollNumber() + "\nName: " + temp.getName() + "\nAge: " + temp.getAge() + "\nGrade: " + temp.getGrade() +"\n");
            temp = temp.next;
        }
    }
}
