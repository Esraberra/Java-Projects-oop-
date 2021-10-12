package qaTeamCalisma;

public class BMI {

        /*
                  1 ) BMI ve MainBMI class'ları creat ediniz
                  2 ) BMI class'ı için field'ları name(String), age(int), weight(double) ve height(double) olan veriable'lar oluşturup tüm veriableleri encapsule ediniz.
                  3 ) tüm  field'ları setter getter ve  constructor creat ediniz.
                  4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz.
                  5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz.
            )     6 ) MainBMI de  bu değereli yazdırınız.
                    */
        //name, age, weight,height
        private String name;
        private int age;
        private double weight;
        private double height; //1.60

//bmi=weight/(height*height) getBMI()
//bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez getStatus()


        public String getName() {
                return name;
        }

        public BMI(String name, int age, double weight, double height) {
                setAge(age);
                setHeight(height);
                setName(name);
                setWeight(weight);
                bmiHesapla(height, weight);
        }



        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        public double getHeight() {
                return height;
        }

        public void setHeight(double height) {
                this.height = height;
        }


        // bmi=weight/(height*height)
        public double bmiHesapla(double height, double weight) {

             double   bmiSonuc = weight / (height * height);

                //System.out.println(bmiSonuc);
                return bmiSonuc;
        }

        public String bmiDegerlendir() {
                double bmiSonuc=bmiHesapla( getHeight(), getWeight());
                //bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez getStatus()
                if (bmiSonuc < 18.5) {
                        return "zayif";
                } else if (bmiSonuc < 25) {
                        return "normal";
                } else if (bmiSonuc < 30) {
                        return "kilolu";
                } else {
                        return "obez";


                }


        }
}