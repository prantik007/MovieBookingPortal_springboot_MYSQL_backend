package movieBookingPortal.service;

import movieBookingPortal.model.Contact;
import movieBookingPortal.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact addContactMessage(Contact contact){
        return contactRepository.save(contact);
    }
}
