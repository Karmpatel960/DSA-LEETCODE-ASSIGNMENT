#include <iostream>
#include<bits/stdc++.h>
using namespace std;


void insertionsort(int arr[], int n){
    for (int  i = 0; i < n -1; i++)
    {
        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
    }
}

int main(){
    int arr[] = {1,2,3,4,5,7,6,8,9,10};
    int n = 10;
    insertionsort(arr,n);
    for (int i = 0; i < n; i++)
    {
        /* code */
        cout<< arr[i] << endl;
    }

    return 0;
    
}

