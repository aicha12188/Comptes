package Sn.Aicha;

import Sn.Aicha.controller.MenuController;
import Sn.Aicha.domain.Client;
import Sn.Aicha.domain.Compte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.process();
    }
}

