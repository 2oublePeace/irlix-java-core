package com.stage2.task_14;

public static class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getContent() == "weapons"
                    || mailPackage.getContent().getContent() == "banned substance") {
                new IllegalPackageException("Запрещенная посылка!");
            } else if (mailPackage.getContent().getContent().contains("stones")) {
                new StolenPackageException("Посылка была украдена!");
            }
        }

        return mail;
    }
}
