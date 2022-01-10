package movieBookingPortal.controller;

import movieBookingPortal.model.User;
import movieBookingPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/user")
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping(path = "/allUsers")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);

    }

    @GetMapping(path = "/find/{id}")
    public ResponseEntity<User> findUserByID(@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }



}
