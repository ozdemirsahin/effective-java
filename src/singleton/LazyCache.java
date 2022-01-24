package singleton;

import java.util.HashMap;
import java.util.Map;

public class LazyCache implements Cache{
    private static LazyCache instance;
    private Map<Object, Object> map;

    private LazyCache() {
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

    public static LazyCache getInstance(){
        if(instance==null)
            instance=new LazyCache();

        return instance;
    }
}
