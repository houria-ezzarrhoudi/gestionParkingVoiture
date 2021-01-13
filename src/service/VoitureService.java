/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Voiture;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class VoitureService {
     public int save(Voiture voiture, List<Voiture> voitures) {
        Voiture loadedVoiture = findById(voiture.getId(), voitures);
        if (loadedVoiture != null) {
            return -1;
        } else {
            voitures.add(voiture);

            return 1;
        }
    }


    public Voiture findById(String id, List<Voiture> voitures) {
        for (int i = 0; i < voitures.size(); i++) {
            Voiture voiture = voitures.get(i);
            if (voiture.getId().equals(id)) {
                return voiture;
            }
        }

        return null;

    }

    public Voiture findByMatricule(String matricule, List<Voiture> voitures) {
        for (int i = 0; i < voitures.size(); i++) {
            Voiture voiture = voitures.get(i);
            if (voiture.getMatricule().equals(matricule)) {

                return voiture;
            }
        }
        return null;

    }

}
