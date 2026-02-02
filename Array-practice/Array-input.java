import java.util.Scanner;

public class Array-Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size:");
	int n = sc.nextint();
	int[]arr=new int[n];
	
	for(int i=0;i<n;i++){
	arr[i]=sc.nextint();
	}
	}
	}