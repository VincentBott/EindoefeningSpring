package eu.noelvaes.web;

import javax.validation.Valid;

import eu.noelvaes.repositories.GenresRepository;
import eu.noelvaes.repositories.VoorstellingenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import eu.noelvaes.entities.*;

import java.util.List;


@RestController
@RequestMapping(path = "/cultuurhuis")
public class EindoefeningSpringRestController {


   @Autowired
   private GenresRepository genresRepository;

   @Autowired
   private VoorstellingenRepository voorstellingenRepository;

   
   @GetMapping(path = "/voorstellingen/{id}", produces = {"application/json", "text/plain"})
   public Voorstelling getVoorstellingById(
         @PathVariable("id") long id) {

      return voorstellingenRepository.findById(id).get();
   }


   @GetMapping(path = "/voorstellingen/all", produces = {"application/json", "text/plain"})
   public String getAlleVoorstellingen() {

      return voorstellingenRepository.findAll().toString();
   }


/*
   @GetMapping(path = "/voorstellingen/genre/{id}", produces = {"application/json", "text/plain"})
   public String getVoorstellingenByGenre(long genreId) {

      return voorstellingenRepository.getVoorstellingenByGenre(genreId).toString();
   }
*/


   // Indien je geen xml teruggeeft heb je de VoorstellingList niet nodig: json kan zo ook lists terug geven
}
