import java.util.Arrays;
import java.util.Scanner;
public class myArray{

    /*
     * firstArray: {2, 5, 8, 3, 4, 6, 10, 15, 20, 1, 11};
     * 
     * Tasks:
     * 1. Identify index given a value
     * 2. Swap two values in an array
     * 3. Sort an array in ascending and descending order
     * 4. Linear search
     * 5. Binary
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Task 1
        int [] firstArray = {2, 5, 8, 3, 4, 6, 10, 15, 20, 1, 11};
        System.out.println("Enter the number you are searching for");
        int searchedNumber = input.nextInt();

        boolean isSearchedNumberFound = false;

        if (firstArray.length != 0){
            for (int number: firstArray){
                if(number == searchedNumber){
                    isSearchedNumberFound = true;
                    break;
                }
            }

            if (isSearchedNumberFound == true){
                System.out.println("The number " + searchedNumber + " was found in the array");
            }
            else{
                System.out.println("The number " + searchedNumber + " was not found in the array");
            }
        }
        else{
            System.out.println("There's nothing in the array");
        }


        int selectedNumberToSwap = firstArray[2];
        firstArray[6] = firstArray[2];
        firstArray[2] = selectedNumberToSwap;
        System.out.println("After swapping, the array now looks like this : " + Arrays.toString(firstArray));


        //Task 3 (Sorting the array)
        Arrays.sort(firstArray);
        System.out.println("After sorting the array, it looks like this : " + Arrays.toString(firstArray));

        //Task 4 (Linear search)
        System.out.println("Enter the number you're looking for: ");
        int searchedNumberForLinearSearch = input.nextInt();
        boolean searchedNumberForLinearSearchFound = false;
        for (int index = 0; index <= firstArray.length - 1; index ++){
            if (searchedNumberForLinearSearch == firstArray[index]){
                searchedNumberForLinearSearchFound = true;
                break;
            }
        }
        if (searchedNumberForLinearSearchFound == true){
            System.out.println("The number " + searchedNumberForLinearSearch + " is in the array");
        }
        else{
            System.out.println("The number " + searchedNumberForLinearSearch + " is not in the array");
        }

        //Task 5 (Binary search)
        int leftValuePosition = 0;
        int rightValuePosition = firstArray.length - 1;
        System.out.println("Enter a number you want to search for: ");
        int searchedNumberforBinarySearch = input.nextInt();
        while (leftValuePosition < rightValuePosition){
            int midPointValuePosition = leftValuePosition +(rightValuePosition - leftValuePosition) / 2;
            if (firstArray[midPointValuePosition] == searchedNumberforBinarySearch){
                System.out.println("The index of the searched number is " + midPointValuePosition);
                break;
            }
            else if (firstArray[midPointValuePosition] < searchedNumberforBinarySearch){
                leftValuePosition = midPointValuePosition + 1;
            }
            else if (firstArray[midPointValuePosition] < searchedNumberforBinarySearch){
                rightValuePosition = midPointValuePosition - 1;
            }
        }

        input.close();
    }
}