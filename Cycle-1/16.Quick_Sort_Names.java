import java.util.Arrays;
import java.util.Scanner;

public class qs {
  public static void main(String[] args) {
    int n;
    Scanner inp=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    
    
    System.out.println("enter the limit:");
    n=inp.nextInt(); 
    String[] names=new String[n];
    System.out.println("enter the names:");
    for(int i=0;i<n;i++)
    {
        names[i]=s.nextLine();
    }
    quickSort(names, 0, names.length - 1);

    System.out.println("Sorted: " + Arrays.toString(names));
  }

 
  public static void quickSort(String[] array, int start, int end) {
   
    if (start < end) {
      
      int pivotIndex = start + (end - start) / 2;
      String pivot = array[pivotIndex];
      int left = start;
      int right = end;
      while (left <= right) {
    
        while (left <= right && array[left].compareTo(pivot) < 0) {
          left++;
        }

        
        while (left <= right && array[right].compareTo(pivot) > 0) {
          right--;
        }

        
        if (left <= right) {
          String temp = array[left];
          array[left] = array[right];
          array[right] = temp;
          left++;
          right--;
        }
      }

      
      quickSort(array, start, right);
      quickSort(array, left, end);
    }
  }
}
