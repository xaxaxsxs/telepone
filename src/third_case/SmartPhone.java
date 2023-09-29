package third_case;
import java.util.Scanner;
public class SmartPhone {

    public class Camera {
        public boolean isCameraOpened = false;
        Scanner sc = new Scanner(System.in);

        public void OpenCamera() {
            System.out.println("Какую камеру выбрать? 1-фронтальная 2-основная");
            if (sc.nextInt() == 1) {
                System.out.println(" Вы выбрали фронтальную камеру.");
                isCameraOpened = true;
            } else if (sc.nextInt() == 2) {
                System.out.println(" Вы выбрали фронтальную камеру.");
                isCameraOpened = true;
            } else {
                System.out.println("ошибка");
                isCameraOpened = false;
            }
        }

        public void TakePhoto() {
            if (isCameraOpened) {
                System.out.println("вы сделали фото.");
            }
        }

    }

   public class Contacts {
       Scanner sc = new Scanner(System.in);

        int n1 = 793218462;
        int n2 = 792164128;
        int n3 = 375912463;

        String na1 = "олег";
       String na2 = "ольга";
       String na3 = "женек";
        public void Call() {
            System.out.println("Кому хотите позвонить?");
            System.out.println("1 - "+na1+", "+n1);
            System.out.println("2 - "+na2+", "+n2);
            System.out.println("3 - "+na3+", "+n3);

            if (sc.nextInt()==1)
            {
                System.out.println("вы позвонили "+na1+", "+n1);
            }
            if (sc.nextInt()==2)
            {
                System.out.println("вы позвонили "+na2+", "+n2);
            }
            if (sc.nextInt()==3)
            {
                System.out.println("вы позвонили "+na3+", "+n3);
            }
        }
    }
}
