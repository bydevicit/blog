package bydevicit.blog.repository;

import bydevicit.blog.entity.concrete.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}