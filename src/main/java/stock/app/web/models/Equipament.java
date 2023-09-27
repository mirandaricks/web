package stock.app.web.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipaments")
public class Equipament implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String data_cad;
  private Long customer;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
  private String mac;
  @ManyToOne
  @JoinColumn(name = "state_id")
  private State state;
  @ManyToOne
  @JoinColumn(name = "cause_id")
  private Cause cause;

  @ManyToOne
  @JoinColumn(name = "technician_id")
  private Technician tech;
  private String obs;

  public Equipament(Long id, String data_cad, Long customer, Product product, String mac, State state, Cause cause,
      Technician tech, String obs) {
    this.id = id;
    this.data_cad = data_cad;
    this.customer = customer;
    this.product = product;
    this.mac = mac;
    this.state = state;
    this.cause = cause;
    this.tech = tech;
    this.obs = obs;
  }

  public Equipament() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getData_cad() {
    return data_cad;
  }

  public void setData_cad(String data_cad) {
    this.data_cad = data_cad;
  }

  public Long getCustomer() {
    return customer;
  }

  public void setCustomer(Long customer) {
    this.customer = customer;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public Cause getCause() {
    return cause;
  }

  public void setCause(Cause cause) {
    this.cause = cause;
  }

  public Technician getTech() {
    return tech;
  }

  public void setTech(Technician tech) {
    this.tech = tech;
  }

  public String getObs() {
    return obs;
  }

  public void setObs(String obs) {
    this.obs = obs;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Equipament other = (Equipament) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }



}
