public class HW6RemoveDuplicates {
    public static void main(String [] args){
        //declare an int array with the original values
        int[] numArray = {4, 7, 11, 4, 9, 5, 11, 7, 3, 5};
        //declare an int variable for the current size of the array
        int arraySize = numArray.length;

        //use nested for loops to go through the array and check if elements are the same
        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < arraySize; j++){
                if(i != j){
                    //if two different elements are the same, replace the current element with the next and move all other elements up one using a for loop
                    if(numArray[i] == numArray[j]){
                        for(int k = j+1; k < arraySize; k++){
                            numArray[k-1] = numArray[k];
                        }
                        //decrease current size of array by 1
                        arraySize = arraySize - 1;
                        //decrease j by 1
                        j = j - 1;
                    }
                }
            }
        }

        //use a for loop to go through the size of the new array and print the unique elements
        for(int i = 0; i < arraySize; i++){
            System.out.print(numArray[i] + " ");
        }
    }
}
