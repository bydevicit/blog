package bydevicit.blog.repository;

import bydevicit.blog.entity.concrete.CommentLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentLikeRepository extends JpaRepository<CommentLike, Integer> {
}