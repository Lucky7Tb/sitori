package sitori.base;

import java.util.ArrayList;

/**
 *
 * @author lucky
 */
public abstract class Service<T> {
    
    public abstract ArrayList<T> getAll();
    
    public abstract T getOne(int id);
    
    public abstract void insert(T object);
    
    public abstract void update(int id, T object);
    
    public abstract void delete(int id);
    
}
