package neetcode150

    class TwoSumP2Sortedtion {
        fun twoSum(numbers: IntArray, target: Int): IntArray {

            var l = 0
            var r = numbers.size-1

            while(l<r){
                val currentSum = numbers[l]+numbers[r]

                when{
                    currentSum > target ->r--
                    currentSum < target ->l++
                    else -> return intArrayOf(l+1,r+1)

                }


            }
            return intArrayOf()

        }
    }
