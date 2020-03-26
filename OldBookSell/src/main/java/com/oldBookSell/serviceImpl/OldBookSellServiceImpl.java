package com.oldBookSell.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.oldBookSell.dto.OldBookSellDTO;
import com.oldBookSell.model.Address;
import com.oldBookSell.model.UserDetails;
import com.oldBookSell.repository.UserDetailRepository;
import com.oldBookSell.service.OldBookSellServices;


@Service
public class OldBookSellServiceImpl implements OldBookSellServices{

	@Autowired
	UserDetailRepository userDetailRepository;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public OldBookSellDTO createUser(OldBookSellDTO odlBookSellDTO) {
		

		UserDetails userDetails=new UserDetails();
		userDetails.setFirst_name(odlBookSellDTO.getFirstName());
		userDetails.setLast_name(odlBookSellDTO.getLastName());
		userDetails.setMobile_number(odlBookSellDTO.getMobileNumber());
		userDetails.setEmail(odlBookSellDTO.getEmail());
		userDetails.setPassword(bcryptEncoder.encode(odlBookSellDTO.getPassword()));
		userDetails.setRole(odlBookSellDTO.getRole());
		
		Address addressObj=new Address();
		
		addressObj.setAddress(odlBookSellDTO.getAddress());
		addressObj.setAddress2(odlBookSellDTO.getAddress2());
		addressObj.setDistrict(odlBookSellDTO.getDistrict());
		addressObj.setLocation(odlBookSellDTO.getLocation());
		addressObj.setPostal_code(odlBookSellDTO.getPinCode());
		addressObj.setState(odlBookSellDTO.getState());
		
		userDetails.setAddress(addressObj);
		userDetailRepository.save(userDetails);
		
		return odlBookSellDTO;
	}

}
