bool prime(int n)
{
	int sum = 0;

    for(int i =1;i<=sqrt(n);i++){
        if(n%i==0){
            sum++;
            if((n/i) != i){
				sum++;
            }
        }
    }

	if(sum == 2){
		return true;
	} else{
		return false;
	}
}