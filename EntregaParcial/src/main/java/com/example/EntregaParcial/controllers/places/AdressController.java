package com.example.EntregaParcial.controllers.places;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.services.places.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domicilio")
public class AdressController extends BaseController<Adress, Long> {

    @Autowired
    private AdressService adressService;
    public AdressController(AdressService adressService){
        super(adressService);
    }

    @GetMapping("/localidad/{idLocality}")
    public ResponseEntity<List<Adress>> listByLocality(@PathVariable Long idLocality) throws Exception {
        List<Adress> adressList = adressService.listByLocalityId(idLocality);
        return ResponseEntity.ok(adressList);
    }

    @GetMapping("/provincia/{idProvince}")
    public ResponseEntity<List<Adress>> listByProvince(@PathVariable Long idProvince) throws Exception {
        List<Adress> adressList = adressService.listByProvinceId(idProvince);
        return ResponseEntity.ok(adressList);
    }

    @GetMapping("/pais/{idCountry}")
    public ResponseEntity<List<Adress>> listByCountry(@PathVariable Long idCountry) throws Exception {
        List<Adress> adressList = adressService.listByCountryId(idCountry);
        return ResponseEntity.ok(adressList);
    }

    @GetMapping("/client/{idClient}")
    public ResponseEntity<List<Adress>> listByClient(@PathVariable Long idClient) throws Exception {
        List<Adress> adressList = adressService.listByClientId(idClient);
        return ResponseEntity.ok(adressList);
    }
}
