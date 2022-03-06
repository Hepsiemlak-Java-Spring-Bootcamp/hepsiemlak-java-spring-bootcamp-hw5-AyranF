package emlakburada.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
	@CreationTimestamp
	private Date timestamp;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private UserType userType; // bireysel & kurumsal & yeniTip
	private String name;
	private String email;
	private String photo;
	private String bio;
	private String phone;
//	private Set<Advert> favoriIlanlar = new HashSet<>();
//	private List<Advert> yayinladigiIlanlar = new ArrayList<>();
//	private List<Message> mesajKutusu;
	public User(UserType userType, String name, String email) {
		super();
		this.userType = userType;
		this.name = name;
		this.email = email;
	}
}