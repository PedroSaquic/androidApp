**¿Que carpeta crea android studio y para que sirven?**
main/, crea todo el codigo y recursos de la app 
  java/, contiene codigo fuente (Kotlin/java)
  res/, tiene los recursos de la app(imagenes, iconos, logos)
idea/, configuracion del IDE

**¿Que es compose?**
es una forma de crear interfaz/pantalla que se conecta y actualiza con UI mas rapido usando lenguaje kotlin en vez de XML que es mas lento y codigo repetitivo

**¿Que es el archivo build.gradle(Module) y como habilita compose?**
es el archivo de configuracion de proyecto que indica que version, lenguaje y librerias se utilizaran.
habilita compose agregandolo en el archvio buld.gradle
buildFeatures {
        compose = true
    }
**¿Que es la arquitectura MVVM?**
es una forma de organizar una aplicacion android con Model-View-ViewModel, donde el Model nos administra los datos y configuraciones y el View es lo que el 
usuario ve atravez de la interfaz, el ViewModel es quien se encarga de procesar los datos antes de mostrarselos al usuario

**¿Que es ViewModel?**
crea un puente entre el Model(datos) y el View(UI), guarda y gestiona los datos y se encarga de la logica de la interfaz

**¿Que es LiveData?**
ayuda a actualizar datos e informacion que se muestra en UI de forma rapida y sin realizar actualizaciones manuales

**¿Qué librerías se necesitan para trabajar con ViewModel y LiveData dentro de Compose?**
ViewModel (implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.8.6")
LiveData (implementation "androidx.compose.runtime:runtime-livedata")
