package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Astronaut succesfully landed to Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Astronaut succesfully landed to Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Astronaut succesfully landed to Saturn");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Astronaut succesfully home to Earth");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Astronaut succesfully landed to Jupiter");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Astronaut succesfully landed to Neptune");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Astronaut succesfully landed to Uranus");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Astronaut succesfully landed to Venus");
    }
}