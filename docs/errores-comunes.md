1. observeAsState no estaba siendo reconocido por el archivo
    val product by vm.product.observeAsState(initial = Product("Producto inicial", 0.0f))
-se probo varias versiones de implementacion
    ERROR EN CONSOLA: e: file:///C:/Users/pedro/AndroidStudioProjects/Inventario/app/src/main/java/com/example/inventario/MainActivity.kt:16:35 Unresolved reference 'observeAsState'. Ask Gemini
-se integro la implementacion en build.gradle.ktl
       implementation("androidx.compose.runtime:runtime-livedata:<versión>")
y se completo el import en MainActivity
-MainActivity puede reconocer sin errores observeAsState 
-se ejecuta el programa y se muestra nombre, precio y el boton cambiar producto en color violeta

2. al cambiar producto con el boton nombre y precio no cambia color
    en fun MainScreen se agrego
- val nameColor by vm.nameColor.observeAsState(initial = 0xFF000000.toInt())
    un color por defecto que va cambiando cuando se preciona el boton "cambiar producto"
- en cada Text - color = androidx.compose.ui.graphics.Color(nameColor)
    la aplicacion cambia el producto y el color del texto exitosamente
