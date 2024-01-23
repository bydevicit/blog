package bydevicit.blog.repository;

import bydevicit.blog.entity.concrete.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostLikeRepository extends JpaRepository<PostLike, Integer> {
}