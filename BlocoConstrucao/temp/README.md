Gerando arquivo.class:
----------------------
javac Classe.javac

Gerando arquivo.class personalizando diretório:
----------------------------------------------
javac -d nome_diretório packageA/ClasseA.java

Executando programa:
--------------------
java ClasseA

Executando programa especificando o classpath:
----------------------------------------------
java -cp nome_do_classpath packageA.ClasseA
java -classpath nome_do_classpath packageA.ClasseA
java --class-path nome_do_classpath packageA.ClasseA

Compilando com arquivos JAR:
----------------------------

No Windows, digite o seguinte:
------------------------------
java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar" myPackage.MyClass

E no macOS/Linux, você digita isto:
-----------------------------------
java -cp ".:/tmp/someOtherLocation:/tmp/myJar.jar" myPackage.MyClas


Criando Arquivo JAR:
--------------------

jar -cvf myNewFile.jar .
jar --create --verbose --file myNewFile.jar .

-c --create
-v --verbose
-f --file <fileName>

Como alternativa, você pode especificar um diretório em vez de usar o diretório atual:
--------------------------------------------------------------------------------------
jar -cvf myNewFile.jar -C dir .

Criando com arquivo manifest:
-----------------------------
jar -cvfm myJAR.jar manifest.txt -C dir .

Exemplo de arquivo manifest:
----------------------------
Manifest-Version: 1.0
Main-Class: packageb.ClasseB
