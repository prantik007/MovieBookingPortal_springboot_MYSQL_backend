package movieBookingPortal.service;

import movieBookingPortal.model.User;
import movieBookingPortal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/addUser")
    public @ResponseBody
    String addNewUser(@RequestParam String name, String email, String password){
        User u=new User();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);

        userRepository.save(u);
        return "Saved new User";

    }


    public
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long id){
        return userRepository.findUserById(id);
    }
}
