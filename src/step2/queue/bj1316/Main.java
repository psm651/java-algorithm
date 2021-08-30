package step2.queue.bj1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static class QueueNode {
        private int data;  //queue의 값
        private QueueNode next; //queue의 다음노드

        public QueueNode(int data) {
            this.data = data;
        }
    }

    private static QueueNode front, rear;
    private static int size;

    public static void push(int data) {
        //새로운 노드 추가, 노드의 끝을 추가된 노드에 연결, rear변경
        QueueNode q = new QueueNode(data);
        if (empty() == 1) {
            front = q;
        } else {
            rear.next = q;
        }
        rear = q;
        size++;
    }

    public static int pop() {
        if (empty() == 1) {
            return -1;
        }
        int val = front.data;
        front = front.next;
        size--;
        return val;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    public static int front() {
        if (size == 0) {
            return -1;
        }
        return front.data;
    }

    public static int back() {
        if (size == 0) {
            return -1;
        }
        return rear.data;
    }

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] line = bf.readLine().split(" ");
            switch (line[0]) {
                case "push":
                    push(Integer.parseInt(line[1]));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}

