public class fun{
    public static void main(String[] args) {
        System.out.println("hallo");
    }
}
class Person{
    private int id;
    private String name;
    private String email_adress;
    private String phone_number;
    public void set_id(int id){
        if(id>0)
            this.id=id;
    }
    public int git_id(){
        return this.id;
    }
    public void set_name(String name){
        if(name.length()>2)
            this.name=name;
    }
    public String git_name(){
        return this.name;
    }
    public void set_email(String email){
        if(email.length()>2 && email.contains("@"))
            this.email_adress=email;
    }
    public String git_email(){
        return this.email_adress;
    }
    public void set_phone_number(String phone_number){
        if(phone_number.length()>2)
            this.phone_number=phone_number;
    }
    public String git_phone_number(){
        return this.phone_number;
    }
    public Person(){
        
    }
}
