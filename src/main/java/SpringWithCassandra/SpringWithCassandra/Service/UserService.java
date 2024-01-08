package SpringWithCassandra.SpringWithCassandra.Service;

import SpringWithCassandra.SpringWithCassandra.Model.User;
import SpringWithCassandra.SpringWithCassandra.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;

    public User addUser(User user){

       User userObj =  userRepository.save(user);

        return userObj;
    }

    public User getUser(Integer userId){

        User user = userRepository.findById(userId).get();

        return user;
    }

    public User update(String name , Integer userId) {

        User user = userRepository.findById(userId).get();

        user.setName(name);

        User user1 = userRepository.save(user);

        return user1;

    }

    public User delete(Integer userId){

        User user = userRepository.findById(userId).get();

         userRepository.delete(user);
        return user;
    }
}
