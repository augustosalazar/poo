package com.uninorte;

import java.util.ArrayList;

public class ExtensionBoard extends Card{
    private ArrayList<Card> cards;

    public ExtensionBoard(int id) {
        super(id);
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card, int slot) {
        if (cards.size() >= 3) {
            throw new RuntimeException("No se pueden agregar más de 3 tarjetas");
        }
        cards.add(slot, card);
    }

    public int getNumberOfDeviceCards() {
        int counter = 0;
        for (Card card : cards) {
            if (card instanceof DeviceCard) {
                counter++;
            }
            if (card instanceof ExtensionBoard) {
                ExtensionBoard extensionBoard = (ExtensionBoard) card;
                counter += extensionBoard.getNumberOfDeviceCards();
            }
        }
        return counter;
    }

    public int getNumberOfCards() {
        int counter = 0;
        for (Card card : cards) {
            if (card instanceof DeviceCard) {
                counter++;
            }
            if (card instanceof ExtensionBoard) {
                counter++;
                ExtensionBoard extensionBoard = (ExtensionBoard) card;
                counter += extensionBoard.getNumberOfCards();
            }
        }
        return counter;
    }
    
}
