package meupacote;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author t0081471 Leonardo Rocha
 */
@ManagedBean
@ViewScoped
public class Controller implements Serializable {

  public Controller() {
    super();
  }
  
  public String redirect() {
    return "pag2?faces-redirect=true";
  }
}
