public class Person {
    private int id;
    private String name;
    private String phone;
    private String address;

    public Person(int id, String name, String phone, String address){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public void updateDetails(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
   }

   public String getDetails(){

        return " ID : " + id + "\n Name : " + name + "\n Phone : " + phone + "\n Address : " + address;
   }

}
