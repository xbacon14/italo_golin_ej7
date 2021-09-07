package py.edu.facitec.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.facitec.entidad.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
