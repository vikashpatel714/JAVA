//A Java class to test the encapsulated class Account.  
public class Test1 {  
    public static void main(String[] args) {  
        //creating instance of Account class  
        Account acc=new Account();  
        //setting values through setter methods  
        acc.setAcc_no(36630201);  
        acc.setName("Patil");  
        acc.setEmail("Vikashpatel.vns2000@gmail.com");  
        acc.setAmount(900000f);  
        //getting values through getter methods  
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
    }  
    }  