package Bank;

import javax.swing.*;

public class Account extends Client {

    private int balance;
    private String accountNumber;
    private String accountPass;

    private boolean blocked;

    public Account(String id, String name, String accountNumber, String accountPass, int balance) {
        super(id, name);
        this.accountNumber = accountNumber;
        this.accountPass = accountPass;
        this.balance = balance;
        this.blocked = false;

    }


    //Show menu
    void showMenu() {

        String inputPassword = JOptionPane.showInputDialog("Enter your password");
        int attempts = 0;

        while (!inputPassword.equals(this.accountPass) && !this.blocked){
            JOptionPane.showMessageDialog(null, "Wrong password");
            attempts++;
            if(attempts >= 5){
                this.blocked = true;
            }else{
                inputPassword = JOptionPane.showInputDialog("Enter your password");
            }

        }

        if(!this.blocked) {

            int option = 5;

            do {

                String input = JOptionPane.showInputDialog(null, "Hi\n"
                        + "1 . Check balance\n"
                        + "2 . Deposit amount\n"
                        + "3 . Withdraw Amount\n"
                        + "4 . Change password\n"
                        + "5 . Exit");

                if (ValidateNumbers.isNum(input)) {

                    option = Integer.parseInt(input);
                    switch (option) {
                        case 1:
                            //Check balance
                            showBalance();
                            break;
                        case 2:
                            //Deposit
                            depositAmount();
                            break;
                        case 3:
                            //Withdraw
                            withdrawAmount();
                            break;
                        case 4:
                            //Change password
                            break;
                        case 5:
                            //Exit
                            JOptionPane.showMessageDialog(null, "Thank you for using our services");
                            option = 5;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "The selected option does not exist");
                            break;
                    }


                }


            } while (option != 5);
        }else{
            JOptionPane.showMessageDialog(null, "Your account has been blocked");
        }


    }

    //Show balance

    void showBalance() {
        JOptionPane.showMessageDialog(null, "Your balance is: " + this.balance);
    }

    //Deposit amount

    void depositAmount() {

        String input = JOptionPane.showInputDialog("How much do you want to deposit?");
        if (!input.equals("") && ValidateNumbers.isNum(input)) {
            int amount = Integer.parseInt(input);
            if (amount > 0) {
                this.balance += amount;
                showBalance();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid amount");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid amount");
        }

    }

    void withdrawAmount() {
        String input = JOptionPane.showInputDialog(null, "How much do you want to withdraw?\n"
                + "a . 10000\n"
                + "b . 20000\n"
                + "c . 50000\n"
                + "d . 100000\n"
                + "e . 500000\n"
                + "f.  Other");

        if(!input.equals("")){

            switch(input){
                case "a":
                    if((this.balance - 10000) >= 0){
                        this.balance -= 10000;
                        JOptionPane.showMessageDialog(null,"Your new balance is : " + this.balance);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient funds");
                    }
                    break;

                case "b":
                    if((this.balance - 20000) >= 0){
                        this.balance -= 20000;
                        JOptionPane.showMessageDialog(null,"Your new balance is : " + this.balance);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient funds");
                    }
                    break;

                case "c":
                    if((this.balance - 50000) >= 0){
                        this.balance -= 50000;
                        JOptionPane.showMessageDialog(null,"Your new balance is : " + this.balance);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient funds");
                    }
                    break;

                case "d":
                    if((this.balance - 100000) >= 0){
                        this.balance -= 100000;
                        JOptionPane.showMessageDialog(null,"Your new balance is : " + this.balance);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient funds");
                    }
                    break;

                case "e":
                    if((this.balance - 500000) >= 0){
                        this.balance -= 500000;
                        JOptionPane.showMessageDialog(null,"Your new balance is : " + this.balance);
                    }else{
                        JOptionPane.showMessageDialog(null, "Insufficient funds");
                    }
                    break;

                case "f":
                    String enterAmount = JOptionPane.showInputDialog("Enter an amount to withdraw");
                    if(!enterAmount.equals("") && ValidateNumbers.isNum(enterAmount)){
                        int customizedAmount = Integer.parseInt(enterAmount);
                        if((this.balance - customizedAmount) >= 0){
                            this.balance -= customizedAmount;
                            JOptionPane.showMessageDialog(null,"Your new balance is : " + this.balance);
                        }else{
                            JOptionPane.showMessageDialog(null, "Insufficient funds");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Invalid amount");
                    }
                    break;
                    

                default:
                    JOptionPane.showMessageDialog(null,"Invalid option");
                    break;
            }
        }

    }


}
