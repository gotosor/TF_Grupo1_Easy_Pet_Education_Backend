package com.example.mascotas.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mascotas.dto.DtoArticulo;
import com.example.mascotas.dto.DtoArticuloR;
import com.example.mascotas.entity.Administrador;
import com.example.mascotas.entity.Animal;
import com.example.mascotas.entity.Articulo;
import com.example.mascotas.entity.Articulo_Animal;
import com.example.mascotas.entity.Fuente;
import com.example.mascotas.entity.Fuente_Articulo;
import com.example.mascotas.entity.Seccion;
import com.example.mascotas.repository.AnimalRepository;
import com.example.mascotas.repository.ArticuloRepository;
import com.example.mascotas.repository.Articulo_AnimalRepository;
import com.example.mascotas.repository.FuenteRepository;
import com.example.mascotas.repository.Fuente_ArticuloRepository;
@Service
public class ArticuloServiceImpl implements ArticuloService{

    @Autowired
    private FuenteRepository fuenteRepository;

    @Autowired
    private Articulo_AnimalRepository articulo_AnimalRepository;

    @Autowired
    private Fuente_ArticuloRepository fuente_ArticuloRepository;

    @Autowired
    private ArticuloRepository articuloRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<DtoArticulo> listaArticulos() {
        try {
            List<DtoArticulo> DtoarticuloFinal = new ArrayList<DtoArticulo>();
            List<Articulo_Animal> articuloAnimalFinal = articulo_AnimalRepository.findAll();
            List<Fuente_Articulo> aritucloFuenteFinal = fuente_ArticuloRepository.findAll();
            List<Articulo> articulos = articuloRepository.findAll();

            for (Articulo articulo : articulos) {
                DtoArticulo dtoArticulo = new DtoArticulo();
                dtoArticulo.setCArticulo(articulo.getCArticulo());
                List<Fuente> fuentes = new ArrayList<Fuente>();
                List<Integer> animales = new ArrayList<Integer>();
                
                for (Fuente_Articulo fuente_Articulo : aritucloFuenteFinal) {
                    if(fuente_Articulo.getCArticulo().getCArticulo().equals(articulo.getCArticulo())){
                        Fuente fuente1 = new Fuente();
                        Optional<Fuente> fuenteh = fuenteRepository.findById(fuente_Articulo.getCFuente().getCFuente());
                        
                        fuente1.setCFuente(fuente_Articulo.getCFuente().getCFuente());
                        fuente1.setNFuente(fuenteh.get().getNFuente());
                        fuente1.setDFechaPublicacion(fuenteh.get().getDFechaPublicacion());
                        fuente1.setNAutor(fuenteh.get().getNAutor());
                        fuente1.setTContenido(fuenteh.get().getTContenido());
                        fuentes.add(fuente1);
                    }
                }
                dtoArticulo.setListFuente(fuentes);

                for (Articulo_Animal articulo_Animal : articuloAnimalFinal) {
                    if(articulo_Animal.getArticulo_CArticulo().getCArticulo().equals(articulo.getCArticulo())){
                        Integer animalre = articulo_Animal.getAnimal_CAnimal().getCAnimal();
                        animales.add(animalre);
                    }
                }
                dtoArticulo.setlAnimals(animales);

                dtoArticulo.setCAdmin(articulo.getCAdmin().getCAdmin());
                dtoArticulo.setNArticulo(articulo.getNArticulo());
                dtoArticulo.setTDescripcion(articulo.getTDescripcion());
                dtoArticulo.setDFechaArticulo(articulo.getDFechaArticulo());
                dtoArticulo.setCSeccion(articulo.getCSeccion().getCSeccion());
                DtoarticuloFinal.add(dtoArticulo);
            }
            return DtoarticuloFinal;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
 
       
    }

    @Override
    public DtoArticulo agregarArticulos(DtoArticulo articulo) {
        try {
            DtoArticulo articuloFinal = new DtoArticulo();
            Articulo articulo2 = new Articulo();
            Seccion seccion2 = new Seccion();
            seccion2.setCSeccion(articulo.getCSeccion());
            Administrador administrador2 = new Administrador();
            administrador2.setCAdmin(articulo.getCAdmin());

            articulo2.setNArticulo(articulo.getNArticulo());
            articulo2.setTDescripcion(articulo.getTDescripcion());
            articulo2.setDFechaArticulo(articulo.getDFechaArticulo());
            articulo2.setCSeccion(seccion2);
            articulo2.setCAdmin(administrador2);

            Articulo articulo3 = articuloRepository.save(articulo2);
            for (Fuente fuente : articulo.getListFuente()) {
                Fuente fuenteN = fuenteRepository.save(fuente);
                Fuente_Articulo fuente_Articulo = new Fuente_Articulo();
                fuente_Articulo.setCFuente(fuenteN);
                fuente_Articulo.setCArticulo(articulo3);
                fuente_ArticuloRepository.save(fuente_Articulo);
            }
    
            for (Integer lanimal : articulo.getlAnimals()) {
                Articulo_Animal articulo_Animal = new Articulo_Animal();
                Animal animal2 = new Animal();
                animal2.setCAnimal(lanimal);
                articulo_Animal.setAnimal_CAnimal(animal2);
                articulo_Animal.setArticulo_CArticulo(articulo3);
                articulo_AnimalRepository.save(articulo_Animal);
            }

            articuloFinal.setCArticulo(articulo3.getCArticulo());
            articuloFinal.setNArticulo(articulo3.getNArticulo());
            articuloFinal.setTDescripcion(articulo3.getTDescripcion());
            articuloFinal.setDFechaArticulo(articulo3.getDFechaArticulo());
            articuloFinal.setCSeccion(articulo3.getCSeccion().getCSeccion());
            articuloFinal.setCAdmin(articulo3.getCAdmin().getCAdmin());
            articuloFinal.setListFuente(articulo.getListFuente());
            articuloFinal.setlAnimals(articulo.getlAnimals());
            return articuloFinal;
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    
    }

    

    @Override
    public List<DtoArticuloR> listArticulosC() {
        try {
            List<DtoArticuloR> DtoarticuloFinal = new ArrayList<DtoArticuloR>();
            List<Articulo_Animal> articuloAnimalFinal = articulo_AnimalRepository.findAll();
            List<Fuente_Articulo> aritucloFuenteFinal = fuente_ArticuloRepository.findAll();
            List<Articulo> articulos = articuloRepository.findAll();

            for (Articulo articulo : articulos) {
                DtoArticuloR dtoArticulo = new DtoArticuloR();
                dtoArticulo.setCArticulo(articulo.getCArticulo());
                List<Fuente> fuentes = new ArrayList<Fuente>();
                List<Animal> animales = new ArrayList<Animal>();
                
                for (Fuente_Articulo fuente_Articulo : aritucloFuenteFinal) {
                    if(fuente_Articulo.getCArticulo().getCArticulo().equals(articulo.getCArticulo())){
                        Fuente fuente1 = new Fuente();
                        Optional<Fuente> fuenteh = fuenteRepository.findById(fuente_Articulo.getCFuente().getCFuente());
                        
                        fuente1.setCFuente(fuente_Articulo.getCFuente().getCFuente());
                        fuente1.setNFuente(fuenteh.get().getNFuente());
                        fuente1.setDFechaPublicacion(fuenteh.get().getDFechaPublicacion());
                        fuente1.setNAutor(fuenteh.get().getNAutor());
                        fuente1.setTContenido(fuenteh.get().getTContenido());
                        fuentes.add(fuente1);
                    }
                }
                dtoArticulo.setListFuente(fuentes);

                for (Articulo_Animal articulo_Animal : articuloAnimalFinal) {
                    if(articulo_Animal.getArticulo_CArticulo().getCArticulo().equals(articulo.getCArticulo())){
                        Animal animal1 = new Animal();
                        Optional<Animal> animalh = animalRepository.findById(articulo_Animal.getAnimal_CAnimal().getCAnimal());
                        animal1.setCAnimal(animalh.get().getCAnimal());
                        animal1.setNAnimal(animalh.get().getNAnimal());
                        animal1.setTDescripcion(animalh.get().getTDescripcion());
                        animal1.setImagenCmb(animalh.get().getImagenCmb());
                        animal1.setImagenAli(animalh.get().getImagenAli());
                        animal1.setImagenHig(animalh.get().getImagenHig());
                        animal1.setImagenAmb(animalh.get().getImagenAmb());
                        animal1.setImagenRep(animalh.get().getImagenRep());
                        animal1.setTextoAli(animalh.get().getTextoAli());
                        animal1.setTextoHig(animalh.get().getTextoHig());
                        animal1.setTextoAmb(animalh.get().getTextoAmb());
                        animal1.setTextoRep(animalh.get().getTextoRep());
                        animal1.setCCategoria_Animales(animalh.get().getCCategoria_Animales());
                        animal1.setTDescripcion(animalh.get().getTDescripcion());
                        animales.add(animal1);
                    }
                }
                dtoArticulo.setlAnimals(animales);

                dtoArticulo.setCAdmin(articulo.getCAdmin().getCAdmin());
                dtoArticulo.setNArticulo(articulo.getNArticulo());
                dtoArticulo.setTDescripcion(articulo.getTDescripcion());
                dtoArticulo.setDFechaArticulo(articulo.getDFechaArticulo());
                dtoArticulo.setCSeccion(articulo.getCSeccion().getCSeccion());
                DtoarticuloFinal.add(dtoArticulo);
            }
            return DtoarticuloFinal;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
}
