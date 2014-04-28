package it.redhat.playground.console.commands;

import it.redhat.playground.JDG;
import it.redhat.playground.console.UIConsole;
import it.redhat.playground.console.support.IllegalParametersException;

import java.util.Iterator;

public class PrimaryConsoleCommand implements ConsoleCommand {

    private static final String COMMAND_NAME = "primary";

    @Override
    public String command() {
        return COMMAND_NAME;
    }

    @Override
    public boolean execute(UIConsole console, JDG jdg, Iterator<String> args) throws IllegalParametersException {
        for(String key: jdg.primaryKeySet()) {
            console.println(key);
        }
        return true;
    }

    @Override
    public void usage(UIConsole console) {
        console.println(COMMAND_NAME);
        console.println("\t\tList all local valuesFromKeys for which this node is primary.");
    }
}
