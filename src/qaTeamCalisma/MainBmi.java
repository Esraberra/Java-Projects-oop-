package qaTeamCalisma;

public class MainBmi {
    public static void main(String[] args) {

        BMI nesnem=new BMI( "Esra",  36, 55.0, 1.60);
        System.out.println("BMI :" + nesnem.getName()+ " "+ nesnem.getWeight()+ " "+nesnem.getHeight()+ " ve" +" "+ nesnem.bmiDegerlendir( ));


    }
}
