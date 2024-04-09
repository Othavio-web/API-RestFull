package curso.api.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;



@Entity
@Table(name = "Role")
@SequenceGenerator(name = "seq_role", sequenceName = "seq_role", allocationSize = 1, initialValue = 1)
public class Role implements GrantedAuthority{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_role")
	private long ID;
	
	private String NomeRole;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}
}
