package UdemyOyun;

public class Main {
    /*
       Main methodunda
    İlk olarak randomGenerator method undan random sayıyı alın
    Sonra LetsGuess method unu çağırın. randomGenerator(num)
    LetsGuess method unun parametresidir
    */
     /*
     Projects_05.GameGuess paketinde
     GuessGame classi olusturunuz...
     /*
        randomGenerator ()  methodunu olusturalim.
        Bu method 0 ile 100 arasinda random bir sayi olusturmali.
        Bu method random sayiyi return etmeli.
        Return tipi int olmali
     */
        /*
         LetsGuess ()  methodunu olusturalim
         Bu method parametre olarak bir int almali.
        Return tipi void olsun.
         Tahmin girisiminiz maksimum 5'tir.
        Bu method da, dogru sayıyı tahmin edene kadar sayıları
        tahmin etmeye devam etmelisiniz.
        Numaraniz random sayÄ±dan kucukse
         "Your number is too low" yazdÄ±ralÄ±m.
        Numaraniz random sayidan buyukse
         "Your number is too high" yazdiralim.
        Tahmin numaraniz  random sayiya esit oldugunda
         "You got it !!" yazdiralim
        Ve execution durdurun.
        Eger tahmininiz  5'e ulasırsa "Anlamadim dostum !!!"
        Not:
         1) Sayilari tahmin ederken Scanner Class kullanmaniz gerekir.
         2) Bu methodlarin her ikisi de statik bir method degildir
 */
    public static void main(String[] args) {
        GuessGame guess = new GuessGame();
        int sayi = guess.randomGenerator();
        guess.LetsGuess(sayi);
        System.out.println(sayi);
    }
}





