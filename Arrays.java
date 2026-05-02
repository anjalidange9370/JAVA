//collection of simillar datatype
//arr is used to store data of simillar type of multiple data in a single var
//array follows indexing
//datatype name[]=new datatype[size];==>syntax<==
//int arr[]=new int [size];
//int arr2[]={6,8,9,6,5,0};
//System.out.println();
//for(int i=0;i<arr.length;i++)
import java.util.Scanner;
public class Student{
        public static void main(String[] args) {
        //Input/User Input
        Scanner sc = new Scanner(System.in);
        //Infinite loop - Run any number of times
        while(true){
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; //Array Declaration
        int max = Integer.MIN_VALUE; //Max
        int min = Integer.MAX_VALUE; //Minimum
        int sum = 0; //Sum
        int count = 0; //Counting
        int evenCount = 0; //Even/Odd
        int oddCount = 0; //Even/Odd
        System.out.println("Enter the marks of " + n + " students:");
        //Array Traversal - Storing elements
        for(int i = 0; i < n; i++){
            System.out.print("Student " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            count++;
        }
        //Sum calculation
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        //Average calculation
        int avg = sum / arr.length;  
        //Max and Minimum calculation
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
        }
        //Even and Odd counting 
        for(int k = 0; k < arr.length; k++){
            if(arr[k] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        //Output - Display Results
        System.out.println("\nNumber of students: " + count);
        System.out.println("the total is : " + sum);
        System.out.println("the average is : " + avg);
        System.out.println("the highest marks are : " + max);
        System.out.println("the lowest marks are : " + min);
        System.out.println("Even marks: " + evenCount);
        System.out.println("Odd marks: " + oddCount);
        
        //Linear Search
        System.out.print("\nEnter marks to search: ");
        int searchMark = sc.nextInt();
        int position = -1;
        
        //Searching loop
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == searchMark){
                position = i;
                break;
            }
        }
        //Conditional output for search result
        if(position != -1){
            System.out.println("Mark " + searchMark + " found at Student " + (position + 1));
        } else {
            System.out.println("Mark " + searchMark + " not found in the list");
        }
        
        //Reverse - Display marks in reverse order
        System.out.println("\nMarks in Reverse Order:");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //Bubble Sort - Sort marks in ascending order
        System.out.println("\nMarks in Sorted Order (Ascending):");
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //Continue or Exit
        System.out.print("\nDo you want to run again? (yes/no): ");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("no")){
            System.out.println("Thank you for using the program!");
            break;
        }
        System.out.println();
        }

    }
}
