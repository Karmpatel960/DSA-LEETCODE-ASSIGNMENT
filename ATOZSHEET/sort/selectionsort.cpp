#include <iostream>
#include<bits/stdc++.h>
using namespace std;


void selectionsort(int arr[], int n){
    for (int  i = 0; i < n -2; i++)
    {

        int min = i;
        for (int j = i; j < n-1; j++)
        {
            if(arr[j]< arr[min]){
                min = j;
            }
        }

         int temp = arr[min];
         arr[min] = arr[i];
        arr[i] = temp;
    }
    
}

int main(){
    int arr[] = {1,2,3,4,5,7,6,8,9,10};
    int n = 10;
    selectionsort(arr,n);
    for (int i = 0; i < n; i++)
    {
        /* code */
        cout<< arr[i] << endl;
    }

    return 0;
    
}

