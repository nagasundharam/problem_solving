class stockBuySell{
    public int maximumProfit(int prices[]) {
        
        int result = 0 ;
        int stock = prices[0];
        int n = prices.length;
        
        for(int i = 1 ; i  < n ; i++)
        {
         result = Math.max(result,prices[i] - stock);
            
            if(stock > prices[i]){
                stock = prices[i];
            }
        }
        
        return result;
    
   
        
      
        
        // Code here
    }
}