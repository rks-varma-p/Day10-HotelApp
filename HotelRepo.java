package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
