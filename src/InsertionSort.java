public class InsertionSort {
    private int[] array;
    public InsertionSort(){
        makeArray();
        printArray();
        insertionSortArray();
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
    public void insertionSortArray(){
        for(int i = 1; i<array.length; i++){
            if(array[i]<array[i-1]){
                int temp;
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;


            }
          printArray();






        }




    }    public static void main(String[] args) {
        InsertionSort myInsertionSort = new InsertionSort();
    }

}
