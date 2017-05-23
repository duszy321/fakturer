package eu.programisci.Test.towar.repository;


import eu.programisci.Test.towar.ob.TowarOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITowarRepository extends JpaRepository<TowarOB,Long> {
    //SELECT * FROM towary WHERE nazwa LIKE '%woda%' ORDER BY id ASC
    //List<TowarOB> findByNazwaLikeIgnoreCaseOrderByIdAsc(String aNazwa);

    //@Query("SELECT t FROM TowarOB t WHERE UPPER(t.nazwa) LIKE UPPER(CONCAT('%',:nazwa,'%')) ORDER BY t.id ASC")
    //List<TowarOB> findByNazwaZawiera(@Param("nazwa") String aNazwa);
}
