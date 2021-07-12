class TheatreAndTiming(movieChoice : String) {
    var movieId = movieChoice
    fun DisplayTheatreAndTime() {

        when(movieId){
            "1" -> {println(" PVR -> 10am , 2pm , 8pm \n" +
                    " Cinemax -> 9am , 6pm , 12am \n" +
                    " Fun Cinemas -> 11am , 4pm \n")
                DisplayBookingDetails()}
            "2" -> {println(" PVR -> 11am , 3pm \n" +
                    " Fun Cinemas -> 12am , 8pm ")
                DisplayBookingDetails()}
            "3" -> {println(" Cinemax -> 9am , 6pm , 12am \n" +
                    " Fun Cinemas -> 11am , 4pm \n" +
                    " Cinepolis -> 12pm, 6pm ")
                DisplayBookingDetails()}
            "4" -> {println(" PVR -> 9am , 2pm , 8pm \n" +
                    " Cinemax -> 9am , 6pm , 12am \n" +
                    " Fun Cinemas -> 11am , 4pm \n" +
                    " Cinepolis -> 2pm, 6pm ")
                DisplayBookingDetails()}
            "5" -> {println(" PVR -> 11am , 3pm \n" +
                    " Cinepolis -> 10am, 2pm, 6pm, 12am")
                DisplayBookingDetails()}
            else -> println("Invalid Choice ***** Please Enter The Choice from Available List")
        }

    }
    fun DisplayBookingDetails(){
        var (cinemaName, time) = getTheatreAndTiming()

        var screenName = getScreenDetail(cinemaName)

        var cinemaList = listOf<String>("PVR","Cinemax","Fun Cinemas", "Cinepolis" )
        // Check whether the theatre name is entered properly
        if(cinemaName in cinemaList) {
            println("Booking Details are Theatre Name -> $cinemaName \n" +
                    "Screen Number -> $screenName \n" +
                    "Show Time -> $time")
        }
        else println("Invalid theatre Name, Please Fill Again")
    }

    fun getScreenDetail(cinemaName: String): String {
        var obj = ScreenDetail()
        var screenName = obj.ScreenNumber(cinemaName, movieId)
        return screenName
    }

    fun getTheatreAndTiming(): Pair<String, String> {
        println("Please Enter the Cinema name (As given in the List)")
        var cinemaName = readLine()!!
        println("Please Enter Timing available in the List (eg: 11am)")
        var time = readLine()!!
        return Pair(cinemaName, time)
    }

}