package eu.programisci.Test.kontrahent.converters;

import eu.programisci.Test.kontrahent.dto.KontrahentDTO;
import eu.programisci.Test.kontrahent.dto.KontrahentForTableDTO;
import eu.programisci.Test.kontrahent.ob.KontrahentOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KontrahentCoverter {

    public KontrahentDTO obToDto(KontrahentOB in) {
        KontrahentDTO out = new KontrahentDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }

    public KontrahentOB dtoToOb(KontrahentDTO in) {
        KontrahentOB out = new KontrahentOB();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }


    public List<KontrahentForTableDTO> kontrahentObToKontrahentForTable(List<KontrahentOB> inList) {
        if (inList == null) {
            return null;
        }
        List<KontrahentForTableDTO> outList = new ArrayList<>();
        for (KontrahentOB in : inList) {
            outList.add(kontrahentObToKontrahentForTable(in));
        }
        return outList;
    }

    private KontrahentForTableDTO kontrahentObToKontrahentForTable(KontrahentOB in) {
        KontrahentForTableDTO out = new KontrahentForTableDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }
}