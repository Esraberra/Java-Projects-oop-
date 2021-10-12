package MapveUser;

public class User {
    //iki klas acacagiz // birisinde int id ve String name fields ve bunlarin parametreleri eklenmis const yapacagiz birde
    // void talk method "Hi, I am " + this.name yazdiracak.
    // stringi override et
    //2. klasta User sinifinn data tipi oldugu liste olusturup verilerini o lsteye at
    //1. görev
    int id;
    String name;
    public User(int id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void talk(){
        System.out.println("Hi, I am " + this.name);
    }



}


