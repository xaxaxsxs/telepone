import third_case.SmartPhone;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone sm = new SmartPhone();
        SmartPhone.Camera camera = sm.new Camera();
        SmartPhone.Contacts contacts = sm.new Contacts();
        System.out.println("что хотите сделать? 1 - открыть камеру 2 - позвонить");
        if (sc.nextInt()==1)
        {
            camera.OpenCamera();
            camera.TakePhoto();
        }
        else if(sc.nextInt()==2)
        {
            contacts.Call();
        }
    }
}