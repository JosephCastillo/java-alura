package com.swapi.model;

public record Film(
        String title,
        int episode_id,
        String opening_crawl,
        String director,
        String producer,
        String release_date
) {
    @Override
    public String toString(){
        return """
                -----------------------------------------------------
                >> Película: %s
                >> Episódio: %d
                >> Director: %s
                >> Productor: %s
                >> Fecha de estreno: %s
                -----------------------------------------------------
                Texto incial:
                %s
                """.formatted(title, episode_id, director, producer, release_date, opening_crawl);
    }
}
