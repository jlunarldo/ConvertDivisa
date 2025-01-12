package converUnit.project.business.impl;

import converUnit.project.business.Entities.Divisa;
import converUnit.project.business.Repository.DivisaRepository;
import converUnit.project.business.service.DivisaService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DivisaImpl implements DivisaService {

    @Autowired
    private DivisaRepository divisaRepository;
    @Override
    public Divisa getDivisa(int id) {
        return divisaRepository.findById((long) id)
                .orElseThrow(() -> new EntityNotFoundException("Divisa with id " + id + " not found"));
    }

    @Override
    public List<Divisa> getAllDivisa(){
        return divisaRepository.findAll();
    }
}
