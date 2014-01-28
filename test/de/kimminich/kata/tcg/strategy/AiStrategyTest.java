package de.kimminich.kata.tcg.strategy;

import de.kimminich.kata.tcg.Card;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AiStrategyTest {

    Strategy strategy;

    @Test
    public void strategyShouldReturnNoCardIfInsufficientManaForAnyHandCard() {
        strategy = new AiStrategy();

        assertThat(strategy.nextCard(1, Card.list(2, 3, 8)), is(noCard()));
    }

    private Optional<Card> noCard() {
        return Optional.empty();
    }
}