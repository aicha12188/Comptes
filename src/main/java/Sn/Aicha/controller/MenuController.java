package Sn.Aicha.controller;


import Sn.Aicha.repository.ClientRepository;
import Sn.Aicha.repository.CompteRepository;
import Sn.Aicha.repository.OperationRepository;
import Sn.Aicha.repository.jdbc.*;
import Sn.Aicha.service.DisplayService;
import Sn.Aicha.service.MenuService;
import Sn.Aicha.service.console.ConsoleDisplayService;
import Sn.Aicha.service.console.ScannerMenuService;

/**
 * End point destiné aux clients
 * Deux fonctionnalités (services)
 * 1 - Afficher le menu au client : ConsoleDisplayService
 * 2 - Lire les choix du client et afficher le sous-menu correspondant : ScannerMenuService
 */
public class MenuController {
  private final  DisplayService displayService;
    private final MenuService scannerMenuService ;

    public MenuController(){
        displayService = new ConsoleDisplayService();
        DataSource dataSource = new MysqlDataSource();
     //   ClientRepository clientRepository = new clientdao(dataSource);
        ClientRepository clientRepository = new clientdao(dataSource);
        CompteRepository compteRepository = new ListeCompte();
        OperationRepository operationRepository=new ListeOperation();
        scannerMenuService = new ScannerMenuService(displayService, (clientdao) clientRepository, compteRepository, operationRepository);
    }



    public void process(){
        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        displayService.afficherMenu();
        displayService.afficherMenuClient();
        scannerMenuService.afficherMenu();
    }


}
