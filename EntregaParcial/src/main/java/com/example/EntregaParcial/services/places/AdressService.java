package com.example.EntregaParcial.services.places;

import com.example.EntregaParcial.entities.places.Adress;
import com.example.EntregaParcial.entities.places.Locality;
import com.example.EntregaParcial.entities.places.Province;
import com.example.EntregaParcial.repositories.places.AdressRepository;
import com.example.EntregaParcial.repositories.places.LocalityRepository;
import com.example.EntregaParcial.repositories.places.ProvinceRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdressService extends BaseService<Adress, Long> {
    @Autowired
    private AdressRepository adressRepository;
    @Autowired
    private LocalityRepository localityRepository;
    @Autowired
    private ProvinceRepository provinceRepository;

    public AdressService(AdressRepository adressRepository){
        super(adressRepository);
    }

    @Transactional
    public List<Adress> listByLocalityId(Long idLocality) throws Exception {
        try{
            return adressRepository.findAllByLocalityId(idLocality);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Adress> listByProvinceId(Long idProvince) throws Exception {
        try {
            List<Locality> localities = localityRepository.findAllByProvinceId(idProvince);
            List<Adress> adressList = new ArrayList<>();

            for (Locality locality : localities) {
                adressList.addAll(adressRepository.findAllByLocalityId(locality.getId()));
            }

            return adressList;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Adress> listByCountryId(Long idCountry) throws Exception {
        try {
            List<Province> provinces = provinceRepository.findAllByCountryId(idCountry);
            List<Locality> localities = new ArrayList<>();

            for(Province province : provinces){
                localities.addAll(localityRepository.findAllByProvinceId(province.getId()));
            }

            List<Adress> adressList = new ArrayList<>();

            for(Locality locality : localities){
                adressList.addAll(adressRepository.findAllByLocalityId(locality.getId()));
            }

            return adressList;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Adress> listByClientId(Long clientId) throws Exception {
        try {
            return adressRepository.findAllByClientId(clientId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
