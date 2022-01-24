package singleton;

import java.util.HashMap;
import java.util.Map;

public enum CacheSingleton implements Cache{
    INSTANCE;

    private Map<Object, Object> map= new HashMap<Object, Object>();

    @Override
    public void put(Object key, Object value) {
        map.put(key, value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

}
