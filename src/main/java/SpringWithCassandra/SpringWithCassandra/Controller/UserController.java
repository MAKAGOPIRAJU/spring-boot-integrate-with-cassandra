package SpringWithCassandra.SpringWithCassandra.Controller;

import SpringWithCassandra.SpringWithCassandra.Model.User;
import SpringWithCassandra.SpringWithCassandra.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") Integer userId){

        return userService.getUser(userId);
    }

    @PutMapping("/update/{id}")
    public User update(@RequestParam("name") String userName,
                       @PathVariable("id") Integer userId){
        return userService.update(userName,userId);
    }

    @DeleteMapping("/delete/{id}")
    public User delete(@PathVariable("id") Integer userId){
        return  userService.delete(userId);
    }
}
