package mx.webfamous.erix.weightpicker

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.webfamous.erix.weightpicker.ui.theme.WeightPickerTheme
import mx.webfamous.erix.weightpickerui.components.ScaleStyle
import mx.webfamous.erix.weightpickerui.components.WeightPicker
import kotlin.math.log

class MainActivity : ComponentActivity() {
    private val initialWeight = 50
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeightPickerTheme {
                var value by remember { mutableStateOf(initialWeight) }
                Column(modifier = Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.5f),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.Bottom,
                        ) {
                            Text(
                                color = MaterialTheme.colorScheme.onSurface,
                                text = value.toString(),
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 100.sp
                            )
                            Text(
                                text = "kg",
                                style = MaterialTheme.typography.headlineSmall,
                            )
                        }
                    }
                    WeightPicker(
                        initialWeight = initialWeight,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                    ){
                        value = it
                    }
                }

            }


        }
    }
}

