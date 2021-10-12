package MapveUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NewFeatures {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User(1,"Aleyna"));
        users.add(new User(2,"Ahmed"));
        users.add(new User(3,"Zehra"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Yildiz"));
        users.add(new User(6,"Levent"));
        users.add(new User(7,"Elvan"));



users.stream().forEach(user -> user.talk());
users.stream().forEach(user -> user.toString());
// olusturulmus bir siniftan  method cagirmak istiyorsak ::
        users.stream().forEach(User::talk );
        //id si 5 ten büyük olan elemanlarin sayisi kac tanedir?
       long kac= users.stream().filter(user -> user.id>5).count();
        System.out.println(kac);

        // collect methodunu kullanararak id si 5 ten büyük olan elemanlari yeni bir listeye atalim

       List<User> yeniListe=  users.stream().filter(user -> user.id>5).collect(Collectors.toList());
       // System.out.println(yeniListe);
 List <User> lsite = users.stream().map(user -> new User(user.id+40, user.name.toLowerCase())).collect(Collectors.toList());
lsite.stream().forEach(user -> System.out.println(user.toString()));

        // map ile degisiklik yapip yeni listeye at ID LERINE YÜZ EKLE VE BÜYÜK HARFE CEVIR ISIMLERI
      List<User> yeniBirListe=  users.stream().map(user -> new User(user.id+100, user.name.toUpperCase())).collect(Collectors.toList());

       // yeniListe.stream().forEach(user -> System.out.println(user.toString()));

Map <Integer, String> map=users.stream().map(user -> new User(user.id+4, user.name.toUpperCase())).collect(Collectors.toMap(user -> user.id,user -> user.name));
        System.out.println(map);



    }
}

