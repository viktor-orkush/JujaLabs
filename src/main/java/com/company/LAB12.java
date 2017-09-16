package com.company;

public class LAB12 {
    public static int[] lookFor(int[] array){
        int[] arr1 = {-1, -1} ;
        int[] arr2 = {-1, -1};
        for(int i =0; i<array.length; i++){
            if(array[i]>0){
                if(arr1[0] == -1 && arr1[1] == -1){
                    arr1[0]=i;
                }
                else if (arr1[0] != -1 && arr1[1] != -1 && arr2[0]==-1){
                    arr2[0]=i;
                }
                if (i == array.length-1) {
                    if(arr1[0] !=-1 && arr1[1] == -1) {
                        arr1[1]=i;
                    }
                    else if ((arr1[0] !=-1 && arr1[1] != -1 && arr2[0] != -1)){
                        arr2[1]=i;
                        if (arr1[1]-arr1[0] <= arr2[1]-arr2[0]) {
                            arr1[0] = arr2[0];
                            arr1[1] = arr2[1];
                        }
                    }
                }
            }
            else if (arr1[0] !=-1){
                if(arr1[1] == -1) {
                    arr1[1]=i - 1;
                }
                else if (arr1[1] != -1 && arr2[0] !=-1){
                    arr2[1]=i -1;
                    if (arr1[1]-arr1[0] <= arr2[1]-arr2[0]) {
                        arr1[0] = arr2[0];
                        arr1[1] = arr2[1];
                    }
                    arr2[0]=-1;
                    arr2[1]=-1;
                }
            }
        }
        int[] result ={};
        if(arr1[0] != -1 || arr1[1] !=-1){
            result = new int[2];
            result [0] = arr1[0];
            result [1] = arr1[1];
        }
        return result;
    }
}
