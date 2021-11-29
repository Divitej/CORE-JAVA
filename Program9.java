import java.util.*;
public class Program9
{
    public static void main(String[] args)
    {
		List<String>  myAlist = new ArrayList<String>();
		myAlist.add("Apple");
        myAlist.add("Orange");
        myAlist.add("Banana");
        System.out.println("Original ArrayList : " + myAlist);
        myAlist.remove("Orange");
        System.out.println("Modified ArrayList : " + myAlist);
     }
}