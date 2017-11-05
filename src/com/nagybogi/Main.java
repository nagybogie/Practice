package com.nagybogi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 4;
        int m = 2*n + 2;

        //String[][] arr = new String[m][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if((i == 0) || (i == m-1)) {
                    //arr[i][j] = "*";
                    System.out.print("*");
                } else if((j == 0) || (j == m-1)) {
                    //arr[i][j] = "*";
                    System.out.print("*");
                } else if((i == j) && (i != 0) && (i != m)) {
                    //arr[i][j] = "\\";
                    System.out.print("\\");
                } else if((i == m-1-j) && (j != 0) && (j != m)) {
                    //arr[i][j] = "/";
                    System.out.print("/");
                } else {
                    //arr[i][j] = "*";
                    System.out.print("*");
                }
                if(j == m-1) {
                    System.out.println();
                }
            }
        }

    }
}
