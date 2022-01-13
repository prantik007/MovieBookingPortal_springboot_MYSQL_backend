package movieBookingPortal.controller;

import movieBookingPortal.model.Contact;
import movieBookingPortal.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "api/contact_us")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(path = "/add")
    public ResponseEntity<Contact> addContactMessage(@RequestBody Contact contact){
        Contact newContactMsg=contactService.addContactMessage(contact);
        return new ResponseEntity<>(newContactMsg, HttpStatus.CREATED);
    }

}
