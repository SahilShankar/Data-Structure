import java.util.Scanner;

public class Queue {
	int front,rear;
	long q[] = new long[3];
	final int size =3;
	Queue() {
		front = 0;
		rear = -1;
	}
	void add(int ele) {
		if(rear == size-1) {
			System.out.println("Queue Overflow!");
			return;
		}
		q[++rear] = ele;
	}
	void delete() {
		if(front == rear+1) {
			System.out.println("Queue Underflow!");
			return;
		}
		front++;
	}
	void display() {
		if(front == rear+1) {
			System.out.println("Queue Underflow!");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(q[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int choice = 1;
		Queue st= new Queue();
		Scanner sc = new Scanner(System.in);
		while(choice != 0) {
			System.out.println("1.Add\n2.Delete\n3.Display\n4.Exit");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:	System.out.println("Enter element");
						int ele = sc.nextInt();
						st.add(ele);
						break;
						
				case 2: st.delete();
						break;
				
				case 3: st.display();
						break;
				
				case 4: System.exit(0);
				
			}
		}
		sc.close();
	}
}
