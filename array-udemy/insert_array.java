class insert_array{

    int arr[] = null;

    public  insert_array(int array_size)
    {
        arr = new int[array_size];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value)
    {
        try{
            if(arr[index] == Integer.MIN_VALUE){
                arr[index] = value;
                System.out.println("Successfully inserted");
            }else{
                System.out.println("space is already auocupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("not in array");
        }
    }

    public void TraveseArray (){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public void searchArray(int element)
    {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == element){
                System.out.println("element found");
                return;
            }      
        }
        System.out.println("element not found");
    }

    public static void main(String[] args){
        insert_array ia = new insert_array(5);
        ia.insert(0, 10);
        ia.insert(1, 20);
        ia.insert(2, 30);
        ia.insert(12, 120);
        ia.insert(1, 50);

        // var firstElement = ia.arr[2];
        // System.out.println(firstElement);

        // ia.TraveseArray();

        ia.searchArray(20);
    }
}