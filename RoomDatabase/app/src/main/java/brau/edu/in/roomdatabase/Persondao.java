package brau.edu.in.roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao

public interface Persondao {
    @Insert
    void insert(Person p);
    @Query("select*from person")
    List<Person>getAll();
    @Delete
    void delete(Person p);
}
