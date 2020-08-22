package com.codeup.saveroom.repositories;

import com.codeup.saveroom.models.Post;
import com.codeup.saveroom.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
