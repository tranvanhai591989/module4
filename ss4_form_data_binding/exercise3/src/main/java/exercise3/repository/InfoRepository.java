package exercise3.repository;

import exercise3.model.Info;

import java.util.List;

public interface InfoRepository {
    List<Info> getAll();

    void create(Info info);

    Info findId(String id);

    void update(String id, Info info);

    String[] getBirthYear();

    String[] getGender();

    String[] getNational();

    String[] getTransportType();

    String[] getInputDay();

    String[] getInputMonth();

    String[] getInputYear();

    String[] getOutDay();

    String[] getOutMonth();

    String[] getOutYear();
}
