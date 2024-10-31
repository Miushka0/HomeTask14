package app;

import app.Modules.Device;
import app.Modules.Printer;

import java.util.Scanner;

public class HomeTask14 {
    public static void main(String[] args){
//       Device device = new Device();
        Printer device = new Device();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = userInput.nextLine();

        System.out.println("Введіть ім'я:");
        String sender = userInput.nextLine();

        Device.Message message = new Device.Message(
                text.isEmpty() ? null : text,
                sender.isEmpty() ? null : sender
        );

        device.print(message);

        userInput.close();
    }
}
