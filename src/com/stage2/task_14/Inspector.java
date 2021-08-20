package com.stage2.task_14;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getContent() == "weapons" ||
                    ((MailPackage) mail).getContent().getContent() == "banned substance") {
                new IllegalPackageException();
            } else if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                new StolenPackageException();
            }
        }

        return mail;
    }
}
