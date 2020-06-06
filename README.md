# estudo-kotlin
Estudo baseado no canal do [Dougals Motta](https://www.youtube.com/playlist?list=PLPs3nlHFeKTr-aDDvUxU971rPSVTyQ6Bn)


# Estutura básica de uma função

```
  // estrutura básica de uma função (corpo de bloco)
  fun max(a: Int, b: Int): Int {
      return if (a > b) a else b
  }

```

````
   // simplificando a função (corpo de expressão)
  fun maxSimplificada(a: Int, b: Int) = if (a > b) a else b
```

string template
````
    val nome: String  = "Casa"

    println("Hello $nome!")

    // string templete expressão
    println("Soma é: ${soma(1 , 2)} ")

    fun soma(a:Int, b: Int) = a +b
```

