package com.mark.mark.Repository;

import com.mark.mark.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Long,Post> {


}
