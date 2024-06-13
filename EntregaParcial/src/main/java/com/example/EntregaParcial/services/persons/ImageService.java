package com.example.EntregaParcial.services.persons;

import com.example.EntregaParcial.entities.persons.Image;
import com.example.EntregaParcial.repositories.persons.ImageRepository;
import com.example.EntregaParcial.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ImageService extends BaseService<Image, Long> {
    public ImageService(ImageRepository imageRepository){
        super(imageRepository);
    }
}
