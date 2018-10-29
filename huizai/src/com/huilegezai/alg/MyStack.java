package com.huilegezai.alg;



class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }
}
public class MyStack {

    int miniValue;

    ListNode listNode;

    public MyStack(int value){
        miniValue = value;
        listNode = new ListNode(value);
    }

    public  void push(int value){

        if(value < miniValue){
            miniValue = value;
        }

        ListNode tempListNode = new ListNode(value);

        ListNode tenListNode = listNode;
        while (listNode.next!=null){
            listNode = listNode.next;
        }

        listNode.next = tempListNode;

        listNode = tenListNode;

    }

    public int pop(){

        ListNode ten = listNode;
        if(listNode.value == miniValue){
            miniValue = listNode.value;
            listNode = listNode.next;
            while (listNode!= null){
                if (miniValue > listNode.value){
                    miniValue = listNode.value;
                }

                listNode = listNode.next;
            }

        }

        listNode = ten.next;

        return ten.value;
    }

    public int getMiniValue(){
        return miniValue;
    }



    public static void main(String[] args){

        MyStack myStack = new MyStack(-1);

        myStack.push(1);
        myStack.push(2);
        myStack.push(15);

        System.out.println(myStack.getMiniValue());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}
