package eu.programisci.Test.towar.service;

import eu.programisci.Test.towar.converters.TowarCoverter;
import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.dto.TowarForTableDTO;
import eu.programisci.Test.towar.ob.TowarOB;
import eu.programisci.Test.towar.repository.ITowarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TowarServiceImpl implements ITowarService {

    @Autowired
    private ITowarRepository towarRepository;

    @Autowired
    private TowarCoverter towarCoverter;

    @Override
    public TowarDTO findOne(Long id) {
        TowarOB ob = towarRepository.findOne(id);
        TowarDTO dto = towarCoverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<TowarForTableDTO> findAllForTable() {
        List<TowarOB> obList = towarRepository.findAll();
        List<TowarForTableDTO> dtoList = towarCoverter.towarObToTowarForTable(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) {
        towarRepository.delete(id);
    }

    @Override
    public TowarDTO save(TowarDTO dto) {
        if (dto.getId() == null) {
            return towarCoverter.obToDto(create(dto));
        } else {
            return towarCoverter.obToDto(update(dto));
        }
    }

    private TowarOB create(TowarDTO dto) {
        TowarOB ob = towarCoverter.dtoToOb(dto);
        ob = towarRepository.save(ob);
        return ob;
    }

    private TowarOB update(TowarDTO dto) {
        TowarOB ob = towarRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setPkwiu(dto.getPkwiu());
        ob.setJednostkaMiary(dto.getJednostkaMiary());
        ob.setCenaNetto(dto.getCenaNetto());
        ob.setVat(dto.getVat());
        ob = towarRepository.save(ob);
        return ob;
    }
}
