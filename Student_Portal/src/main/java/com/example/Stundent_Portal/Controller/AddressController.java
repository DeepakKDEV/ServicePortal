package com.example.Stundent_Portal.Controller;

import com.example.Stundent_Portal.Model.Address;
import com.example.Stundent_Portal.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("post")
        public String postAddress(@RequestBody List<Address> pAddress){
            return  addressService.postAddress(pAddress);
    }
    @GetMapping("get/address")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }

    @DeleteMapping("delete/{id}")
    public  String deleteAddress(@PathVariable  Long id){
        return addressService.deleteAddress(id);
    }

    @PutMapping("update/address/id/{id}")
    public String updateAddress(@PathVariable Long id, @RequestParam String myLandmark){
      return   addressService.updateAddress(id,myLandmark);
    }


}
