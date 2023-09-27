package stock.app.web.services;

import java.util.List;

import stock.app.web.models.Cause;

public interface CauseService {
  Cause insertCause(Cause cause);
  Cause updateCause(Long id , Cause cause);
  void deleteCause(Long id);
  List<Cause> findAllCause();
  Cause findByIdCause(Long id);

}
