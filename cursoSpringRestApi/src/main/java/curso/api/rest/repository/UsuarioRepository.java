package curso.api.rest.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.api.rest.model.Usuario;
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
	@Query("select u from Usuario u where u.login = ?1")
	Usuario findUserByLogin(String login);
	
	@Modifying
	@Query(nativeQuery = true, value="Update usuario set token = ?1 where login = ?2")
	void atualizaTokenUser(String token, String login);
	
	
}
