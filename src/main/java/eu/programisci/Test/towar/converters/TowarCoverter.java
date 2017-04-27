package eu.programisci.Test.towar.converters;

import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.dto.TowarForTableDTO;
import eu.programisci.Test.towar.ob.TowarOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TowarCoverter {

    public TowarDTO obToDto(TowarOB in) {
        TowarDTO out = new TowarDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setCenaNetto(in.getCenaNetto());
        out.setJednostkaMiary(in.getJednostkaMiary());
        out.setPkwiu(in.getPkwiu());
        out.setVat(in.getVat());
        return out;
    }

    public TowarOB dtoToOb(TowarDTO in) {
        TowarOB out = new TowarOB();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setCenaNetto(in.getCenaNetto());
        out.setJednostkaMiary(in.getJednostkaMiary());
        out.setPkwiu(in.getPkwiu());
        out.setVat(in.getVat());
        return out;
    }


    public List<TowarForTableDTO> towarObToTowarForTable(List<TowarOB> inList) {
        if (inList == null) {
            return null;
        }
        List<TowarForTableDTO> outList = new ArrayList<>();
        for (TowarOB in : inList) {
            outList.add(towarObToTowarForTable(in));
        }
        return outList;
    }

    private TowarForTableDTO towarObToTowarForTable(TowarOB in) {
        TowarForTableDTO out = new TowarForTableDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setCenaNetto(in.getCenaNetto());
        out.setJednostkaMiary(in.getJednostkaMiary());
        out.setPkwiu(in.getPkwiu());
        out.setVat(in.getVat());
        return out;
    }
}
