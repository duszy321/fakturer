package eu.programisci.Test.kontrahent.service;

import eu.programisci.Test.kontrahent.dto.KontrahentDTO;
import eu.programisci.Test.kontrahent.dto.KontrahentForTableDTO;

import java.util.List;

public interface IKontrahentService {

    KontrahentDTO findOne(Long id);

    List<KontrahentForTableDTO> findAllForTable();

    void deleteOne(Long id);

    KontrahentDTO save(KontrahentDTO kontrahentDTO);
}
