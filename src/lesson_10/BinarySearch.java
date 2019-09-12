package lesson_10;

//https://www.youtube.com/watch?v=074rf3JuLiE&list=PLAma_mKffTOT_qpTFv4KdD9DhOAUd5Rqy&index=10

//сложность О - сколько итераций совершится максимум
//при обычном поиске в неотсортированном массиве,сложносить О будет О(n) ,где n - количество элементов в массиве.Т.е.
//цикл может дойти до последнего элементамассива ,где и будет наш искомый элемент.
//Если 16 элементов в массиве,то будет О(16)

//В бинарном поиске сложность O(log(n)). То есть отсортированный массив каждый раз разбивается на две части.
//Например,16 элементов в массиве. O(log(16)) = 4, т.к. 2 в 4 степени = 16. (4 раза надо разбить массив в самом
// тяжёлом случае)

//бинарный поиск
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1,3,5,8,9,16,18,20},16));;
    }

    //[0,1,2,3,4,5,6]
    public static int binarySearch(int[] a,int key){
        int low = 0;
        int high = a.length - 1;

        while(low <= high){
            int middle = low + (high-low)/2;

            if(key<a[middle]){
                high = middle - 1;
            }else if (key > a[middle]){
                low = middle + 1;
            }else{
                return middle;
            }
        }

        return -1;
    }
}
