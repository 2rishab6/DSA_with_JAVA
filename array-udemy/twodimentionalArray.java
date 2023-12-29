import java.util.Arrays;
public class twodimentionalArray {

    int arr [] [] = null;

    public twodimentionalArray(int numberofrow , int numberofcol)
    {
        this.arr = new int[numberofrow][numberofcol];
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[0].length ; col++)
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

    public void deleteArray(int deleterow, int deletecol)
    {
        try{
            arr[deleterow][deletecol] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("no index here");
        }
    }

    public void traverseArray(){
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void searchArray(int element)
    {
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == element){
                    System.err.println( element + " found in " + row +" " + col + "th position");
                    return;
                }
            }
        }
        System.err.println("not found");
    }

    public void accesscell(int row , int col)
    {
        System.out.println("row is " + row + " col is " + col);
        try{
            System.out.println( "elemnt is:" + arr[row][col] );
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("no index here");
        }
    }

    public static void main(String[] args)
    {
        twodimentionalArray td = new twodimentionalArray(3,3);

        td.insert(0, 0, 10);
        td.insert(0, 1, 20);
        td.insert(12, 13, 30);
        System.out.println( Arrays.deepToString(td.arr) );

        // td.deleteArray(0, 1);
        // System.out.println( Arrays.deepToString(td.arr) );
        td.searchArray(20);
        td.accesscell(0, 1);
        td.traverseArray();

    }
    
}
