package converUnit.project.business.Expose;

import converUnit.project.business.Entities.Divisa;
import converUnit.project.business.interactor.DivisaRecord;
import converUnit.project.business.service.DivisaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetController {

    @Autowired
    private DivisaRecord divisaRecord;

    @GetMapping("/getDivisa/{id}")
    public Divisa getDivisa(@PathVariable int id){

        Divisa algo= divisaRecord.getDivisa(id);
        return algo;
    }
    @GetMapping("/getAllDivisa")
    public List<Divisa> getAllDivisa(){
        return divisaRecord.getAllDivisa();
    }
}
