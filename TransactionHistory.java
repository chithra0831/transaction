public class TransactionHistory {
    int transaction_id;
    String sender_name;
    String receiver_name;
    String date;
    String status;

    TransactionHistory(int transaction_id,String sender_name,String receiver_name,String date,String status){
        this.transaction_id=transaction_id;
        this.sender_name=sender_name;
        this.receiver_name=receiver_name;
        this.date=date;
        this.status=status;
    }
    public void display(){
        System.out.println("ID:" + transaction_id);
        System.out.println("Sender:" + sender_name);
        System.out.println("Receiver:" +receiver_name);
        System.out.println("Date:" + date);
        System.out.println("Status:" + status);
    }
    public static void main(String[] args) {
        TransactionHistory t = new TransactionHistory(101, "chithra","abc", "10-02-2002", "success");
        t.display();

    }

}
