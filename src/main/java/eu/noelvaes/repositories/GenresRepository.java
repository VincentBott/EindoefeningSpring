package eu.noelvaes.repositories;
//enkele imports ...


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;
import javax.transaction.Transactional;


import eu.noelvaes.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("genresRepository")
@Transactional
public interface GenresRepository extends JpaRepository<Genre, Long> {

}
