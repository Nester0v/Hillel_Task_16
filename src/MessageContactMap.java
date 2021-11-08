import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MessageContactMap {

    public void MapForContacts(Collection<Contact> contacts,
                               Collection<Message> messages) {

        Map<String, Contact> contactMap = new HashMap<>();
        Map<String, Collection<Message>> groups = new HashMap<>();

        MapForMessage(contacts, messages, contactMap, groups);
    }

    private void MapForMessage(Collection<Contact> contacts,
                               Collection<Message> messagesGroup,
                               Map<String, Contact> contactMap,
                               Map<String, Message> groups) {

        Map<String, Contact> stringContactHashMap = new HashMap<>();
        Map<String, Collection<Message>> stringCollectionHashMap = new HashMap<>();

        for (Contact contact : contacts) {
            Collection<Message> group =

        }
    }
}
