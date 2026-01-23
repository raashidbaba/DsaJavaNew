package leetcodeEasy

class DestinationCity {
    fun destCity(paths: List<List<String>>): String {
        val startCities = HashSet<String>()

        for (path in paths) {
            startCities.add(path[0])
        }

        for (path in paths) {
            val endCity = path[1]
            if (!startCities.contains(endCity)) {
                return endCity
            }
        }

        return ""
    }
}