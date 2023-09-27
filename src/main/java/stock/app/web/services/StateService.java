package stock.app.web.services;

import java.util.List;

import stock.app.web.models.State;

public interface StateService {
  State insertState(State state);
  State updateState(Long id , State state);
  void deleteState(Long id);
  List<State> findAllState();
  State findByIdState(Long id);

}
