package Practice;

import java.util.Scanner;

class welcome {
    welcome() {
        System.out.println("Welcome In this bank");
    }
}

class Customer {
    String Name;
    int age;
    long mobile;
    String address;
    int pass;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public long getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String Name) {
        Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
}

class employee extends Customer {
    String post;

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }
}

class bankingProcess {
    int totalamount = 0;

    void deposit(int amount) {
        totalamount = totalamount + 1;
        System.out.println("Your amount insert sucessfully");
        System.out.println("amount: " + amount);
    }

    void withdraw(int amount) {
        totalamount = totalamount - amount;
        System.out.println("Your amount withdraw succesfully");
        System.out.println("amount: " + amount);
    }
}

public class simple_bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        welcome obj = new welcome();
        System.out.println("Enter the process Name here: ");
        System.out.println("1 Enter the custoner details\n2 Get the custoner details \n3 Enter the employee detals \n4 Get the employee details\nDeposit Money\nWithdraw money");
        for (int i = 0; i <= 100; i++) {
            System.out.print("-");
        }
        Customer a1 = new Customer();
        employee b1 = new employee();
        bankingProcess x = new bankingProcess();
        int amount;
        System.out.println("");
        while (true) {
            System.out.println("Enter the selected option here: ");
            int s = sc.nextInt();


            switch (s) {
                case 1:
                    System.out.println("Please Enter the customer details here ");

                    System.out.println("Enter the name here: ");
                    a1.Name = sc.next();
                    System.out.println("Enter the age here: ");
                    a1.age = sc.nextInt();
                    System.out.println("Enter the mobile here: ");
                    a1.mobile = sc.nextLong();
                    System.out.println("Enter the address here: ");
                    a1.address = sc.next();

                    a1.setName(a1.Name);
                    a1.setAddress(a1.address);
                    a1.setAge(a1.age);
                    a1.setMobile(a1.mobile);
                    break;

                case 2:
                    System.out.println("Get the customer details");
                    System.out.println("Name: " + a1.getName());
                    System.out.println("Age: " + a1.getAge());
                    System.out.println("Address: " + a1.getAddress());
                    System.out.println("Mobile No: " + a1.getMobile());
                    break;

                case 3:
                    System.out.println("Please Enter the customer details here ");

                    System.out.println("Enter the name here: ");
                    b1.Name = sc.next();
                    System.out.println("Enter the age here: ");
                    b1.age = sc.nextInt();
                    System.out.println("Enter the mobile here: ");
                    b1.mobile = sc.nextLong();
                    System.out.println("Enter the address here: ");
                    b1.address = sc.next();
                    System.out.println("Enter the post here: ");
                    b1.post = sc.next();


                    b1.setName(b1.Name);
                    b1.setAddress(b1.address);
                    b1.setAge(b1.age);
                    b1.setMobile(b1.mobile);
                    b1.setPost(b1.post);
                    break;

                case 4:
                    System.out.println("Get the customer details");
                    System.out.println("Name: " + b1.getName());
                    System.out.println("Age: " + b1.getAge());
                    System.out.println("Address: " + b1.getAddress());
                    System.out.println("Mobile No: " + b1.getMobile());
                    System.out.println("Post: " + b1.getPost());
                    break;

                case 5:
                    System.out.println("Deposit your money");
                    System.out.println("Enter the deposite amount here: ");
                    amount = sc.nextInt();
                    x.deposit(amount);
                    break;

                case 6:
                    System.out.println("Withdraw your money");
                    System.out.println("Enter the  amount here: ");
                    amount = sc.nextInt();
                    x.deposit(amount);
                    break;

                default:
                    System.out.println("wrong option you selected");
                    break;


            }
        }


    }
}
