public class twodimentionalArray {

    int arr [] [] = null;

    public twodimentionalArray(int numberofrow , int numberofcol)
    {
        arr = new int[numberofrow][numberofcol];
        for(int row = 0 ; row < numberofrow ; row++){
            for(int col = 0 ; col < numberofcol ; col++)
            {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value)
    {
        try{
                if(arr[row][col] == Integer.MIN_VALUE){
                    arr[row][col] = value;
                    System.out.println("Successfully inserted");
                };
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("no index here");
        }
    }

    public static void main(String[] args)
    {
        twodimentionalArray td = new twodimentionalArray(3,3);

        td.insert(0, 0, 10);
        td.insert(0, 1, 20);
        td.insert(12, 13, 30);
    }
    
}
