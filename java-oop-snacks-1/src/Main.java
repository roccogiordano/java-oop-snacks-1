public class Main {
    public static void main(String[] args) {

        // Student Instances
        
        Student studente1 = new Student("John", "Smith", 24);

        Student studente2 = new Student("Mark", "Rober", 38);

        Student studente3 = new Student("William", "Park", 19);

        //


        // Student Methods Call

        System.out.println(studente1.getInfo());

        System.out.println(studente2.getInfo());

        System.out.println(studente3.getInfo());

        //


        // Readability Divider

        System.out.println("- - - - -");

        //


        // BankAccount Instances

        BankAccount bankAccount1 = new BankAccount(231932);

        BankAccount bankAccount2 = new BankAccount(109741);

        BankAccount bankAccount3 = new BankAccount(423098);

        //


        // BankAccount Methods Call

        System.out.println("The balance of bankAccount1 is: " + bankAccount1.getBalance());

        bankAccount1.deposit(150);

        bankAccount1.withdrawal(50);

        bankAccount1.deposit(75);

        System.out.println("Now bankAccount1 balance is: " + bankAccount1.getBalance());


        System.out.println("The balance of bankAccount2 is: " + bankAccount2.getBalance());

        bankAccount2.deposit(1670);

        bankAccount2.withdrawal(585);

        bankAccount2.deposit(955);

        System.out.println("Now bankAccount2 balance is: " + bankAccount2.getBalance());


        System.out.println("The balance of bankAccount3 is: " + bankAccount3.getBalance());

        bankAccount3.deposit(25);

        bankAccount3.deposit(175);

        bankAccount3.withdrawal(650);

        System.out.println("Now bankAccount3 balance is: " + bankAccount3.getBalance());

        //


        // Readability Divider

        System.out.println("- - - - -");

        //

    }
}
