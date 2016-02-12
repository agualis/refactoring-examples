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

    ConcreteCommandA concreteCommandA;
    Receiver receiver;

    @Before
    public void client(){
        receiver = mock(Receiver.class);
        concreteCommandA = new ConcreteCommandA(receiver);
    }

    @Test public void
    concreteCommandIsACommand() {
        ConcreteCommandB concreteCommandB = new ConcreteCommandB();

        assertThat(concreteCommandA instanceof Command, is(true));
        assertThat(concreteCommandB instanceof Command, is(true));
    }

    @Test public void
    executingACommandPerformsReceiversAction() {

        invoker();

        verify(receiver).action();
    }

    private void invoker() {
        concreteCommandA.execute();
    }
}
