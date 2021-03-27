package Sn.Aicha.service.console;


import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;
import Sn.Aicha.domain.Operation;
import Sn.Aicha.service.DisplayService;

public class ConsoleDisplayService implements DisplayService {


    public void afficherBienvenu() {
        System.out.println("Bienvenu chez nous");
    }

    public void afficherMenuPrincipal() {
        System.out.println("> l  lister les types comptes  ");
    }
    public void afficherMenu() {
        System.out.println("> o  lister les types d'operation  ");
    }
    public void afficherMenuClient() {
        System.out.println("> c  lister les clients ");
    }


    public void afficherListeServices(Client[] prestations) {
        System.out.println("Les services disponibles sont:");
        for (int i = 0; i < prestations.length; i++) {
            Client prestation = prestations[i];
            System.out.println(String.format("> %s %s", prestation.getId(), prestation.getNom()));
        }
    }
    @Override
    public void afficherClientRetrait(Client[] clients) {

            Client aicha=new Client("SY","Aissata","09875264758959");
        Client amina=new Client("Thiam","Mamadou","098000264758959");
        Client alou=new Client("Sow","Aliou","0987874758959");
        Client awa=new Client("Ba","Awa","098004758959");
            Client[] clients1=new Client[]{
                    aicha,amina,alou,awa

            };
            System.out.println("Les clients qui ont fait du retrait::");
            for (int i = 0; i < clients1.length; i++) {
                Client client = clients1[i];
                System.out.println(String.format("> %s %s %s ", client.getNom(), client.getPrenom(),client.getNci()));
            }

        }

    @Override
    public void afficherClientVersemnet(Client[] clients) {
        Client aicha=new Client("SY","Aissata","09875264758959");
        Client amina=new Client("Thiam","Mamadou","098000264758959");
        Client alou=new Client("Sow","Aliou","0987874758959");
        Client awa=new Client("Ly","Yombe","098008758959");
        Client yombe=new Client("Ba","Awa","098004758959");
        Client oumar=new Client("Thiam","Oumar","0984758959");
        Client[] clients1=new Client[]{
                aicha,amina,alou,awa,yombe,oumar

        };
        System.out.println("Les clients qui ont fait du versement:");
        for (int i = 0; i < clients1.length; i++) {
            Client client = clients1[i];
            System.out.println(String.format("> %s %s %s ", client.getNom(), client.getPrenom(),client.getNci()));
        }

    }

    @Override
    public void afficherListerCode() {
        Compte compte1=new Compte(1,"CE0001","450000.0");
        Compte compte2=new Compte(2,"CE0002","350000.0");
        Compte compte3=new Compte(3,"CE0003","250000.0");
        Compte compte4=new Compte(4,"CE0004","12000.0");
        Compte compte5=new Compte(5,"CE0005","234500.0");
        Compte compte6=new Compte(6,"CE0006","458900.0");
        Compte[] clients1=new Compte[]{
               compte1,compte2,compte3
                ,compte4,compte5,
                compte6

        };
        System.out.println("Les comptes epargnes:");
        for (int i = 0; i < clients1.length; i++) {
            Compte client = clients1[i];
            System.out.println(String.format("> %s %s %s ",client.getId(), client.getCode(),client.getSolde()));
        }

    }

    @Override
    public void afficherListerCodeCourant() {
        Compte compte1=new Compte(1,"C00001","200000.0");
        Compte compte2=new Compte(2,"C00002","350000.0");
        Compte compte3=new Compte(3,"C00003","430000.0");
        Compte compte4=new Compte(4,"C00004","500000.0");
        Compte compte5=new Compte(5,"C00005","230000.0");
        Compte compte6=new Compte(6,"C00006","10000000.0");
        Compte[] clients1=new Compte[]{
                compte1,compte2,compte3
                ,compte4,compte5,
                compte6

        };
        System.out.println("Les comptes courants:");
        for (int i = 0; i < clients1.length; i++) {
            Compte client = clients1[i];
            System.out.println(String.format("> %s %s %s ",client.getId(), client.getCode(),client.getSolde()));
        }
    }

    @Override
    public void afficherClients(Client[] clients) {
            Client aicha=new Client("SY","Aissata","09875264758959");
            Client amina=new Client("Thiam","Mamadou","098000264758959");
            Client alou=new Client("Sow","Aliou","0987874758959");
            Client awa=new Client("Ly","Yombe","098008758959");
            Client yombe=new Client("Ba","Awa","098004758959");
            Client oumar=new Client("Thiam","Oumar","0984758959");
            Client[] clients1=new Client[]{
                    aicha,amina,alou,awa,yombe,oumar

            };
            System.out.println("Les clients :");
            for (int i = 0; i < clients1.length; i++) {
                Client client = clients1[i];
                System.out.println(String.format("> %s %s %s ", client.getNom(), client.getPrenom(),client.getNci()));
            }
    }


