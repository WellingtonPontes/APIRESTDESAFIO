package one.digital.inovation.one.me.model.Service;

import java.util.NoSuchElementException;


import org.springframework.stereotype.Service;

import one.digital.inovation.one.me.Repository.Userrepository;
import one.digital.inovation.one.me.model.User;

// camada query
@Service
public class UserServiceImpl implements UserService {

    private final Userrepository userRepository;

    public UserServiceImpl(Userrepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException :: new );
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccount(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Usuario ja existe");
        }
        return userRepository.save(userToCreate);
    }
    
}
