package ufanet.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufanet.notes.model.User;

import java.util.Optional;

/**
 * @author Artur Gilyazov
 * Репозиторий для хранения пользователей
 **/


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneById(Long id);
}
