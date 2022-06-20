package ru.avenue.dev.project.services.realisations;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.avenue.dev.project.entities.Role;
import ru.avenue.dev.project.entities.User;
import ru.avenue.dev.project.repositories.templates.UsersRepository;
import ru.avenue.dev.project.services.templates.UsersService;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService, UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public User findById(Long id) {
        if (usersRepository.findById(id).isPresent()) {
            return usersRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<User> findAll(int limit, int offset) {
        return usersRepository.findAll(limit, offset);
    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public User createNewUser(User user) {
        //захэшировали сырой пароль пользователя и сохранили в пользователя новый пароль
        String rowPassword = user.getHashPassword();
        String hashPassword = encoder.encode(rowPassword);
        user.setRole(new Role("USER"));
        user.setHashPassword(hashPassword);

        return usersRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return usersRepository.findByEmail(email).orElseThrow(IllegalStateException::new);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = usersRepository.findByEmail(username);

        return optionalUser.orElseThrow(IllegalStateException::new);
    }
}
