import java.util.Map;
import java.util.HashMap;

public class firstDuplicate {

  int firstDuplicate(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
        if (map.get(arr[i]) == 2) {
          return arr[i];
        }
      } else {
        map.put(arr[i], 1);
      }
    }
    return -1;
  }
}
