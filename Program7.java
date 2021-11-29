import java.util.*;
public class Program7
{
    public static void main(String[] args)
	{
     String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
		System.out.print("The reversed String is : "+b	);
}
}