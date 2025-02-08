package com.example.demo.example.controller;

import com.example.demo.example.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class cloudAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
                //new CloudVendor("C1","vendor1",
          //      "address one", "321456");



    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "cloud vendor created successfully";
    }
@PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

    this.cloudVendor = cloudVendor;
    return "cloud vendor updated successfully";
}
@DeleteMapping
    public String deleteCloudVendorDetails(String vendorId)
{
    this.cloudVendor = null;
    return "cloud vendor deleted successfully";
}


}
