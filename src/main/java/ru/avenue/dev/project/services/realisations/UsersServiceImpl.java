package ru.avenue.dev.project.services.realisations;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.avenue.dev.project.entities.User;
import ru.avenue.dev.project.repositories.templates.UsersRepository;
import ru.avenue.dev.project.services.templates.UsersService;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

//    @Autowired
//    private PasswordEncoder encoder;

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
//        String rowPassword = user.getHashPassword();
//        String hashPassword = encoder.encode(rowPassword);
//        user.setHashPassword(hashPassword);

        return usersRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
