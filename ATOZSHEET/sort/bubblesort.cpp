#include <iostream>
#include<bits/stdc++.h>
using namespace std;


void bubblesort(int arr[], int n){
    for (int  i = n -1; i >= 1; i--)
    {
        for (int j = 0; j < i-1; j++)
        { 
            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
         arr[j+1] = arr[j];
        arr[j] = temp;
            }
        }
    }
    
}

int main(){
    int arr[] = {1,2,3,4,5,7,6,8,9,10};
    int n = 10;
    bubblesort(arr,n);
    for (int i = 0; i < n; i++)
    {
        /* code */
        cout<< arr[i] << endl;
    }

    return 0;
    
}

