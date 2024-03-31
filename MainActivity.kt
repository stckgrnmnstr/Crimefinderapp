import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputNames: EditText
    private lateinit var searchButton: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputNames = findViewById(R.id.input_names)
        searchButton = findViewById(R.id.search_button)
        resultText = findViewById(R.id.result_text)

        searchButton.setOnClickListener {
            val namesInput = inputNames.text.toString().split(",").map { it.trim() }
            val associatedNames = associateQuantizedPoints(namesInput)
            displayAssociatedNames(associatedNames)
        }
    }

    private fun associateQuantizedPoints(names: List<String>): List<Triple<String, String, String>> {
        // This function simulates associating names with criminal actions (replace with actual logic)
        val associatedNames = mutableListOf<Triple<String, String, String>>()
        for (name in names) {
            // Dummy data for demonstration
            val crime = "Robbery"
            val location = "New York City"
            associatedNames.add(Triple(name, crime, location))
        }
        return associatedNames
    }

    private fun displayAssociatedNames(associatedNames: List<Triple<String, String, String>>) {
        val sb = StringBuilder()
        for ((name, crime, location) in associatedNames) {
            sb.append("Name: $name, Crime: $crime, Location: $location\n")
        }
        resultText.text = sb.toString()
    }
}