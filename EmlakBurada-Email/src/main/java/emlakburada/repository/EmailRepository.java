package emlakburada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emlakburada.model.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {

}
