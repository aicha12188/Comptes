package Sn.Aicha.service;

import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;
import Sn.Aicha.domain.Operation;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();
    void afficherMenu();
    void afficherMenuClient();
    void afficherClientRetrait(Client[] clients);
    void afficherClientVersemnet(Client[] clients);
    void afficherListerCode();
    void afficherListerCodeCourant();
    void afficherClients(Client[] clients);

    void afficherListeServices(Compte[] comptes);

void afficherOperation(Operation[] operations);
    void afficherCompte(Client client, Compte[] comptes);

void afficherclient(Client[] client);
void afficherclient1(Client[] client);
void afficherclient2(Client[] client);
void afficherclient3(Client[] client);
void afficherclient4(Client[] client);
void afficherclient5(Client[] client);

    void afficherOptionInconnue();
}
