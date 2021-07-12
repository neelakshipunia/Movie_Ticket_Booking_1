class ScreenDetail {

    fun ScreenNumber(cinemaName : String, movieId : String) : String{
        var screenName = when(cinemaName){
            "PVR" -> {
                when(movieId){
                    "1" -> "S1"
                    "2" -> "S2"
                    "4" -> "S3"
                    "5" -> "S4"
                    else -> "Theatre Name Not In List"
                }
            }
            "Cinemax" -> {
                when(movieId){
                    "1" -> "S1"
                    "3" -> "S2"
                    "4" -> "S3"
                    else -> "Theatre Name Not In List"
                }
            }
            "Fun Cinemas" -> {
                when(movieId){
                    "1" -> "S1"
                    "2" -> "S2"
                    "3" -> "S3"
                    "4" -> "S4"
                    else -> "Theatre Name Not In List"
                }
            }
            "Cinepolis" -> {
                when(movieId){
                    "3" -> "S1"
                    "4" -> "S2"
                    "5" -> "S3"
                    else -> "Theatre Name Not In List"
                }
            }
            else -> "Invalid Theatre name Please Book again"
        }
        return screenName
    }
}