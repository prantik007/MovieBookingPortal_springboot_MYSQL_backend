package movieBookingPortal.controller;

import movieBookingPortal.model.user;
import movieBookingPortal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/addUser")
    public @ResponseBody String addNewUser(@RequestParam String name,String email, String password){
        user u=new user();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);

        userRepository.save(u);
        return "Saved new user";

    }

    @GetMapping(path="/allUsers")
    public @ResponseBody Iterable<user> getAllUsers(){
        return userRepository.findAll();
    }



}
