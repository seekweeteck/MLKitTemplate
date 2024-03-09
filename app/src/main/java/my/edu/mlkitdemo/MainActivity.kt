package my.edu.mlkitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.google.mlkit.nl.smartreply.SmartReply
import com.google.mlkit.nl.smartreply.TextMessage

class MainActivity : AppCompatActivity() {
    //TODO 2: Declare module level variables
    //String array and adapter for listViewMessage
    val arrayMessage = ArrayList<String>()
    lateinit var arrayAdapterMessage : ArrayAdapter<*>

    //ML Kit smart reply client
    val smartReply = SmartReply.getClient()
    val conversation = ArrayList<TextMessage>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Linking UI to code
        val buttonSend: Button = findViewById(R.id.buttonSend)
        val buttoReply: Button = findViewById(R.id.buttonReply)
        val editTextMessage: EditText = findViewById(R.id.editTextMessage)
        val editTextReply: EditText = findViewById(R.id.editTextReply)
        val listView: ListView = findViewById(R.id.listViewMessage)

        arrayAdapterMessage = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayMessage)
    }
}