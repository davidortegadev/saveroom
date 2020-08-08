package com.codeup.saveroom.repositories;

import com.codeup.saveroom.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}
