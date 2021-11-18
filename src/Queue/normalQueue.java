package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class normalQueue {
    public static class CustomQueue{
        int []data;
        int front;
        int size;
        public CustomQueue(int cap){
            data = new int[cap];
            front = 0;
            size = 0;
        }
        void add(int num){
            if(size == data.length){
                System.out.println("Queue OverFlow");
            }
            else{
                int rear = (front + size)%data.length;
                data[rear] = num;
                size++;
            }
        }
        int remove(){
            if(size == 0){
                System.out.println("Queue UnderFlow");
                return -1;
            }
            else{
                int val = data[front];
                front = (front + 1)%data.length;
                size--;
                return val;
            }
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue UnderFlow");
                return -1;
            }
            else{
                return data[front];
            }
        }
        void display(){
            for (int i = 0; i < size; i++) {
                int idx = (front+i)%data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
            CustomQueue s1 = new CustomQueue(5);
            s1.add(10);
            s1.add(20);
            s1.add(30);
            s1.add(40);
            s1.add(50);
            s1.add(60);
            s1.display();
            System.out.println(s1.remove());
            System.out.println(s1.remove());
            System.out.println(s1.remove());
            s1.display();
            s1.add(60);
            s1.add(70);
            s1.display();
        }
    }
