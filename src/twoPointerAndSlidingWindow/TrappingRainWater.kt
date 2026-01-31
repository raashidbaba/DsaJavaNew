package twoPointerAndSlidingWindow

class TrappingRainWater {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) return 0

        var l = 0
        var r = height.size - 1
        var leftMax = height[l]
        var rightMax = height[r]
        var res = 0

        while (l < r) {
            if (leftMax < rightMax) {
                l++
                leftMax = maxOf(leftMax, height[l])
                res += leftMax - height[l]
            } else {
                r--
                rightMax = maxOf(rightMax, height[r])
                res += rightMax - height[r]
            }
        }
        return res
    }
}