
public class Practice5 {
    public static int solution(int[] height) {

        int left = 0; // 가장 왼쪽 벽에 위치한 인덱스
        int right = height.length - 1; // 배열 갯수가 9개라면, 인덱스값은 0부터 시작이기에 -1
        int maxArea = 0; // 가장 큰 면적을 연산해서 담아둘 변수

        while (left < right) { // ex) left = 0, right = 8
            int x = (right - left); // x축
            int y = height[left] < height[right] ? height[left] : height[right]; // 물이 넘치면 안되기 때문에 더 작은 쪽 기둥에 맞춰야 함
            int curArea = x * y; // 현재 면적
            maxArea = maxArea > curArea ? maxArea : curArea; // 3항연산자 max가 cur 보다 크면 max 그대로, cur가 max보다 크면 cur을 max에 넣는다

            curArea = x * Math.min(height[left], height[right]); // 이렇게 해도 더 작은 값을 빼줌
            maxArea = Math.max(maxArea, curArea); // 이 둘중에 큰 수를 넘겨줌

            if (height[left] < height[right]) {
                left++; // left가 더 작았으면 left를 오른쪽으로 한칸 이동한다는 뜻
            } else {
                right--; // 아니면 right를 왼쪽으로 한칸 이동한다는 뜻
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}
