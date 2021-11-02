package Stack;
class CustomStack1{
    int []data;
    int tos;
    public CustomStack1(int size){
        data = new int[size];
        tos = -1;
    }
    public void push(int num) {
        if(tos == data.length - 1){
            int []ndata = new int[2*data.length];
            for (int i = 0; i < data.length; i++) {
                ndata[i] = data[i];
            }
            data = ndata;
            tos++;
            data[tos] = num;
        }
        else{
            tos++;
            data[tos] = num;
        }
    }
    public int pop(){
        if(tos == -1){
            System.out.println("Stack UnderFlow");
            return -1;
        }else{
            return data[tos--];
        }
    }
    public int size(){
        return (tos+1);
    }
    public void display(){
        for (int i = tos; i >=0; i--) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public int peek(){
        return data[tos];
    }
}
public class dynamicStack {
    public static void main(String[] args) {
        CustomStack1 st1 = new CustomStack1(10);
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.display();
        System.out.println(st1.size());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());
    }
}
