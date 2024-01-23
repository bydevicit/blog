package bydevicit.blog.repository;

import bydevicit.blog.entity.concrete.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}