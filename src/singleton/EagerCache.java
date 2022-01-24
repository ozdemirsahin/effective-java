package singleton;

import java.util.HashMap;
import java.util.Map;

public class EagerCache implements Cache{

    private static EagerCache instance= new EagerCache();
    private Map<Object, Object> map;

    private EagerCache() {
        map=new HashMap<Object, Object>();
    }

    @Override
    public void put(Object key, Object value) {
        map.put(key, value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    public static EagerCache getInstance(){
        return instance;
    }
}
