package Sn.Aicha.service.console;

import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;
import Sn.Aicha.domain.Operation;
import Sn.Aicha.repository.CompteRepository;
import Sn.Aicha.repository.OperationRepository;
import Sn.Aicha.repository.jdbc.clientdao;
import Sn.Aicha.service.DisplayService;
import Sn.Aicha.service.MenuService;

import java.util.Scanner;

public class ScannerMenuService implements MenuService {
    private final DisplayService displayService;
    private final Scanner scanner;
    private final clientdao clientRepository;
    private final CompteRepository compteRepository;
  private final OperationRepository operationRepository;
    public ScannerMenuService(DisplayService displayService,clientdao clientRepository, CompteRepository compteRepository, OperationRepository operationRepository) {
        this.displayService = displayService;
        this.clientRepository = clientRepository;
        this.compteRepository = compteRepository;
        this.operationRepository = operationRepository;
        this.scanner = new Scanner(System.in);

    }




    private String lireChoix() {
        return scanner.next();
    }

    private void afficherMenu( String choix) {
        displayService.afficherBienvenu();
        Compte[] comptes = compteRepository.getAll();
        if("l".equalsIgnoreCase(choix)){
            displayService.afficherListeServices(comptes);
           String idPrestation = scanner.next();
            Client[] clients = clientRepository.getAll();
            if("e".equalsIgnoreCase(idPrestation)){
                //displayService.afficherclient(clients);
                displayService.afficherListerCode();
                String idc = scanner.next();
                if("1".equalsIgnoreCase(idc )){
                    displayService.afficherclient(clients);
                }
                if("2".equalsIgnoreCase(idc )){
                    displayService.afficherclient(clients);
                }
                if("3".equalsIgnoreCase(idc )){
                    displayService.afficherclient2(clients);
                }
                if("4".equalsIgnoreCase(idc )){
                    displayService.afficherclient3(clients);
                }
                if("5".equalsIgnoreCase(idc )){
                    displayService.afficherclient4(clients);
                }
                if("6".equalsIgnoreCase(idc )){
                    displayService.afficherclient5(clients);
                }

            }
            if("c".equalsIgnoreCase(idPrestation)){
                displayService.afficherListerCodeCourant();
                String idc = scanner.next();
                if("1".equalsIgnoreCase(idc )){
                    displayService.afficherclient(clients);
                }
                if("2".equalsIgnoreCase(idc )){
                    displayService.afficherclient1(clients);
                }
                if("3".equalsIgnoreCase(idc )){
                    displayService.afficherclient2(clients);
                }
                if("4".equalsIgnoreCase(idc )){
                    displayService.afficherclient3(clients);
                }
                if("5".equalsIgnoreCase(idc )){
                    displayService.afficherclient4(clients);
                }
                if("6".equalsIgnoreCase(idc )){
                    displayService.afficherclient5(clients);
                }

            }

        }
        if ("o".equalsIgnoreCase(choix)){
            Operation[] operations = operationRepository.getAll();
            displayService.afficherOperation(operations);
            String idPrestation = scanner.next();
            Client[] clients = clientRepository.getAll();
            if("v".equalsIgnoreCase(idPrestation)){
                displayService.afficherClientVersemnet(clients);

            }
            if("r".equalsIgnoreCase(idPrestation)){
                displayService.afficherClientRetrait(clients);

            }


        }
        if ("c".equalsIgnoreCase(choix)){
            Client[] clients = clientRepository.getAll();
            displayService.afficherclient1(clients);
        }


        //afficher le menu inconnu
        else {
            displayService.afficherOptionInconnue();
        }
    }

    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
}
