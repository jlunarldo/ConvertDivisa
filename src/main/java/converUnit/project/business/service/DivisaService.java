package converUnit.project.business.service;


import converUnit.project.business.Entities.Divisa;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DivisaService {

    public Divisa getDivisa(int id);
    public List<Divisa> getAllDivisa();
}