    public void afficherListeServices(Compte[] comptes) {
        Compte Epargne=new Compte("e","Epargne");
        Compte Courant=new Compte("c","Courant");
        Compte[]comptes1=new Compte[]{
                Epargne,Courant
        };
        System.out.println("Les comptes :");
      for (int i = 0; i < comptes1.length; i++) {
            Compte compte = comptes1[i];
            System.out.println(String.format("> %s %s", compte.getCode(), compte.getTypeCompte()));
        }
    }

    @Override
    public void afficherOperation(Operation[] operations) {
        Operation op=new Operation("v","Versement");
        Operation op1=new Operation("r","Retrait");
       
        Operation[]operations1=new Operation[]{
               op,op1
        };
        System.out.println("Les types d'operation :");
        for (int i = 0; i < operations1.length; i++) {
            Operation compte = operations1[i];
            System.out.println(String.format("> %s %s",compte.getCode(),  compte.getTypeOperation()));
        }

    }

    public void afficherCompte(Client client, Compte[] comptes) {
        Compte Epargne=new Compte("e","Epargne");
        Compte Courant=new Compte("c","Courant");
        Compte[]comptes1=new Compte[]{
                Epargne,Courant
        };

        for (int i = 0; i < comptes.length; i++) {
            Compte compte = comptes1[i];
            System.out.println(String.format("> Nom:%s Prenom:%s Nci:%s ", client.getId(), client.getPrenom(), client.getNom()));
        }
    }

    @Override
    public void afficherclient(Client[] clients) {
       Client alou=new Client("Sy","Aissata","098000264758959");

        Client[] clients1=new Client[]{
                alou
        };
        System.out.println("Le client de ce compte est:");
        for (int i = 0; i < clients1.length; i++) {
            Client client = clients1[i];
            System.out.println(String.format("> Nom:%s Prenom:%s Nci:%s ", client.getNom(), client.getPrenom(),client.getNci()));
        }


    }

    @Override
    public void afficherclient1(Client[] client) {
      for (int i = 0; i < client.length; i++) {
          System.out.println("Les clients: ");
           Client client1 = client[i];
            System.out.println(String.format(">%d %s %s %s ",  client1.getNom(), client1.getPrenom(),client1.getNci()));
        }
       /* Client aicha=new Client("Thiam","Mamadou","098000264758959");

        Client[] clients1=new Client[]{
                aicha
        };
        System.out.println("Le client de ce compte est: ");
        for (int i = 0; i < clients1.length; i++) {
            Client client2 = clients1[i];
            System.out.println(String.format("> Nom:%s Prenom:%s Nci:%s ", client2.getNom(), client2.getPrenom(),client2.getNci()));
        }*/

    }

    @Override
    public void afficherclient2(Client[] client) {
        Client aicha=new Client("Ly","Yombe","098008758959");

        Client[] clients1=new Client[]{
                aicha
        };
        System.out.println("Le client de ce compte est:");
        for (int i = 0; i < clients1.length; i++) {
            Client client2 = clients1[i];
            System.out.println(String.format("> Nom:%s Prenom:%s Nci:%s  ", client2.getNom(), client2.getPrenom(),client2.getNci()));
        }
    }

    @Override
    public void afficherclient3(Client[] client) {
        Client aicha=new Client("Ba","Awa","098004758959");

        Client[] clients1=new Client[]{
                aicha
        };
        System.out.println("Le client de ce compte est:");
        for (int i = 0; i < clients1.length; i++) {
            Client client2 = clients1[i];
            System.out.println(String.format("> Nom:%s Prenom:%s Nci:%s  ", client2.getNom(), client2.getPrenom(),client2.getNci()));
        }
    }

    @Override
    public void afficherclient4(Client[] client) {
        Client aicha=new Client("Sow","Aliou","0987874758959");

        Client[] clients1=new Client[]{
                aicha
        };
        System.out.println("Le client de ce compte est: ");
        for (int i = 0; i < clients1.length; i++) {
            Client client2 = clients1[i];
            System.out.println(String.format("> Nom:%s Prenom:%s Nci:%s ", client2.getNom(), client2.getPrenom(),client2.getNci()));
        }
    }

    @Override
    public void afficherclient5(Client[] client) {
        Client aicha=new Client("Thiam","Oumar","0984758959");

        Client[] clients1=new Client[]{
                aicha
        };
        System.out.println("Le client de ce compte est: ");
        for (int i = 0; i < clients1.length; i++) {
            Client client2 = clients1[i];
            System.out.println(String.format("> Nom:%s Prenom:%s Nci:%s ", client2.getNom(), client2.getPrenom(),client2.getNci()));
        }
    }


    public void afficherOptionInconnue() {
        System.out.println("Choix inconnu");
    }
}
