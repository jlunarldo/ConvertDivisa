package converUnit.project.business.interactor;

import converUnit.project.business.Entities.Divisa;
import converUnit.project.business.service.DivisaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DivisaRecord  {
    @Autowired
    private DivisaService divisaService;

    public Divisa getDivisa(int id ){
        return divisaService.getDivisa(id);
    }

    public List<Divisa> getAllDivisa(){
        return divisaService.getAllDivisa();
    }

}
