package awakelab.g6.grupal.model.persistence.mapper;

import awakelab.g6.grupal.model.domain.dto.Administrative;
import awakelab.g6.grupal.model.persistence.entity.Administrativo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdministrativeMapper {
  @Mappings({
          @Mapping(source ="id", target ="id"),
          @Mapping(source ="run", target ="run"),
          @Mapping(source ="nombre", target ="name"),
          @Mapping(source ="apellido", target ="lastName"),
          @Mapping(source ="correo", target ="mail"),
          @Mapping(source ="area", target ="area"),
          @Mapping(source ="usuarioId", target ="userId"),
  })
  Administrative toAdministrative(Administrativo administrativo);
  List<Administrative> toAdministratives(List<Administrativo> administrativos);
  @InheritInverseConfiguration
  Administrativo toAdministrativo(Administrative administrative);
}
