package exercise3.repository;

import exercise3.model.Info;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InfoRepositoryImpl implements InfoRepository {
    static List<Info> infoList = new ArrayList<>();
    String[] year = new String[]{"1989", "1990", "...", "2022"};
    String[] gender = new String[]{"Male", "Female", "Other"};
    String[] nationality = new String[]{"Viet Nam", "Lao", "Campuchia"};
    String[] transportType = new String[]{"Phane", "Car", "Boat", "Other"};
    String[] inputDay = new String[]{"1", "2", "3", "4", "...", "30"};
    String[] outDay = new String[]{"1", "2", "3", "4", "...", "30"};
    String[] inputMonth = new String[]{"1", "2", "3", "4", "...", "12"};
    String[] outMonth = new String[]{"1", "2", "3", "4", "...", "12"};
    String[] inputYear = new String[]{"2019", "2020", "2021", "2022"};
    String[] outYear = new String[]{"2019", "2020", "2021", "2022"};

    static {
        infoList.add(new Info("1", "Hai", "1989", "Male", "Viet Nam", "205491912", "Car", "92h4-5577", "3", "1", "2", "2021", "2", "3", "2021", "Da Nang"));
    }


    @Override
    public List<Info> getAll() {
        return infoList;
    }

    @Override
    public void create(Info info) {
        infoList.add(info);
    }

    @Override
    public Info findId(String id) {
        Info info = new Info();
        for (int i = 0; i <infoList.size() ; i++) {
            if (id.equals(infoList.get(i).getId())){
                info = infoList.get(i);
            }
        }
        return info;
    }


    @Override
    public void update(String id, Info info) {
        for (int i = 0; i < infoList.size(); i++) {
            infoList.get(i).setId(info.getId());
            infoList.get(i).setName(info.getName());
            infoList.get(i).setBirthYear(info.getName());
            infoList.get(i).setGender(info.getGender());
            infoList.get(i).setNational(info.getNational());
            infoList.get(i).setIdCard(info.getIdCard());
            infoList.get(i).setTransportType(info.getTransportType());
            infoList.get(i).setTransportId(info.getTransportId());
            infoList.get(i).setSeat(info.getSeat());
            infoList.get(i).setInputDay(info.getInputDay());
            infoList.get(i).setInputMonth(info.getInputMonth());
            infoList.get(i).setInputYear(info.getInputYear());
            infoList.get(i).setOutDay(info.getOutDay());
            infoList.get(i).setOutMonth(info.getOutMonth());
            infoList.get(i).setOutYear(info.getOutYear());
            infoList.get(i).setOther(info.getOther());

        }

    }

    @Override
    public String[] getBirthYear() {
        return year;
    }

    @Override
    public String[] getGender() {
        return gender;
    }

    @Override
    public String[] getNational() {
        return nationality;
    }

    @Override
    public String[] getTransportType() {
        return transportType;
    }


    @Override
    public String[] getInputDay() {
        return inputDay;
    }

    @Override
    public String[] getInputMonth() {
        return inputMonth;
    }

    @Override
    public String[] getInputYear() {
        return inputYear;
    }

    @Override
    public String[] getOutDay() {
        return outDay;
    }

    @Override
    public String[] getOutMonth() {
        return outMonth;
    }

    @Override
    public String[] getOutYear() {
        return outYear;
    }
}
