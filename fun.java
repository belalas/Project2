

public class fun{
    public static void main(String[] args) {

        Person p=Person.create_person(1, "belal", "Email@gmail", "22222");
        Person.read_person_date(p);
        Person.update_person_data(p, 2, "khaled", "essss@", "5555");
        Person.read_person_date(p);
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
    public static Person create_person(int id,String name,String email,String phone_number){
        Person p=new Person();
        p.set_id(id);
        p.set_name(name);
        p.set_email(email);
        p.set_phone_number(phone_number);
        return p;
    }
    public static void read_person_date(Person p){
        System.out.println(" "+p.git_id()+" "+p.git_name()+" "+p.git_email()+" "+p.git_phone_number());
    }
    public static void update_person_data(Person p,int id,String name,String email,String phone_number){
        p.set_id(id);
        p.set_name(name);
        p.set_email(email);
        p.set_phone_number(phone_number);
    }
    public static void delete_person_data(Person p){
        p.id=0;
        p.name=null;
        p.email_adress=null;
        p.phone_number=null;
    }
}
