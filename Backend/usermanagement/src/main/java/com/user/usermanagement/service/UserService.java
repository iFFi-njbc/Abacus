package com.user.usermanagement.service;

import com.user.usermanagement.entity.User;
import com.user.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService  {

    @Autowired
    private UserRepository urepo;

    public User getUser(Long id)
    {
        if(id == null || id == 0)
        {
            throw new RuntimeException("Please! Enter a valid Id");
        }
        Optional<User> user = urepo.findById(id);
        if(user.isPresent())
        {
            return user.get();
        }
        else throw new RuntimeException("User not found for the id : " + id);
    }

    public User saveUser(User user)
    {
        if(user.getName() .isEmpty())
        {
            throw new RuntimeException("Please! Enter a name");
        }
        if(user.getEmail().isEmpty())
        {
            throw new RuntimeException("Please Enter a valid Email");
        }
        if(user.getPassword().isEmpty())
        {
            throw new RuntimeException("Please enter a password");
        }

        return urepo.save(user);
    }

    public User findUser(String email, String password)
    {
        return urepo.findByEmailAndPassword(email, password);
    }

}
