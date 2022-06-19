class demo {
    public static void main(String[] args) {
       int [][]A  = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
       int m = A.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                // 前后替换再翻转
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
                if (A[i][m - j - 1] == 0) {
                    A[i][m - j - 1] = 1;
                } else {
                    A[i][m - j - 1] = 0;
                }
                int temp = A[i][j];
                A[i][j] = A[i][m - j - 1];
                A[i][m - j - 1] = temp;
            }
            // 奇数行数值翻转
            if (m % 2 != 0) {
                if (A[i][m / 2] == 0) {
                    A[i][m / 2] = 1;
                } else {
                    A[i][m / 2] = 0;
                }
            }
        }
        for (int[] ints : A) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
        }

    }
}

