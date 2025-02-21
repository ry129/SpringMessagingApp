package com.MessagingApp;
import com.MessagingApp.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {


    @PostMapping("/post")
    public String sayHello3(@RequestBody UserDTO user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz !";
    }
}
