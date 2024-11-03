public class Account {
    private String id;
    private String name;
    private int balance;

    public Account() {

    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public  int debit(int amount) {
        if(balance > amount) {
           return  balance = balance - amount;
        }
        return  balance;
    }
    public  int credit(int amount) {
        return balance = balance +amount;
    }
    public int transferTo(Account another,int amount){
        if(balance > amount) {
            another.credit(amount);
            return balance = balance - amount;

        }
        return  balance;
    }
    public String toString(){
        return "ID: "+id+"\nName: "+name+"\nBalance: "+balance+"\n-----******------";
    }

}
