package camp.codelab.networking

import com.google.gson.annotations.SerializedName

class City() {
    var title: String = ""
    var timezone: String = ""
    var time: String = ""
    @SerializedName("consolidated_weather")
    var weather: List<WeatherUpdate> = listOf()


}