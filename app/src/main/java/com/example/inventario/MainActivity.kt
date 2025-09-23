package com.example.inventario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.inventario.ui.theme.InventarioTheme
import model.Product

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InventarioTheme {
                val p = Product("audifonos", 21.00f)
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "UMG",
                        Product = p,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }


        }
    }
}

@Composable
fun Greeting(name: String, Product: Product, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello $name!",
        )
        Text(
            text = "Product: ${Product.name}"
        )
        Text(
            text = "Product: ${Product.price}"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InventarioTheme {
        val p = Product("audifonos", 21.00f)
        Greeting("Android", Product = p)
    }
}