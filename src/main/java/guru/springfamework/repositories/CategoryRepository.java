package guru.springfamework.repositories;

import guru.springfamework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by dmitri on 2022-10-11.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
