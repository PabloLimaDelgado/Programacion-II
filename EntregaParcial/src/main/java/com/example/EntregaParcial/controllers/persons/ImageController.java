package com.example.EntregaParcial.controllers.persons;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.persons.Image;
import com.example.EntregaParcial.services.persons.ImageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imagenes")
public class ImageController extends BaseController<Image, Long> {
    public ImageController(ImageService imageService){
        super(imageService);
    }

}
