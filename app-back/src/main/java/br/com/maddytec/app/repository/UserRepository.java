package br.com.maddytec.app.repository;

import br.com.maddytec.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
