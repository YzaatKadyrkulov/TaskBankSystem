public class Account {
    double[] balances;

    public Account(){
        this.balances = new double[0];

    }

    public double[] checkBalances(double[]array, double balance){
        double[] newBalance1 = new double[array.length+1];
        for(int i=0; i < array.length; i++){
            newBalance1[i] = array[i];

        }
        newBalance1[array.length] = balance;
        return newBalance1;
    }
    public void getBalances(){
        double count = 0;
        for(double j : balances){
            count += j;
        }
        System.out.println(count);
    }
    public double[] withdrawMoney(double balance){
        double[] newBalance2 = new double[balances.length];
        for (int i = 0; i <balances.length ; i++) {
            if(balances[i] >=balance){
                balances[i] -= balance;
                newBalance2[i] = balances[i];
                return newBalance2;
            }else{
                System.out.println("Your balance is lower than you show!"+ balance);
            }
            
        }
        return balances;
    }
    public double[] transaction(double num){
        double[] acceptBalance = new double[balances.length];
        boolean transactionSuccess = false;
        double numTransaction = 0;

        for (int i = 0; i <balances.length ; i++) {
            if(balances[i] >=num){
                acceptBalance[i] += num;
                transactionSuccess = true;
                break;
            }
            
        }
        if(transactionSuccess){
            for (int i = 0; i <balances.length ; i++) {
                balances[i] -= numTransaction;
                
            }
            return acceptBalance;
        }else {
            System.out.println("Your balance is not enough!");
            return new double[0];


        }
    }

}