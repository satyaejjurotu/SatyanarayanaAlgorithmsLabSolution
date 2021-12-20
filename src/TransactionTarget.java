import java.util.Scanner;

public class TransactionTarget {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n");
        // Get the size of the transaction array.
        System.out.println("Enter the size of transaction array");
        // stores the length/size of the transaction array.
        int numberOfTransactionsLength = scanner.nextInt();
        // Get the value of each transaction in an array.
        System.out.println("Enter the values of array");
        // [transactions] stores the value of each transaction.
        int[] transactions = new int[numberOfTransactionsLength];
        // iterate through the transactions.
        for(int i=0; i< numberOfTransactionsLength; i++){
            transactions[i] = scanner.nextInt();
        }
        // Get the no. of targets that needs to acheived.
        System.out.println("Enter the total no of targets that needs to be achieved");
        int targetCount = scanner.nextInt();
       
        for (int i = 0; i < targetCount; i++) {
            // Get the value of the target.
            System.out.println("Enter the value of target");
            int targetValue = scanner.nextInt();
            // used to find how many iterations we did to acheive the target.
            int transactionCount = 1;
            int currentTransactionCount = transactions[0];
            for (int j = 1; j < transactions.length; j++) {
                
                // If current transaction count is greater or equal
                // to the target, then break the loop.
                if(currentTransactionCount >= targetValue ){
                                    break;
                }
                currentTransactionCount += transactions[j];
                transactionCount = j+1;
            }
            // If target acheived show after how many iterations target achieved.
            if(currentTransactionCount >= targetValue){
                // acheieved
                String message = String.format("Target achieved after %d transactions", transactionCount);
                System.out.println(message);
            }else{
                // not acheived
                System.out.println("Given target is not achieved");
            }
        }
        scanner.close();
    }
}
