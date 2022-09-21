class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j])
                break;
            }
            if(j==n)
                return arr[i]; // of element at arr[i] from break statement.
            }
        return 0;
    }  
    
}
