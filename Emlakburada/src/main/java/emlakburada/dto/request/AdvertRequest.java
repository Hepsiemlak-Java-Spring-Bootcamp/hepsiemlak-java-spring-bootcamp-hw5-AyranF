package emlakburada.dto.request;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertRequest {
	private int userId;
	private String baslik;
	private BigDecimal fiyat;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private boolean aktifMi = false;
	
	public static AdvertRequest convertRequest(Object o) {
		String request = o.toString();
		request = request.replace(" ", "");
		request = request.substring(1,request.length()-1)+",";
		AdvertRequest advertRequest = new AdvertRequest();
		while(!request.equals("")) {
			String s = request.substring(0,request.indexOf("="));
			switch(s) {
			case "userId":
				advertRequest.setUserId(Integer.parseInt(request.substring(request.indexOf("=")+1,request.indexOf(","))));
				request = request.substring(request.indexOf(",")+1);
				break;
			case "baslik":
				advertRequest.setBaslik(request.substring(request.indexOf("=")+1,request.indexOf(",")));
				request = request.substring(request.indexOf(",")+1);
				break;
			case "fiyat":
				advertRequest.setFiyat(new BigDecimal(request.substring(request.indexOf("=")+1,request.indexOf(","))));
				request = request.substring(request.indexOf(",")+1);
				break;
			case "suresi":
				advertRequest.setSuresi(Integer.parseInt(request.substring(request.indexOf("=")+1,request.indexOf(","))));
				request = request.substring(request.indexOf(",")+1);
				break;
			}
		}
		return advertRequest;
	}
}