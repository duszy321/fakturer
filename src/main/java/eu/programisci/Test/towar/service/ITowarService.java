package eu.programisci.Test.towar.service;

import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.dto.TowarForTableDTO;

import java.util.List;

public interface ITowarService {

    TowarDTO findOne(Long id);

    List<TowarForTableDTO> findAllForTable();

    void deleteOne(Long id);

    TowarDTO save(TowarDTO towarDTO);
}
