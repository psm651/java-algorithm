package programmers.no4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //최종이름 map으로 id,이름
        Map<String, String> mapping_name = new HashMap<>();
        String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] answer={};
        List<String> list = new ArrayList<>();
        for (String s : record) {
            if (s.split(" ").length>2&&(s.split(" ")[0].equals("Enter")||s.split(" ")[0].equals("Change"))) {
                mapping_name.put(s.split(" ")[1], s.split(" ")[2]);
            }
        }

        for (String s : record) {
            if (s.split(" ")[0].equals("Enter")) {
                list.add(mapping_name.get(s.split(" ")[1])+"님이 들어왔습니다.");
            }
            if (s.split(" ")[0].equals("Leave")) {
                list.add(mapping_name.get(s.split(" ")[1])+"님이 나갔습니다.");
            }
        }
        answer = list.toArray(new String[list.size()]);
        System.out.println(answer);

    }
}
