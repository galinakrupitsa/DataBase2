package Controller;

import DTO.dbUserDTO;
import Service.dbService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class dbController {
    private final dbService userService;
    public dbController(dbService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public dbUserDTO getUser(@PathVariable Long id) {
        System.out.println("ок");
        return userService.getUserById(id);

    }
@PostMapping("/create")

public Integer createUser(@RequestBody dbUserDTO user) {
    return userService.saveUser(user);
}
}
