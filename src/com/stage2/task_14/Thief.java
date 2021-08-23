package com.stage2.task_14;

public static class Thief implements MailService{
    private int minPackageCost;
    private int sumOfCosts;

    public Thief(int minPackageCost) {
        this.minPackageCost = minPackageCost;
        sumOfCosts = 0;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getPrice() > minPackageCost) {
                sumOfCosts += mailPackage.getContent().getPrice();
                return new MailPackage(mail.getFrom(), mail.getTo(),
                        new Package("stones instead of" + mailPackage.getContent(), 0));
            }
        }

        return mail;
    }

    public int getStolenValue() {
        return sumOfCosts;
    }
}
