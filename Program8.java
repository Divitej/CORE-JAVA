import java.util.*;
public class Program8 {
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < n; i++) {
            if (arr[arr[i]] != i)//3,4,2,0,1
                return false;
        }
        return true;
    }
    static int n;
	public static void main(String[] args)
    {  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] arr = new int[5];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			arr[i]=sc.nextInt();  
		}  
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}