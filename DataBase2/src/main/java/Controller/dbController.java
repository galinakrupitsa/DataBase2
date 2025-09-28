package Controller;

import DTO.dbUserDTO;
import Service.dbService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class dbController {
    private final dbService userService;
    public dbController(dbService userService) {
        this.userService = userService;
    }
@PostMapping("/create")

public Integer createUser(@RequestBody dbUserDTO user) {
    return userService.saveUser(user);
}
}
