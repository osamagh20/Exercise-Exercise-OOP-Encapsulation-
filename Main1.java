public class Main1 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId("1010");
        e1.setName("turki");
        e1.setSalary(5000);

        Employee e2 = new Employee();
        e2.setId("2020");
        e2.setName("salem");
        e2.setSalary(3500);

        ;

        System.out.println(e1.toString()+" Raise salary "+e1.raiseSalary(10));
        System.out.println(e2.toString()+" Raise salary "+e2.raiseSalary(15));

    }
}