public class Main {
    public static void main(String[] args) {
        // Test class Account //
        Account ac1 = new Account();
        Account ac2 = new Account();

        ac1.setId("1212");
        ac1.setBalance(2000);
        ac1.setName("osama");

        ac2.setName("ahmed");
        ac2.setId("1313");
        ac2.setBalance(3000);

        System.out.println("Name : "+ac1.getName());
        System.out.println("ID : "+ac1.getId());
        System.out.println("Balance : "+ac1.getBalance());
        System.out.println("-------****-------");
        System.out.println("Name : "+ac2.getName());
        System.out.println("ID : "+ac2.getId());
        System.out.println("Balance : "+ac2.getBalance());

        ac1.credit(200);
        ac2.credit(300);

        ac1.debit(500);
        ac2.debit(200);

        ac2.transferTo(ac1,200);
        ac1.transferTo(ac2,500);

        // After operations

        System.out.println("After many of operations ...");

        System.out.println(ac1.toString());
        System.out.println(ac2.toString());




    }
}

