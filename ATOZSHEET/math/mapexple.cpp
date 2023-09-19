#include<bits/stdc++.h>
using namespace std;

int main(){
   int n;
   cin>> n;
   map<int,int> mp;
//    unordered_map<int,int> mp;

    int arr[n];
    for(int i =0;i<n;i++){
        cin>>arr[i];
        mp[arr[i]]++;
    }

    int q;
    cin >> q;
    while(--q){
        int num;
        cin>>num;

        cout<< arr[num] << endl;
    }
  
    return 0;
}
