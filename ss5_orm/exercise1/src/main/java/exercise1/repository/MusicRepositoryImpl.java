package exercise1.repository;

import exercise1.model.Music;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MusicRepositoryImpl implements MusicRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = entityManager.createQuery(
                "select m from Music as m", Music.class);
        return query.getResultList();
    }

    @Override
    @Modifying
    public void save(Music music) {
        entityManager.persist(music);
    }

    @Override
    @Modifying
    public void remove(int id) {
        Music music = findById(id);
        entityManager.remove(music);

    }

    @Override
    @Modifying
    public void update(int id, Music music) {
        entityManager.merge(music);
    }

    @Override
    public Music findById(int id) {
        return entityManager.createQuery(
                "select m from Music as m where m.id=:id ", Music.class).
                setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Music> findByName(String name) {
        TypedQuery<Music> query = entityManager.createQuery(
                "select m from Music as m where m.name like ?1", Music.class);
        return query.setParameter(1, name).getResultList();
    }

}
