import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int mh[]=new int[n];
		int mr[]=new int[n];
		for(int i=0;i<n;i++)
		mh[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		mr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		mr[i]=mr[i]-mh[i];
		Arrays.sort(mr);
		int sum=0;
		for(int i=0;i<n;i++)
		sum+=mr[i];
		System.out.println(sum);
	}
}
