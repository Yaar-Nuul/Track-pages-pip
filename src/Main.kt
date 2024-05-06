//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val trackVisitedPage = PageTracker()
    trackVisitedPage.trackVisitedPages("Home")
    trackVisitedPage.trackVisitedPages("login")
    trackVisitedPage.trackVisitedPages("login")
    trackVisitedPage.trackVisitedPages("sign up")
    trackVisitedPage.trackVisitedPages("sign up")
    trackVisitedPage.trackVisitedPages("Home")
    trackVisitedPage.trackVisitedPages("goal")
    trackVisitedPage.trackVisitedPages("profile")
    trackVisitedPage.trackVisitedPages("goal")
    trackVisitedPage.trackVisitedPages("Home")
    trackVisitedPage.trackVisitedPages("Home")
    trackVisitedPage.trackVisitedPages("goal")
    trackVisitedPage.trackVisitedPages("profile")
    trackVisitedPage.trackVisitedPages("goal")
    trackVisitedPage.trackVisitedPages("Home")
    trackVisitedPage.trackVisitedPages("Home")
    trackVisitedPage.trackVisitedPages("to-do list")
    trackVisitedPage.trackVisitedPages("profile")
    trackVisitedPage.trackVisitedPages("achievements")
    trackVisitedPage.trackVisitedPages("Home")

    val topVisited = trackVisitedPage.getTopFiveMostVisited()
    println(topVisited)
//    println("Top 5 most visited : $topVisited")
//    topVisited.forEachIndexed{ index, pair ->
//        println("${index + 1}.${pair.first} was visted ${pair.second} times")
    }





class PageTracker(){
    private val pageVisits = mutableMapOf<String, Int>()
    fun trackVisitedPages(page: String){
        pageVisits[page] = pageVisits.getOrDefault(page, 0)+1

    }
fun getTopFiveMostVisited(): List<Pair<String, Int>>{
    return pageVisits.toList().sortedByDescending {it.second}.take(5)

}
}
