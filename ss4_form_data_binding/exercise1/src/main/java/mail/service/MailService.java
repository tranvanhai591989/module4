package mail.service;

import mail.model.Mail;

import java.util.List;

public interface MailService {

    List<Mail> findAll();
    public String[] languageList();
    public Integer[] pageSize();
    void update(Mail mail);
    Mail findById(int id);

}
