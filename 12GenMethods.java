class GenMethods{
    public static <T> void PrintArray(T[] arr){
        for(T element: arr){
        System.out.println("Element: "+element);
        }
         System.out.println("--------------------------------");
    }
    public static void main(String[] args){
        Integer[] arr={1,2,3,4,5};
        String[] str={"A","B","C"};
        PrintArray(arr);
        PrintArray(str);
    }
}