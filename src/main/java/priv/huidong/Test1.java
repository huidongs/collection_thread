package priv.huidong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: collection
 * @auther: HuiDong
 * @date: 2020/7/6 13:52
 * @description:
 */
public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("剃须刀");
        list.add("皮鞋");
        list.add("口红");
        System.out.println(list.get(0));

        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("huidong",666);
        hashMap.put("huidong2",999);
        hashMap.put("huidong",666);
        System.out.println(hashMap);
    }
}
