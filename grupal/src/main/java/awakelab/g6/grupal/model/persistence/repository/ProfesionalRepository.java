package awakelab.g6.grupal.model.persistence.repository;

import awakelab.g6.grupal.model.persistence.entity.Profesional;
import awakelab.g6.grupal.model.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional,
        Integer> {
  boolean existsByUsuarioId(int id);

}
