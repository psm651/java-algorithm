package step2.stack.bj18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyStack {
    private Node top;
    private int size = 0;

    public MyStack() {
        this.top = null;
    }

    public int empty() {
        if (top == null || size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(top);
        top = newNode;
        size++;
    }

    public int pop() {
        if (empty() == 1) {
            return -1;
        }else{
            int data = top.getData();
            top = top.getNextNode();
            size--;
            return data;
        }
    }

    public int size() {
        if(empty()==1) {
            return 0;
        }
        else {
            return this.size;
        }
    }

    public int top() {
        if(empty()==1) {
            return -1;
        }
        return top.getData();
    }
}

class Node{
    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        MyStack myStack = new MyStack();
        for (int i = 0; i < N; i++) {
            String[] line = bf.readLine().split(" ");
            switch (line[0]) {
                case "push":
                    myStack.push(Integer.parseInt(line[1]));
                    break;
                case "pop":
                    sb.append(myStack.pop()).append('\n');
                    break;
                case "size":
                    sb.append(myStack.size()).append('\n');
                    break;
                case "empty":
                    sb.append(myStack.empty()).append('\n');
                    break;
                case "top":
                    sb.append(myStack.top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
