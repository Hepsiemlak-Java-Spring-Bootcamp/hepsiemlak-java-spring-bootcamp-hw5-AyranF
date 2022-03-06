package emlakburada.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.dto.request.AddressRequest;
import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.model.Address;
import emlakburada.model.Banner;
import emlakburada.repository.BannerRepository;

@Service
public class BannerService extends BannerBaseService {

	@Autowired
	private BannerRepository repository;

	public List<BannerResponse> getAllBanners() {
		List<BannerResponse> bannerResponses = new ArrayList<>();
		repository.findAll().forEach(b -> bannerResponses.add(convertToBannerResponse(b)));
		return bannerResponses;
	}

	public BannerResponse saveBanner(BannerRequest request) {
		Banner banner = repository.save(convertToBanner(request));
		return convertToBannerResponse(banner);
	}
}
