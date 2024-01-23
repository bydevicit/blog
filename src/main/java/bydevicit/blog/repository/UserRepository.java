package bydevicit.blog.repository;

import bydevicit.blog.entity.concrete.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}