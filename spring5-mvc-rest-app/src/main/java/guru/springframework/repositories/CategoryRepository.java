package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by dmitri on 2022-10-11.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
