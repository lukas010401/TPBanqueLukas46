/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mbds.mg.tpbanquelukas46.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mbds.mg.tpbanquelukas46.ejb.GestionnaireCompte;
import mg.mbds.TPBanqueLukas.entities.CompteBancaire;

/**
 *
 * @author lukas
 */
@Named(value = "listeComptes")
@ViewScoped
public class ListeComptes implements Serializable {

    private List<CompteBancaire> compteList;
    
    @EJB
    private GestionnaireCompte gestionnaireCompte;

    /**
     * Creates a new instance of CompteBean
     */
    public ListeComptes() {
    }

    public List<CompteBancaire> getAllComptes() {
        if (compteList == null) {
            compteList = gestionnaireCompte.getAllComptes();
        }
        return compteList;
    }
}
