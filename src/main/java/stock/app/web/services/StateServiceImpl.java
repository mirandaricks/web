package stock.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.app.web.models.State;
import stock.app.web.repositories.StateRepository;

@Service
public class StateServiceImpl implements StateService {

  @Autowired
  private StateRepository stateRepository;

  public StateServiceImpl(StateRepository stateRepository) {
    this.stateRepository = stateRepository;
  }

  @Override
  public State insertState(State state) {
    return stateRepository.save(state);
  }

  @Override
  public State updateState(Long id, State state) {
    if(stateRepository.existsById(id)){
      state.setId(id);
      return stateRepository.save(state);
    }
    return null;
  }

  @Override
  public void deleteState(Long id) {
    stateRepository.deleteById(id);
  }
  @Override
  public List<State> findAllState() {
    return stateRepository.findAll();
  }

  @Override
  public State findByIdState(Long id) {
    return stateRepository.findById(id).orElse(null);
  }

}
