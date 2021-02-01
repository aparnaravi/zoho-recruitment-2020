import java.io.*;

public class ZohoQuestion {
	static int count=1;
	static int num;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 num = Integer.parseInt(br.readLine());
		 int space=num-1;
		 int bs=num-space-1;
		for(int i=1;i<=num;i++) {
		
			for(int j=0;j<space;j++)
				System.out.print(" ");
			if(i%2==0) {
				even();
			}
			else {
				odd();
			}
			for(int j=0;j<bs;j++)
				System.out.print(" ");
			System.out.println();
			space=space-1;
			bs=bs+1;
		}
		
		
	}
	public static void odd() {
		for(int i=0;i<num;i++) {
			System.out.print(count++);
		}
	}
	public static void even() {
		int k=count+num-1;
		for(int i=0;i<num;i++) {
			System.out.print(k--);
		}
		count=count+num;
	}
}
