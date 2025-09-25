package vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import model.Product
import kotlin.collections.first

class ProductViewModel : ViewModel() {

    private val _product = MutableLiveData(Product("Aufifonos", 21.99f))
    val product: LiveData<Product> get() = _product


    private val colors = listOf(
        0xFFE57373.toInt(),
        0xFF64B5F6.toInt(),
        0xFF81C784.toInt(),
        0xFFffd54F.toInt(),
        0xFFBA68C8.toInt()
    )

    private val _nameColor = MutableLiveData(colors.first())
    val nameColor: LiveData<Int> get() = _nameColor

    fun changeProduct(){
        val products = listOf(
            Product("Teclado Mecado", 49.99f),
            Product("Mouse Inalambrico", 15.50f),
            Product("Monitor 24 ",120.00f),
            Product("Laptop Gamer", 999.99f),
            Product("Smartwatch", 75.25f)
        )
            _product.value = products.random()
            _nameColor.value = colors.random()
    }
}