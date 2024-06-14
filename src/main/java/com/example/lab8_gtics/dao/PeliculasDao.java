package com.example.lab8_gtics.dao;

import com.example.lab8_gtics.entity.Peliculas;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class PeliculasDao {
    public List<Peliculas> listarPeliculas(){
        RestTemplate restTemplate = new RestTemplateBuilder()
                .basicAuthentication("e88e146c70d821fcc6370975b5fe34bc","eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJlODhlMTQ2YzcwZDgyMWZjYzYzNzA5NzViNWZlMzRiYyIsInN1YiI6IjY2NjkwMjc4MTcwMGEwMGFhNTFkZGFkOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.1UdT-TDzIUQD4E7n0ED8O9C4YDI68Flm1QNCmq5_-JM")
                .build();
        ResponseEntity<Peliculas[]> response = restTemplate.getForEntity("https://api.themoviedb.org/3/movie/now_playing?language=en-US&page=1",Peliculas[].class);

        return Arrays.asList(response.getBody());
    }
}
