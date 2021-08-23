package com.stage2.task_14;

public static class UntrustworthyMailWorker implements MailService {
    private MailService[] mailServices;
    private RealMailService realMailService;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        realMailService = new RealMailService();
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable feedbackMail = mailServices[0].processMail(mail);

        for (int i = 1; i < mailServices.length; i++) {
            feedbackMail = mailServices[i].processMail(feedbackMail);
        }

        realMailService.processMail(feedbackMail);
        return feedbackMail;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }
}
