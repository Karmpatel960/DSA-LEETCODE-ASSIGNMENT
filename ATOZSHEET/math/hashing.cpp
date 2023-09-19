#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cin>>n;
    int arr[n];
    for(int i =0;i<n;i++){
        cin>>arr[i];
    }

    int has[13] = {0};

    for(int i =0;i<n;i++){
        has[arr[i]] += 1;
    }

    int q;
    cin >> q;
    while(--q){
        int num;
        cin>>num;

        cout<< has[num] << endl;
    }
  
    return 0;
}
