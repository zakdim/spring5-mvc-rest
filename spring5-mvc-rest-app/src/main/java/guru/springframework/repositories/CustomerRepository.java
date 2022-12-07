package guru.springframework.repositories;

import guru.springframework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by dmitri on 2022-10-30.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
