package com.travelpedia.api.contactus.service;

//import com.travelpedia.api.UserModel.UserModel;
//import com.travelpedia.api.UserRepository.UserRepository;
//import com.travelpedia.api.UserService.UserService;
import com.travelpedia.api.AuthModel.User;
import com.travelpedia.api.AuthRepository.UserRepository;
import com.travelpedia.api.contactus.model.ContactusModel;
import com.travelpedia.api.contactus.repository.ContactUsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContactusServiceImpl implements ContactusService {
 @Autowired
 ContactUsRepository cr;
 @Autowired
 UserRepository ur;
    @Override
    public ContactusModel createContactus(ContactusModel contactus) {
        return cr.save(contactus);
    }

    @Override
    public List<ContactusModel> getTickets(Long userId) {
        User um = ur.findById(userId).get();
        return cr.getByUser(um);
    }

}
