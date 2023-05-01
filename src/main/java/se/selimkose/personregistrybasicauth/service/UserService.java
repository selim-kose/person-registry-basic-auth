package se.selimkose.personregistrybasicauth.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import se.selimkose.personregistrybasicauth.dao.UserRepository;
import se.selimkose.personregistrybasicauth.entity.User;
import se.selimkose.personregistrybasicauth.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public User getUser(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new UserNotFoundException(id));
    }
    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

}
