package com.stage2.task_14;

public class Thief implements MailService{
    private int minPackageCost;
    private int sumOfCosts;

    public Thief(int minPackageCost) {
        this.minPackageCost = minPackageCost;
        sumOfCosts = 0;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() > minPackageCost) {
                sumOfCosts += ((MailPackage) mail).getContent().getPrice();
                return new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of" +
                        ((MailPackage) mail).getContent(), 0));
            }
        }

        return mail;
    }

    public int getStolenValue() {
        return sumOfCosts;
    }
}
