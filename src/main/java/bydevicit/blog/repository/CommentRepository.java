package bydevicit.blog.repository;

import bydevicit.blog.entity.concrete.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}