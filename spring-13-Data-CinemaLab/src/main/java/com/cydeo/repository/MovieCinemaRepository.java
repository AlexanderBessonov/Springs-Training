package com.cydeo.repository;

import com.cydeo.entity.Location;
import com.cydeo.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

  //  Write a derived query to read movie cinema with id
      Optional<MovieCinema> findById (Long id);// JPA Repository

  //  Write a derived query to count all movie cinemas with a specific cinema id
    Integer  countAllByCinemaId (Long id);//?????????????????????????????????????

    //Write a derived query to count all movie cinemas with a specific movie id
    Integer  countAllByMovieId (Long id);

    //Write a derived query to list all movie cinemas with higher than a specific date
    List<MovieCinema> findAllByDateTimeAfter(LocalDateTime dateTime);

    //Write a derived query to find the top 3 expensive movies
    List<MovieCinema> findFirst3ByOrderByMoviePriceDesc();

    //Write a derived query to list all movie cinemas that contain a specific movie name
    List<MovieCinema> findAllByMovieNameContaining(String name);

    //Write a derived query to list all movie cinemas in a specific location name
    List<MovieCinema> findAllByCinemaLocationName (String name);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date
    @Query("SELECT mc from MovieCinema mc WHERE mc.dateTime > ?1")
    List<MovieCinema>  fitchAllWithHigherSpecificDate(LocalDateTime dateTime);

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count all movie cinemas by cinema id
    @Query(value = "SELECT count(*) FROM movie_cinema  WHERE cinema_id = ?1  "
            , nativeQuery = true)
    Integer countByCinemaId(@Param("id") Long id);

    //Write a native query that returns all movie cinemas by location name
    @Query(value = "SELECT * FROM movie_cinema mc join cinema c on c.id = mc.cinema_id" +
            " join location l on l.id=c.location_id where l.name=?1",nativeQuery = true)
    List<MovieCinema> retrieveAllByLocationName(@Param("name") String Name);

}
