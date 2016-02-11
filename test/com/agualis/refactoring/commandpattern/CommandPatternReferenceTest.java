package com.agualis.refactoring.commandpattern;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CommandPatternReferenceTest {

    Command anyCommand;
    Command concreteCommandA;
    Receiver receiver;
    public static final Receiver NOT_USED = null;

    @Test public void
    concreteCommandIsACommand() {

        ConcreteCommandA concreteCommandA = new ConcreteCommandA(NOT_USED);
        ConcreteCommandB concreteCommandB = new ConcreteCommandB();

        assertThat(concreteCommandA instanceof Command, is(true));
        assertThat(concreteCommandB instanceof Command, is(true));
    }

    @Test public void
    executingACommandPerformsReceiverSAction() {

        new Client().init();

        new Invoker().load(anyCommand).invoke();

        verify(receiver).action();
    }

    private class Invoker {

        Command command;

        public Invoker load(Command command) {
            this.command = command;
            return this;
        }

        public void invoke() {
            command.execute();
        }
    }

    private class Client {

        public void init(){
            receiver = mock(Receiver.class);
            anyCommand = new ConcreteCommandA(receiver);
        }
    }
}
