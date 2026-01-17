package leetcodeEasy

class LargestThreeSameDigitNumber {
        fun largestGoodInteger(num: String): String {
            var best = ' '


            for (i in 0 until num.length - 2) {
                if (num[i] == num[i+1] && num[i] == num[i+2]) {
                    if (num[i] > best) {
                        best = num[i]
                    }
                }
            }
            return if (best == ' ') "" else best.toString().repeat(3)
        }
    }
