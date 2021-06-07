#https://openjfx.io/openjfx-docs/#install-javafx
export PATH_TO_FX="/path/to/javafx-sdk-version/lib"
java --module-path $PATH_TO_FX:out --add-modules javafx.controls --module packt.addressbook.ui/packt.addressbook.ui.Main
