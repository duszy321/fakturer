package eu.programisci.Test.towar.api;

import eu.programisci.Test.towar.dto.TowarDTO;
import eu.programisci.Test.towar.dto.TowarForTableDTO;
import eu.programisci.Test.towar.ob.EJednostkaMiary;
import eu.programisci.Test.towar.service.ITowarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "/api/towar")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class TowarRestController {

    @Autowired
    private ITowarService towarService;

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TowarDTO findOne(@RequestParam("id") Long aId) {
        return towarService.findOne(aId);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TowarForTableDTO> findAll() {
        return towarService.findAllForTable();
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteOne(@RequestParam("id") Long aId) {
        towarService.deleteOne(aId);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TowarDTO save(@RequestBody TowarDTO aTowarDTO) {
        return towarService.save(aTowarDTO);
    }

    @RequestMapping(value = "/getJednostkaMiary", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<String> getJednostkaMiary() {
        List<String> names = Stream.of(EJednostkaMiary.values())
                .map(EJednostkaMiary::name)
                .collect(Collectors.toList());
        return names;
    }

    /*TODO Dodać datę utworzenia(TIMESTAMP) dla kontrahenta i towaru*/
}
