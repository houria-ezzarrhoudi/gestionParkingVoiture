/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ClientService {

    public int save(Client client, List<Client> clients) {
        Client loadedClient = findByCin(client.getCin(), clients);
        if (loadedClient != null) {
            return -1;
        } else {
            clients.add(client);

            return 1;
        }
    }

    public List<Client> clientAbonnee(List<Client> clients) {
        List<Client> resultat = new ArrayList<>();
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.isAbonnee() == true) {
                resultat.add(client);
            }
        }
        return resultat;
    }

    public Client findById(String id, List<Client> clients) {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;

    }

    public Client findByCin(String cin, List<Client> clients) {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.getCin().equals(cin)) {
                return client;
            }
        }
        return null;

    }

    public int ajouterClientById(Client client, List<Client> clients) {

        Client loadedClient = findById(client.getId(), clients);
        if (loadedClient != null) {
            return -1;
        } else {
            clients.add(client);
            return 1;
        }

    }

    public int findIndexById(String id, List<Client> clients) {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.getId().equals(id)) {
                return i;
            }

        }
        return -1;
    }

    public int removeClientById(String id, List<Client> clients) {
        int index = findIndexById(id, clients);
        if (index != -1) {
            clients.remove(index);
            return 1;
        }
        return -1;
    }

}
