import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner inp=new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year= inp.nextInt();

        if(year>0)
            {
                if (year%4==0)
                {
                    if (year%100==0)
                    {
                        if (year%400==0) // Burada hem 100'e tam bölünüp hem de 400'e tam bölünen yılları buluyoruz
                            System.out.println(year +" bir artık yıldır!");

                        else // '{} açmamamın sebebi IF ELSE'de sadece tek satır kod yazıldığı zaman süslü parantez zorunluluğu yoktur'
                            System.out.println(year+" bir artık yıl değildir!");
                    }
                    else // Aynı sebeple süslü parantez açmadım
                        System.out.println(year +" bir artık yıldır!");
                }
                else
                    System.out.println(year+" bir artık yıl değildir!");
            }
            else
                System.out.println("Hatalı giriş yaptınız..!!");
        }
}