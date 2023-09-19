#include<bits/stdc++.h>
using namespace std;

int main(){

    string n;
    cin>>n;

    int has[26] = {0};

    for(int i =0;i<n.size();i++){
        has[n[i]-'a'] ++; //n[i] is a character and 'a' is also a character so we subtract them to get the index of the character in the array
    }

    int q;
    cin >> q;
    while(--q){
        char num;
        cin>>num;

        cout<< has[num-'a'] << endl; // has[num] is the frequency of the character num
    }
  
    return 0;
}
