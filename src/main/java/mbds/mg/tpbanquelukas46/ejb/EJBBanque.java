/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbds.mg.tpbanquelukas46.ejb;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import mg.mbds.TPBanqueLukas.entities.CompteBancaire;

/**
 *
 * @author lukas
 */
@Singleton
@Startup
public class EJBBanque {

    @EJB
    private GestionnaireCompte gestionnaireCompte;

    @PostConstruct
    public void init() {
        gestionnaireCompte.creerCompte(new CompteBancaire("John Lennon", 150000));
        gestionnaireCompte.creerCompte(new CompteBancaire("Paul McCartney", 950000 ));
        gestionnaireCompte.creerCompte(new CompteBancaire("Ringo Starr", 20000));
        gestionnaireCompte.creerCompte(new CompteBancaire("Georges Harrisson", 100000));

    }
}
