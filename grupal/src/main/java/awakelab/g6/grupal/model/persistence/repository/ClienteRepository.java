package awakelab.g6.grupal.model.persistence.repository;

import awakelab.g6.grupal.model.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
  boolean existsByUsuarioId(int id);
}
