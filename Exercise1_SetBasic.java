import java.util.Set;
import java.util.HashSet;

public class Exercise1_SetBasic
{
    public static void main(String[] args)
    {
        // Set은 interface이고, 실제 객체는 HashSet으로 생성한다.
        Set<Integer> numbers = new HashSet<>();

        // 데이터 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 이미 존재하는 값 추가
        numbers.add(20);
        numbers.add(10);

        // Set 안의 모든 값 출력 - Set은 같은 값을 중복해서 저장하지 않음
        for (Integer number : numbers)
        {
            System.out.println(number);
        }
    }
}