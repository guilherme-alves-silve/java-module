set PATH_TO_FX="D:\javafx-sdk-11.0.2\lib"
javac --module-source-path src\main\java --module-path %PATH_TO_FX% --add-modules javafx.controls -d out/ --module packt.addressbook,packt.addressbook.ui,packt.sortutil,packt.contact
