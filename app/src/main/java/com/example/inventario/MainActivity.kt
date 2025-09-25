package com.example.inventario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vm.ProductViewModel
import model.Product
import androidx.compose.runtime.livedata.observeAsState
import com.example.inventario.ui.theme.InventarioTheme


class MainActivity : ComponentActivity() {
    private val vm: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface{
                    MainScreen(vm = vm)
                }
            }
        }
    }
}
@Composable
fun MainScreen(vm: ProductViewModel){
    val product by vm.product.observeAsState(initial = Product("Producto inicial", 0.0f))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(text = "Nombre: ${product.name}")
        Text(text = "Precio: ${product.price}")

        Button(onClick = { vm.changeProduct()}){
            Text("Cambiar producto")
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
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MaterialTheme {
        val fakeVm = vm.ProductViewModel()
        MainScreen(vm = fakeVm)
    }
}