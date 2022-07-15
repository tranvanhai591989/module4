package mail.repository;

import mail.model.Mail;

import java.util.List;

public interface MailRepository {
    String[] languageList();
    Integer[] pageSize();


    List<Mail> findAll();
    Mail findById(int id);
    void update(Mail mail);


}
