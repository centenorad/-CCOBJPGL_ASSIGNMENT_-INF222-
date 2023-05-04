package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Machine crusade succefully landed to Mercury...... Initiate program protocol in sequence...");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Machine crusade succefully landed to Mars...... Initiate program protocol in sequence...");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Machine crusade succefully landed to Saturn...... Initiate program protocol in sequence...");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Machine crusade succefully landed to Earth...... Initiate program protocol in sequence...");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Machine crusade succefully landed to Jupiter...... Initiate program protocol in sequence...");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Machine crusade succefully landed to Neptune...... Initiate program protocol in sequence...");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Machine crusade succefully landed to Uranus...... Initiate program protocol in sequence...");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Machine crusade succefully landed to Venus...... Initiate program protocol in sequence...");
    }
}