import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
public final class TimeController {
    public static int max_time_lesson(ArrayList<String> LessonsList, ArrayList<Integer> Wasted_time) {
        Map<String, Integer> LessonsMap = new HashMap<>();
        for (int a = 0; a < LessonsList.size(); a++) {
            final int b = a;
            LessonsMap.putIfAbsent(LessonsList.get(a), 0);
            LessonsMap.computeIfPresent(LessonsList.get(a), (key, oldValue) -> oldValue + Wasted_time.get(a) );
        }
        return Collections.max(LessonsMap.entrySet(), Map.Entry.comparingByValue() ).getValue();
    }
}
