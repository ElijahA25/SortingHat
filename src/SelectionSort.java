import java.lang.reflect.Array;

public class SelectionSort {
    private int array[];
    public SelectionSort(){
        makeArray();
        printArray();
        selectionSortArray();
        printArray();


    }
    public void makeArray(){
        //construct array
        array = new int[8];
        for(int i = 0; i<array.length; i++) {
            array[i] = (int)(Math.random()*9+1);


        }


    }
    public void printArray(){
        for(int i = 0; i<array.length; i++){

            System.out.print(array[i]+" ");

        }
        System.out.println();

    }
    public void selectionSortArray(){
        int temp;
        for(int x = 0; x< array.length-1; x++){
            for(int i = x+1; i< array.length; i++){
                //if the 0 is less than 1
                int min=x;
                if(array[i]<array[min]){
                    min = i;

                }

                    temp = array[min];
                    array[min] = array[x];
                    array[x] = temp;








            }



        }




    }
    public static void main(String[] args) {
        SelectionSort mySelectionSort = new SelectionSort();
    }



}
