package com.example.Stundent_Portal.Service;

import com.example.Stundent_Portal.Model.Address;
import com.example.Stundent_Portal.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String postAddress(List<Address> pAddress) {
        iAddressRepo.saveAll(pAddress);
        return "added Address";
    }

    public List<Address> getAddress() {
        return iAddressRepo.findAll();
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "delete address";
    }
    public String updateAddress(Long id, String myLandmark) {
        Address address=iAddressRepo.findById(id).orElse(null);
        if(address!=null){
            address.setLandmark(myLandmark);
            iAddressRepo.save(address);
        }
        return  "update";
    }
}
