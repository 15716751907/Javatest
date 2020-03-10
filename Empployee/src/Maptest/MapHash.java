package Maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHash {
    /*
    public  V put(K key, V value)：添加一个键值对儿。返回被替换的本来value值。
    public  V remove(Object obj)：根据键，删除对应的键值对儿。返回被删掉的
    value值。
    public  V get(Object obj)：根据键，获取对应的value值。
    default V getOrDefault (Object key, V defaultValue) :返回指定键映射到的值，如
    果此映射不包含该键的映射，则返回 defaultValue。
    public Set<K> keySet()：获取所有的键的集合。（值不重复）
    public Collection<V> values()：获取所有的值的集合。（值可能重复）
     */
    public static void  main(String[] args){
        Map<String,String> linpengtest=new HashMap<>();
        linpengtest.put("T0001","张鹏");
        linpengtest.put("T0002","张秀梅");
        String result=linpengtest.put("T0003","孔玉华");
        System.out.println(result); //结果为null  在使用put时，若指定的key不存在,则没有这个键的值,则返回为null
        String result1=linpengtest.put("T0001","谁打");
        System.out.println(result1);//结果为张鹏,在使用put时,若指定的key值存在,则返回替换前的值
        System.out.println(linpengtest);  //{T0002=张秀梅, T0003=孔玉华, T0001=谁打}

        //remove
        String result2=linpengtest.remove("T0001");
        System.out.println(result2);//谁打    当使用remove时,则返回删除对应key的值
        System.out.println(linpengtest);//{T0002=张秀梅, T0003=孔玉华}
        result2=linpengtest.remove("1000");
        System.out.println(result2);//null  当使用remove时,对应key值不存在则返回为null
        System.out.println(linpengtest);//{T0002=张秀梅, T0003=孔玉华}

        //get
        result2=linpengtest.get("T0005");
        System.out.println(result2);//null  因为这个key值不存在,所以返回为null
        result2=linpengtest.get("T0003");
        System.out.println(result2);//孔玉华,若key值存在,则返回对应key的value

        result=linpengtest.getOrDefault("T0005","此key值不存在");
        System.out.println(result);//此key值不存在  当key值不存在的时候,则输出defaultValue的值

        //keyset
        Set<String> keys=linpengtest.keySet();
        for (String key:keys){
            System.out.println(key); //输出所有的key
        }
        //values
        Collection<String> values=linpengtest.values();
        for(String value:values){
            System.out.println(value);//输出所有的value
        }

        //同时输出key和value
        Set<Map.Entry<String,String>> all=linpengtest.entrySet();
        for (Map.Entry<String,String> e:all){
            String key=e.getKey();
            String value=e.getValue();
            System.out.println(key+"-----"+value);
        }

    }
}
