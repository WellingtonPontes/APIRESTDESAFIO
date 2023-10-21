package one.digital.inovation.one.me.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digital.inovation.one.me.model.User;

@Repository
public interface Userrepository extends JpaRepository< User , Long>{

        boolean existsByAccount(String account);
  
    
}
