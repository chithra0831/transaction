public class BankCustomer {
    String cust_name;
    int cust_age;
    int acc_no;

    BankCustomer(String cust_name,int cust_age,int acc_no){
      this.cust_name=cust_name;
      this.cust_age=cust_age;
      this.acc_no=acc_no;
    }
    void display(){
       System.out.println("Name:" + cust_name);
    System.out.println("Age:" + cust_age);
    System.out.println("AccNo:" + acc_no);

    }
    public static void main(String[] args) {
        BankCustomer b1=new BankCustomer("chithra", 23, 123456789);
        b1.display();
    }

    
}
