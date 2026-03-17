import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // --------ADDITION CODE ----------- \\

    //     System.out.print("Enter rows and columns: ");
    //     int r = sc.nextInt();
    //     int c = sc.nextInt();
    //     int[][] A = new int[r][c];
    //     int[][] B = new int[r][c];
    //     int[][] C = new int[r][c];

    // System.out.println("matrix A:");
    //     for(int i=0;i<r;i++)
    //      for(int j=0;j<c;j++)
    //             A[i][j] = sc.nextInt();
    // System.out.println("matrix B:");
    //     for(int i=0;i<r;i++)
    //     for(int j=0;j<c;j++)
    //          B[i][j] = sc.nextInt();

    //     for(int i=0;i<r;i++)
    //      for(int j=0;j<c;j++)
    //         C[i][j] = A[i][j] + B[i][j];

    //     System.out.println("result:");
    //     for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++)
    //             System.out.print(C[i][j]+" ");
    //         System.out.println();
    //     }

    // ----------- SUBSTRACTION CODE ----------- \\

        // int r = sc.nextInt();
        // int c = sc.nextInt();

        // int[][] A = new int[r][c];
        // int[][] B = new int[r][c];

        // for(int i=0;i<r;i++)
        //     for(int j=0;j<c;j++)
        //         A[i][j] = sc.nextInt();

        // for(int i=0;i<r;i++)
        //     for(int j=0;j<c;j++)
        //         B[i][j] = sc.nextInt();

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++)
        //         System.out.print((A[i][j]-B[i][j])+" ");
        //     System.out.println();
        // }

        // ------ SCALER MULTIPLICATION-----------\\

    //     int r = sc.nextInt();
    //     int c = sc.nextInt();
    //     int[][] A = new int[r][c];

    //     for(int i=0;i<r;i++)
    //         for(int j =0;j<c;j++)
    //     A[i][j] = sc.nextInt();

    //     int k = sc.nextInt();
    //     for(int i =0;i<r;i++)
    //         for(int j =0;j<c;j++)
    //     System.out.println((A[i][j]*k)+" ");
    // System.out.println();

    // ---------- MATRIX MULTIPLICATION ----------\\

//     int r1 = sc.nextInt();
//     int c1 = sc.nextInt();
//     int r2 = sc.nextInt();
//     int c2 = sc.nextInt();

//     if(c1 != r2){
//     System.out.println("Multiplication not possible");
//     return;
// }


//     int[][] A = new int[r1][c1];
//     int[][] B = new int[r2][c2];
//     int[][] C = new int[r1][c2];
    
//     for(int i=0;i<r1;i++)
//         for(int j =0;j<c1;j++)
//         A[i][j] = sc.nextInt();

//     for(int i=0;i<r2;i++)
//         for(int j =0;j<c2;j++)
//         B[i][j] = sc.nextInt();

//     for(int i =0;i<r1;i++){
//         for(int j =0;j<c2;j++){
//             for(int k=0;k<c1;k++)
//                  C[i][j] += A[i][k]*B[k][j];
//         }
//     }

//     for(int i =0;i<r1;i++){
//         for(int j=0;j<c2;j++){
//     System.out.print((C[i][j])+" ");
//         }
// System.out.println();
//     }

// ------- SYmmetric Matrix --------\\
int n = sc.nextInt();
        int[][] A = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                A[i][j] = sc.nextInt();

        boolean flag = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i][j] != A[j][i]){
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}

