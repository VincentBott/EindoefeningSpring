package eu.noelvaes.repositories;
// enkele imports ...

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import eu.noelvaes.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// @Transactional
@Repository("voorstellingenRepository")
public interface VoorstellingenRepository extends JpaRepository<Voorstelling, Long> {


    public List<Voorstelling> getVoorstellingenByGenre(long genreId);
}