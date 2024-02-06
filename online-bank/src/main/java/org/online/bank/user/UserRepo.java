package org.online.bank.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

    void save(User user);
}
