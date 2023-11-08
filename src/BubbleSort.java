public class BubbleSort {

    public int[] array;


    public BubbleSort(){
        //construct array
       makeArray();
       //print unsorted array
       printArray();
      //sort array
       sortArray();
        //print sorted array to make sure it works
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
    public void sortArray() {
        boolean hasSwapped = false;
        for (int x = 0; x < array.length; x++){
            hasSwapped = false;
            for (int i = 1; i < array.length-x; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    hasSwapped = true;

                }


            }
            if(!hasSwapped){
                break;
            }
            printArray();

        }
    }









    public static void main(String[] args) {
        BubbleSort myBubbleSort = new BubbleSort();
    }


}
