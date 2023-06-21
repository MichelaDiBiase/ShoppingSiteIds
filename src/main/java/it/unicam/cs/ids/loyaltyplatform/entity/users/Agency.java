package it.unicam.cs.ids.loyaltyplatform.entity.users;

import it.unicam.cs.ids.loyaltyplatform.models.IUser;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "agencies")
public class Agency implements IUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,
			unique = true)
	private String name;
	@Column(nullable = false,
			unique = true)
	private String email;
	@Column(nullable = false)
	private String password;

	public Agency(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}