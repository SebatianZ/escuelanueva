package pe.com.escuelanueva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.escuelanueva.entity.ApoderadoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long> {

    @Query("select a from ApoderadoEntity a where a.estado=1")
    List<ApoderadoEntity> findAllCustom();
}
