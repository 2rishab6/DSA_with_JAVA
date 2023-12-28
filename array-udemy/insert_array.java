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

    public static void main(String[] args){
        insert_array arr = new insert_array(5);
        arr.insert(0, 10);
        arr.insert(1, 20);
        arr.insert(2, 30);
        arr.insert(12, 120);
        arr.insert(1, 50);
    }
}