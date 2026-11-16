package Stacks;

public class StackOps {
    int arr[]=new int[5];
    int top=0;
    public void push(int data){
        arr[top]=data;
        top++;
    }
    public void display(){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}


