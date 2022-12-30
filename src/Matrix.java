public class Matrix {
    public static void main(String[] args) {
        othermethod();
        System.out.println("-----------------------------------------------");
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <= 2; j++) {
//                System.out.print(j + " ");
                if (j > i) {
                    System.out.print("1" + " ");
                }
                if (j < i) {
                    System.out.print("-1" + " ");
                }
                if (j == i) {
                    System.out.print("0" + " ");
                }

            }
            System.out.println();
        }

    }
    public static void othermethod(){
        int n = 3;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) { //assign values to the arr
            for (int j = 0; j < arr.length; j++) {
                if (i == j) { //if row=column=> fill the matrix with 0
                    arr[i][j] = 0;
                } else if (i > j) { //if row>columns=> fill matrix with -1
                    arr[i][j] = -1;
                } else { //if row<columns=> fill matrix with 1
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) { //print the array
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

