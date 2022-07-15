package mail.repository;

import mail.model.Mail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepositoryImpl implements MailRepository {
    @Override
    public String[] languageList() {
        String[] languageList = {"English", "Vietnamese", "Japanese", "Chinese"};
        return languageList;
    }

    @Override
    public Integer[] pageSize() {
        Integer[] pageSize = new Integer[]{5, 10, 15, 25, 50, 100};
        return pageSize;
    }

    public static List<Mail> mailList = new ArrayList<>();
    public static String[] languageList = new String[]{"English", "Vietnamese","Japanese","Chinese"};
    public static Integer[] pageSize = new Integer[]{5,10,15,25,50,100};

    static {
        mailList.add(new Mail(1,"English", 5, "Disable", "quang nam"));
        mailList.add(new Mail(2,"Japanese", 50, "enable", "quang nam"));
        mailList.add(new Mail(3,"Vietnamese", 25, "enable", "quang nam"));
        mailList.add(new Mail(4,"Chinese", 15, "enable", "quang nam"));
    }


    @Override
    public List<Mail> findAll() {
        return mailList;
    }

    @Override
    public Mail findById(int id) {
        for (Mail mail: mailList) {
            if (id==mail.getId()){
                return mail;
            }
        }
        return null;
    }

    @Override
    public void update(Mail mail) {
        for (Mail item:mailList) {
            if (mail.getId()==item.getId()){
                item.setLanguage(mail.getLanguage());
                item.setPageSize(mail.getPageSize());
                item.setSignature(mail.getSignature());
                item.setSpamsFilter(mail.getSpamsFilter());
            }
        }

    }
}
