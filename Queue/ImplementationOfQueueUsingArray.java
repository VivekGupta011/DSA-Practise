package Queue;

public class ImplementationOfQueueUsingArray {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int size){
           this.size=size;
           arr=new int[size];
           rear=-1;
        }

        // checking Empty
        public static boolean iSEmpty(){
            return rear==-1;
        }

        // Checking IsFull
        public static boolean isFull(){
            return rear==size-1;
        }

        // adding new data
        public static void data(int data){
            if(isFull()){
                System.out.println("overflow");
                return;
            }
            ++rear;
            arr[rear]=data;
        }

        // Remove element fifo
        public static int Remove(){
            if(iSEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];

            }
            rear--;
            return front;
        }

        // checking top element
        public static int peek(){
            if(iSEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue obj=new Queue(5);
        obj.data(6);
        obj.data(1);
        obj.data(2);
        obj.data(3);
        System.out.println(obj.Remove());
        System.out.println(obj.Remove());
        System.out.println("Peek is:"+obj.peek());
    }
    
}
