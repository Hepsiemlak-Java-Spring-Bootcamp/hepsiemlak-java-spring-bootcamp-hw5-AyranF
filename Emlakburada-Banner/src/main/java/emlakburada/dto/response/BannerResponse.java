package emlakburada.dto.response;

import emlakburada.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BannerResponse {

	private int advertNo;
	private String phone;
	private int total;
	private Address address;

}