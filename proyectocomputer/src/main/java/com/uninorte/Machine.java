package com.uninorte;

import java.util.ArrayList;

public class Machine {

    private ArrayList<Card> cards;

    public Machine() {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card, int slot) {
        if (cards.size() >= 3) {
            return;
        }
        cards.add(slot, card);
    }

    public void addCard(int slotOfExtensionCard, Card card, int slot) {
        Card extensionCard = cards.get(slotOfExtensionCard);
        if (!(extensionCard instanceof ExtensionBoard)) {
            return;
        }
        ExtensionBoard extensionBoard = (ExtensionBoard) extensionCard;
        extensionBoard.addCard(card, slot);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
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

    public Integer getNumberOfCards() {
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
