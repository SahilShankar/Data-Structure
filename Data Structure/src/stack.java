import java.util.Scanner;

class Stack {
	final int size =2;
	int top =-1;
	int stack [] = new int[size];
	
	void push(int ele) {
		if(top == (size-1))
			System.out.println("Stack Overflow");
		else
			stack[++top] = ele;
	}
	void pop() {
		if(top == -1)
			System.out.println("Stack Underflow");
		else
			top--;
	}
	void display() {
		if(top == -1)
			System.out.println("Stack Underflow!");
		for(int i=top; i>=0;i--)
			System.out.println(stack[i]);
	}
	
	public static void main(String[] args) {
		int choice = 1;
		Stack st= new Stack();
		Scanner sc = new Scanner(System.in);
		while(choice != 0) {
			System.out.println("1.Push\n2.Pop\n3.Display");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:	System.out.println("Enter element");
						int ele = sc.nextInt();
						st.push(ele);
						break;
						
				case 2: st.pop();
						break;
				
				case 3: st.display();
						break;
				
				case 4: System.exit(0);
				
			}
		}
		sc.close();
	}

}
