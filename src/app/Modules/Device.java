package app.Modules;

public class Device implements Printer {

    public static class Message {
        private String text;
        private String sender;

       public Message(String text, String sender) {
           this.text = text;
           this.sender = sender;
       }

       public String getText() {
           return text;
       }

       public void setText(String text) {
           this.text = text;
       }

       public String getSender() {
           return sender;
       }

       public void setSender(String sender) {
           this.sender = sender;
       }
   }
    @Override
    public void print(Message message) {
        if (message.getText() == null && message.getSender() == null) {
            Printer anonymous = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymous.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.printf("%nАнонімний користувач відправив повідомлення: %s", message.getText());
        } else {
            System.out.printf("%nКористувач %s відправив повідомлення: %s", message.getSender(), message.getText());
        }
    }
}


