package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        setPassword("omsingh");
        return password;
    }
    private void setPassword(String pass){
        this.password=pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.name="om";
        ac1.email="om@gamil.com";
        System.out.println(ac1.getPassword());
    }
}
