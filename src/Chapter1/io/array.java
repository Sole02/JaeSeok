package Chapter1.io;

public class array {

    public static void main(String[] args) {
        // 명단 관리
        String name1 = "Faker";
        String name2 = "Shroud";

        String[] adventurerList = {"Faker", "Shroud"};

        // 배열 선언
//         int[] arr;

        // 배열 길이 할당
//         arr = new int[5];
        // arr = [] [] [] [] []

        // 배열 선언과 길이 동시 할당
//         int[] arr = new int[5];
         // arr = [] [] [] [] []

        // 배열 선언과 배열 요소 할당
//        int[] arr = {10, 20, 30, 40, 50};
        // arr = [10] [20] [30] [40] [50]

        // 배열의 길이
//        int arrLength = arr.length;
//        System.out.println(arrLength);

        // 문자열 배열 선언
//        String[] strArr = new String[5]; // [""] [""] [""] [""] [""]

        // 논리열 배열 선언
//        boolean[] booleanArr = new boolean[3]; // [true] [false] [true]

        // 배열의 요소에 접근: 인덱스 활용 방법
        int[] arr = {10, 20, 30, 40, 50};
        //           [0] [1] [2] [3] [4]
        System.out.println(arr[0]);

        arr[0] = 100;
        System.out.println(arr[0]);



    }
}
