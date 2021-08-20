package com.stage2.task_14;

import java.util.logging.Logger;

public class Spy implements MailService {
    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getFrom() == "Austin Powers") {
                logger.warning("WARN: Detected target mail correspondence: from" + mail.getFrom() + "to" +
                        mail.getTo() + ((MailMessage) mail).getMessage());
            } else {
                logger.info("INFO: Usual correspondence: from" + mail.getFrom() + "to" +
                        mail.getTo() + ((MailMessage) mail).getMessage());
            }
        }

        return mail;
    }
}
