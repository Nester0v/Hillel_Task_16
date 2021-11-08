import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        List<Contact> contact = new ArrayList<>();
        contact.add(new Contact(1, "Денис",
                "Орлов", "+380956743367"));
        contact.add(new Contact(2, "Александр",
                "Жуков", "+380954663367"));
        contact.add(new Contact(3, "Сергей",
                "Безфамильный", "+380976647377"));
        contact.add(new Contact(4, "Анна",
                " ", "+380669743367"));
        contact.add(new Contact(5, "Ольга",
                " ", "+380951168367"));
        contact.add(new Contact(6, "Максим",
                " ", "+380664625736"));
        contact.add(new Contact(7, "Анастасия",
                "Герман", "+380958093256"));
        contact.add(new Contact(8, "Евгений",
                "Андриенко", "+380758055556"));
        contact.add(new Contact(9, "Олег",
                "Ж", "+380668096656"));
        contact.add(new Contact(10, "Тимур",
                "", "+380958883299"));

        List<CallLog> callLog = new ArrayList<>();
        callLog.add(new CallLog(LocalDateTime.of(2021, 03,21,19,45),
                "Анастасия", "Герман", "+380958093256"));
        callLog.add(new CallLog(LocalDateTime.of(2020, 01,01,00,00),
                "Евгений", "Андриенко", "+380758055556"));
        callLog.add(new CallLog(LocalDateTime.of(2021, 03,21,19,45),
                "Олег", "Ж", "+380668096656"));
        callLog.add(new CallLog(LocalDateTime.of(2021, 05,19,03,45),
                "Тимур", "", "+380958883299"));

    List<Message> message = new ArrayList<>();
    message.add(new Message("+380958883299", "Дружище, верни долг!!!"));
    message.add(new Message("+380958093256", "Привет, как поживаешь?"));


        for(int i = 0; i< contact.size(); i++) {
            System.out.println(contact.get(i));
        }
    }

    MessageContactMap messageContactMap = new MessageContactMap();



    private Collection<Contact> find(Collection<Contact> contacts, String text){
        Collection<Contact> result = new ArrayList<>();
        for (Contact jvhjbh : contacts){
            
        }
    }
}
