package one.digital.inovation.one.me.model.Service;

import one.digital.inovation.one.me.model.User;

public interface UserService {

    User findById(long id);

    User create(User userToCreate);
}
