package emlakburada.service;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.model.Address;
import emlakburada.model.Banner;

public class BannerBaseService {
	protected BannerResponse convertToBannerResponse(Banner banner) {
		BannerResponse response = new BannerResponse();
		response.setAdvertNo(banner.getAdvertNo());
		response.setPhone(banner.getPhone());
		response.setTotal(banner.getTotal());
		Address address = new Address();
		address.setAddresDesc(banner.getAddress().getAddresDesc());
		address.setDistrict(banner.getAddress().getDistrict());
		address.setProvince(banner.getAddress().getProvince());
		address.setId(banner.getAddress().getId());
		response.setAddress(address);
		return response;
	}

	protected Banner convertToBanner(BannerRequest request) {
		Banner banner = new Banner();
		banner.setUserId(request.getUserId());
		banner.setAdvertNo(request.getAdvertNo());
		banner.setPhone(request.getPhone());
		banner.setTotal(request.getTotal());
		Address address = new Address();
		address.setAddresDesc(request.getAddress().getAddresDesc());
		address.setDistrict(request.getAddress().getDistrict());
		address.setProvince(request.getAddress().getProvince());
		banner.setAddress(address);
		return banner;
	}
}
