import java.util.*;
class QSort {
   public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       System.out.print("\nEnter the number of strings: ");
       int n = scan.nextInt();
	int num;
     	ArrayList<Integer> array=new ArrayList<>();
 
       for (int i = 0; i < n; i++) {
           System.out.print("Enter the numbers " + (i + 1) + ": ");
          num = Integer.parseInt(scan.next());
		array.add(num);
       }
     
    
}
}