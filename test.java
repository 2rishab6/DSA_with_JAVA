class test {

    int arr[] = null;

    public test(int arraySize)
    {
        arr = new int[arraySize];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value){
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

    public void traverseArray(){
        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        test ia = new test(3);

        ia.insert(0, 10);
        ia.insert(1, 20);
        ia.insert(2, 30);
        ia.insert(12, 120);
        ia.insert(1, 50);

        var firstElement = ia.arr[2];
        System.out.println(firstElement);

        ia.traverseArray();
    }
}