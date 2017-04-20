package org.nklkarthi.user.service;

import org.nklkarthi.persistence.model.MyUser;
import org.nklkarthi.user.dao.MyUserDAO;
import org.nklkarthi.web.MyUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MyUserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    MyUserDAO myUserDAO;

    public MyUser registerNewUserAccount(final MyUserDto accountDto) throws Exception {
        if (usernameExists(accountDto.getUsername())) {
            throw new Exception("There is an account with that username: " + accountDto.getUsername());
        }
        final MyUser user = new MyUser();

        user.setUsername(accountDto.getUsername());
        user.setPassword(passwordEncoder.encode(accountDto.getPassword()));
        return myUserDAO.save(user);
    }

    public MyUser getUserByUsername(final String username) {
        final MyUser user = myUserDAO.findByUsername(username);
        return user;
    }

    public void removeUserByUsername(String username) {
        myUserDAO.removeUserByUsername(username);
    }

    private boolean usernameExists(final String username) {
        final MyUser user = myUserDAO.findByUsername(username);
        if (user != null) {
            return true;
        }
        return false;
    }

}
