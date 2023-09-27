package stock.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.app.web.models.Cause;
import stock.app.web.repositories.CauseRepository;

@Service
public class CauseServiceImpl implements CauseService {

  @Autowired
  private CauseRepository causeRepository;

  public CauseServiceImpl(CauseRepository causeRepository) {
    this.causeRepository = causeRepository;
  }

  @Override
  public Cause insertCause(Cause cause) {
    return causeRepository.save(cause);
  }

  @Override
  public Cause updateCause(Long id, Cause cause) {
    if(causeRepository.existsById(id)){
      cause.setId(id);
      return causeRepository.save(cause);
    }
    return null;
  }

  @Override
  public void deleteCause(Long id) {
    causeRepository.deleteById(id);
  }
  @Override
  public List<Cause> findAllCause() {
    return causeRepository.findAll();
  }

  @Override
  public Cause findByIdCause(Long id) {
    return causeRepository.findById(id).orElse(null);
  }

}
