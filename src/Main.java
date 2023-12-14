public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};

        System.out.println("Search 10: " + Util.binarySearch(arr, 10));
        System.out.println("Search 50: " + Util.binarySearch(arr, 50));
        System.out.println("Search 90: " + Util.binarySearch(arr, 90));
        System.out.println("Search 130: " + Util.binarySearch(arr, 130));
        System.out.println("Search 15: " + Util.binarySearch(arr, 15));
        System.out.println("Search 200: " + Util.binarySearch(arr, 200));

        System.out.println();

        System.out.println("Search 10 : " + Util.binarySearch(arr, 0, arr.length - 1, 10));
        System.out.println("Search 50 : " + Util.binarySearch(arr, 0, arr.length - 1, 50));
        System.out.println("Search 90 : " + Util.binarySearch(arr, 0, arr.length - 1, 90));
        System.out.println("Search 130: " + Util.binarySearch(arr, 0, arr.length - 1, 130));
        System.out.println("Search 15 : " + Util.binarySearch(arr, 0, arr.length - 1, 15));
        System.out.println("Search 200: " + Util.binarySearch(arr, 0, arr.length - 1, 200));
    }
}
