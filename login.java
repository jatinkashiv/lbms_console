package LBMS;
import java.util.UUID;

public class login
{
    private String ID;
    private String Password;
    private Boolean Bool= false;
    private String hint;
    login(String name, String password,String hint)
    {

        this.ID = name+UUID.randomUUID().toString().replace("-","").substring(0,6);
        this.Password = password;
        this.hint = hint;
    }
    //whenever user want
    public void showInfo(String Hint)
    {
        if(Hint.equalsIgnoreCase(hint))
        {
            System.out.println("your id : "+ID+"\nyour password : "+Password);
        }
    }

    public Boolean Aunthentication(String id,String pass)
    {
        if(id.equalsIgnoreCase(ID) && pass.equalsIgnoreCase(Password))
        {
            System.out.println("Successfully Logged-in");
            Bool = true;
        }
        else
        {
            System.out.println("Something went Wrong");
        }
        return Bool;
    }
}
