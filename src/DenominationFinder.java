import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DenominationFinder {
    
    public static void countFrequencies(List<Integer> list)
    {
        // hash set is created and elements of
        // arraylist are insertd into it
        Set<Integer> st = new HashSet<Integer>(list);
        Object[] arr =  st.toArray();
        Arrays.sort(arr, Collections.reverseOrder());
        for (Object s : arr)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n");
        // Get the size of the denominations array.
        System.out.println("Enter the size of currency denominations");
        // stores the length/size of the denomination array.
        int numberOfDenominationsLength = scanner.nextInt();
        // Get the value of each denomination in an array.
        System.out.println("Enter the currency denominations value");
        // [denominations] stores the value of each denomination.
        Integer[] denominations = new Integer[numberOfDenominationsLength];
        List<Integer> result =new ArrayList<Integer>(); 
        // iterate through the denominations.
        for(int i=0; i< numberOfDenominationsLength; i++){
            denominations[i] = scanner.nextInt();
        }
        // Get the value to find the denominatios for.
        System.out.println("Enter the amount you want to pay");
        int amountNeedsToPay = scanner.nextInt();
        // sort the largest denominations first.
        Arrays.sort(denominations, Collections.reverseOrder());
         // Traverse through all denomination 
        for (int i = 0; i < denominations.length ; i++) {
             // Find denominations 
             while (amountNeedsToPay >= denominations[i]) 
             {
                amountNeedsToPay -= denominations[i];
                result.add(denominations[i].intValue());
             }
        }
        System.out.println("Your payment approach in order to give min no of notes will be");
        // count each denomination length.
        countFrequencies(result);
        scanner.close();
    }
}
