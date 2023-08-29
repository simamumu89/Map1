import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("田中", "香川県出身。25歳です。");
        map.put("鈴木", "大阪府出身。30歳です。");
        map.put("山田", "神奈川県出身。40歳です。");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}