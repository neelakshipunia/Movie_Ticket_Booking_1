class MovieList {
    fun ShowMovieList() {
        var movieList = mutableMapOf<Int , String>()
        movieList[1] = "Harry Potter"
        movieList[2] = "War"
        movieList[3] = "Phir Hera Pheri"
        movieList[4] = "Fast And Furious"
        movieList[5] = "Inception"

        for((key,value) in movieList)
            println("$key -> $value")
        println("Enter The No. Corresponding to the Movie You Want to Watch: ")
        var MovieChoice = readLine()!!

        var obj1 = TheatreAndTiming(MovieChoice)
        obj1.DisplayTheatreAndTime()
    }
}