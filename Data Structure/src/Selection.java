import java.util.Scanner;

public class Selection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		for(int i=0;i<n;i++) {
			int min = i;
			for(int j=i;j<n;j++)
				if(a[j]<a[min])
					min = j;
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	for(int i=0;i<n;i++)
		System.out.print(a[i]+"\t");
	sc.close();
	}
}
