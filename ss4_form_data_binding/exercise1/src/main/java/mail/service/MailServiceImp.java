package mail.service;

import mail.model.Mail;
import mail.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailServiceImp implements MailService {
    @Autowired
    private MailRepository mailRepository;

    @Override
    public String[] languageList() {
        return mailRepository.languageList();
    }

    @Override
    public Integer[] pageSize() {
        return mailRepository.pageSize();
    }

    @Override
    public List<Mail> findAll() {
     return mailRepository.findAll();
    }

    @Override
    public void update(Mail mail) {

        mailRepository.update(mail);
    }

    @Override
    public Mail findById(int id) {
        return mailRepository.findById(id);
    }
}
